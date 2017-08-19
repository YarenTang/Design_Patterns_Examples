package Factory.Traditional.Scala

/**
  * Created by prefert on 2017/8/19.
  */
case class SimpleBuilding(name: String) {
  def show = println("OriginBuildingA" + name + " is building")
}

case class LuxuryBuilding(name: String) {
  def show = println("OriginBuildingB" + name + " is building")
}

object Test extends App {
  val bI = SimpleBuilding("bedroom")
  val bII = LuxuryBuilding("kitchen")
  bI.show
  bII.show
}