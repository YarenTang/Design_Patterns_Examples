package Builder.Scala

/**
  * Created by prefert on 2017/7/16.
  * case class 版
  */
case class AccountC(
                    val name: String = "",
                    val nickname:  String = "",
                    val age :Int = 0
                  ){
  require(name != "", "不可缺少 name 参数")
  require(age != 0, "不可缺少 age 参数")
}
