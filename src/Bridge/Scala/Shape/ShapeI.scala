package Bridge.Scala.Shape

import Bridge.Scala.Color.Color

/**
  * Created by prefert on 2018/1/7.
  */
class ShapeI(color: Color) extends Shape(color){
  override def draw(): Unit = color.drawShape("ShapeI")
}
