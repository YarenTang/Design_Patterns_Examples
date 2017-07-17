package Builder.Scala

/**
  * Created by prefert on 2017/7/16.
  * case class 版
  */
case class AccountS(
                    val name: String ,
                    val nickname:  String ,
                    val age :Int
                  )

//  抽象类型定义了构建过程的不同步骤 sealed 要求我们要枚举所有的情况，被sealed 声明的 trait仅能被同一文件的的类继承
sealed trait BuildStep
sealed trait HasNameStep extends BuildStep
sealed trait HasAgeStep extends BuildStep

class AccountBuilderS[PassedStep <: BuildStep] private ( // <: 为类型上界符号，即 PassedStep 必须是 BuildStep 的子类
                                                       var name:String,
                                                       var nickname:String,
                                                       var age:Int
                                                     ){

  // 按实际需求重载构造器
  protected def this() = this("", "", 0)

  protected def this(pb: AccountBuilderS[_]) = this(
    pb.name,
    pb.nickname,
    pb.age
  )

  def setName(name:String):AccountBuilderS[HasNameStep] = {
    this.name = name
    new AccountBuilderS[HasNameStep](this)
  }

  def setNickname(nickname:String):AccountBuilderS[PassedStep] = {
    this.nickname = nickname
    this
  }

  def setAge(age:Int)(implicit ev:PassedStep =:= HasNameStep):AccountBuilderS[HasAgeStep] = {
    this.age = age
    new AccountBuilderS[HasAgeStep](this)
  }

  // =:= 要求 ev 等于 HasAgeStep 类型
  def build()(implicit ev: PassedStep =:= HasAgeStep):AccountS =
    new AccountS(name, nickname, age)
}

// 伴生对象
object AccountBuilderS {
  def apply() = new AccountBuilderS[BuildStep]()
}
