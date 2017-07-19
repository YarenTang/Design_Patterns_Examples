package Builder.Scala.typesafe

/**
  * Created by prefert on 2017/7/19.
  */
object Test extends App{
  val robot = RobotBuilder()
    .setCode("89757")
    .setName("tyl")
    .setBattery(99)
    .build()
  System.out.println(s"Robot: $robot")
}
