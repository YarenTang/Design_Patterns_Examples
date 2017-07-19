package Builder.Scala.simulateJava

import Builder.Scala.typesafe.RobotBuilder

/**
  * Created by prefert on 2017/7/19.
  */
object Test extends App {
  val robot: Robot = new RobotBuilder()
    .setCode("89757")
    .setName("Bat-Man")
    .setBattery(88)
    .build()
  System.out.println(s"Robot: $robot }")

}
