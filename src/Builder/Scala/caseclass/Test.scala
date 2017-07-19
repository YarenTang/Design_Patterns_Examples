package Builder.Scala.caseclass

/**
  * Created by prefert on 2017/7/19.
  */
object Test extends App{
  val robot1 = Robot(
    code = "89757",
    name = "Bat-Man",
    battery = 99
  )

  val robot2 = Robot(name = "prefert")

  System.out.println(s"Robot 1: $robot1")
  System.out.println(s"Robot 2: $robot2")
}
