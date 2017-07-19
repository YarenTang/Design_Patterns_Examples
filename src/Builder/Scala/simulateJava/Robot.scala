package Builder.Scala.simulateJava

/**
  * Created by prefert on 2017/7/16.
  * 仿 java 版
  */
class Robot(builder: RobotBuilder) {
  val code = builder.code
  val name = builder.name
  val battery = builder.battery
}

class RobotBuilder {
  var code = ""
  var name = ""
  var battery = 0

  def setName(name: String): RobotBuilder = {
    this.name = name
    this // 返回 this 链式调用
  }

  def setCode(code: String): RobotBuilder = {
    this.code = code
    this
  }

  def setBattery(battery: Int): RobotBuilder = {
    this.battery = battery
    this
  }

  def build() = {
    new Robot(this)
  }
}



