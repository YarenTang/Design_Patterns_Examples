package Bridge.Scala

import Bridge.Scala.Color._
import Bridge.Scala.Shape._


/**
  * Created by prefert on 2018/1/7.
  */
object Test extends App{
   new ShapeI(new Blue).draw()
   new ShapeJ(new Red).draw()
}
