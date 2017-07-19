package Builder.Scala.require

/**
  * Created by prefert on 2017/7/19.
  */
object Test extends App{
  val robot1 = Robot(
    name = "Bat-Man",
    code = "89757",
    battery = 88
  )

  System.out.println(s"Robot1 : $robot1")

  try {
    val robot2 = Robot(name = "Bat-Man")
  }catch {
    case e :Throwable => e.printStackTrace()
  }
}
