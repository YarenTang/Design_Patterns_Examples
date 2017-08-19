package Factory.Abstract.Scala

/**
  * Created by prefert on 2017/8/19.
  * 抽象工厂
  */
trait IBuilding {
  def show()
}

case class BigSimpleBuilding(name: String)extends IBuilding {
  def show = println("Big SimpleBuilding " + name + " is building")
}

case class SmallSimpleBuilding(name: String)extends IBuilding {
  def show = println("Small SimpleBuilding " + name + " is building")
}

trait IFactory {
  def buildBig(): IBuilding
  def buildSmall(): IBuilding
}

object SimpleConstructionFactory extends IFactory{
  override def buildBig(): IBuilding = BigSimpleBuilding("Simple")

  override def buildSmall(): IBuilding = SmallSimpleBuilding("Simple")
}

object Test extends App {
  val big_simpleBuilding: IBuilding = SimpleConstructionFactory.buildBig()
  val small_simpleBuilding: IBuilding = SimpleConstructionFactory.buildSmall()
  big_simpleBuilding.show()
  small_simpleBuilding.show()
}
