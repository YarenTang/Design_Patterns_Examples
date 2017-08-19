package Factory.Simple.Scala

/**
  * Created by prefert on 2017/8/19.
  * 简单工厂
  */
trait IBuilding {
  def show()
}

case class SimpleBuilding(name: String)extends IBuilding {
  def show = println("SimpleBuilding " + name + " is building")
}

case class LuxuryBuilding(name: String) extends IBuilding{
  def show = println("LuxuryBuilding " + name + " is building")
}

object ConstructionFactory  {
  def createBuilding(kind: String): IBuilding =  kind match {
    case "Simple" =>   SimpleBuilding("Simple")
    case "Luxury" =>   LuxuryBuilding("Luxury")
  }
}

object Test extends App {
  val simpleBuilding: IBuilding = ConstructionFactory.createBuilding("Simple")
  val luxuryBuilding: IBuilding = ConstructionFactory.createBuilding("Luxury")
  simpleBuilding.show()
  luxuryBuilding.show()
}
