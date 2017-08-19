package Factory.Simple.Scala

/**
  * Created by prefert on 2017/8/19.
  * 简单工厂
  */
trait IBuildingS {
  def show()
}

object IBuildingS {
  def apply(kind: String): IBuildingS = kind match {
    case "Simple" =>   SimpleBuildingS("Simple")
    case "Luxury" =>   LuxuryBuildingS("Luxury")
  }
}

case class SimpleBuildingS(name: String)extends IBuildingS {
  def show = println("OriginBuildingA " + name + " is building")
}

case class LuxuryBuildingS(name: String) extends IBuildingS{
  def show = println("OriginBuildingB " + name + " is building")
}


object SimpleFactoryTest extends App {
  val simpleBuilding: IBuildingS = IBuildingS("Simple")
  val luxuryBuilding: IBuildingS = IBuildingS("Luxury")
  simpleBuilding.show()
  luxuryBuilding.show()
}