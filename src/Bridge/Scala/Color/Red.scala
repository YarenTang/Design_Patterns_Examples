package Bridge.Scala.Color

/**
  * Created by prefert on 2018/1/7.
  */
class Red extends Color{
  override def drawShape(`type`: String) = println(s"Red ${`type`} is drawn")
}
