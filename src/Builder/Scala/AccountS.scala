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

//  抽象类型定义了构建过程的不同步骤
sealed trait BuildStep
sealed trait HasNameStep extends BuildStep
sealed trait HasAgeStep extends BuildStep
