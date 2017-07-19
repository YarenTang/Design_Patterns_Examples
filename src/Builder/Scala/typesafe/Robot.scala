package Builder.Scala.typesafe

/**
  * Created by prefert on 2017/7/16.
  * type safe 版
  */
case class Robot(
                  code: String,
                  name: String,
                  battery: Int
                )

//  抽象类型定义了构建过程的不同步骤 sealed 要求我们要枚举所有的情况，被sealed 声明的 trait 仅能被同一文件的的类继承
sealed trait BuildStep

sealed trait HasCodeStep extends BuildStep

sealed trait HasNameStep extends BuildStep

// <: 为类型上界符号，即 PassedStep 必须是 BuildStep 的子类
class RobotBuilder[PassedStep <: BuildStep] private(
                                                     var code: String,
                                                     var name: String,
                                                     var battery: Int
                                                   ) {

  // 按实际需求重载构造器
  protected def this() = this("", "", 0)

  protected def this(pb: RobotBuilder[_]) = this(
    pb.code,
    pb.name,
    pb.battery
  )

  def setCode(code: String): RobotBuilder[HasCodeStep] = {
    this.code = code
    new RobotBuilder[HasCodeStep](this)
  }

  def setName(name: String)(implicit ev: PassedStep =:= HasCodeStep): RobotBuilder[HasNameStep] = {
    this.name = name
    new RobotBuilder[HasNameStep](this)
  }


  def setBattery(battery: Int): RobotBuilder[PassedStep] = {
    this.battery = battery
    this
  }


  // =:= 要求 ev 等于 HasAgeStep 类型
  def build()(implicit ev: PassedStep =:= HasNameStep): Robot = Robot(code, name, battery)
}

// 伴生对象
object RobotBuilder {
  def apply() = new RobotBuilder[BuildStep]()
}
