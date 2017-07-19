package Builder.Scala.require

/**
  * Created by prefert on 2017/7/16.
  * require 版
  */
case class Robot(
                  code:  String = "",
                  name: String = "",
                  battery :Int = 0
                  ){
  require(code != "", "不可缺少 code 参数")
  require(name != "", "不可缺少 name 参数")
}
