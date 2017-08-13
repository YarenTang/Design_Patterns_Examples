package Factory.Method.Scala

/**
  * Created by prefert on 2017/8/12.
  */
class Door {
  def getInfo = println("门")
}

class Wall {
  def getInfo = println("墙")
}

class Pillar {
  def getInfo = println("支柱")
}

trait IBuilding {
  def show()
}

case class Building(door: Door,
                    wall: Wall,
                    pillar: Pillar) extends IBuilding {
  def show = println("房屋建好了")
}

trait IFactory {
  def createBuilding: IBuilding
}

class ConstructionFactory extends IFactory {
  override def createBuilding = Building(new Door, new Wall, new Pillar)
}

object Test extends App {
  val iFactory: IFactory = new ConstructionFactory
  val iBuilding: IBuilding = iFactory.createBuilding
  iBuilding.show()
}
