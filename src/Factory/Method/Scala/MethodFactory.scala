package Factory.Method.Scala

/**
  * Created by prefert on 2017/8/19.
  * 工厂方法模式
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

trait IFactory {
  def build(): IBuilding
}

object SimpleConstructionFactory extends IFactory{
  override def build(): IBuilding = SimpleBuilding("Simple")
}

object LuxuryConstructionFactory extends IFactory{
  override def build():  IBuilding = SimpleBuilding("Luxury")
}

object Test extends App {
  val simpleBuilding: IBuilding = SimpleConstructionFactory.build()
  val luxuryBuilding: IBuilding = LuxuryConstructionFactory.build()
  simpleBuilding.show()
  luxuryBuilding.show()
}