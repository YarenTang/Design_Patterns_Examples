package Factory.Method.Scala

/**
  * Created by prefert on 2017/8/13.
  */
case class SimpleBuilding(door: Door,
                          wall: Wall,
                          pillar: Pillar) extends IBuilding {
  def show = println("简约户型已创建")
}

case class LuxuryBuilding(door: Door,
                          wall: Wall,
                          pillar: Pillar) extends IBuilding {
  def show = println("豪华户型已创建")
}

trait IFactoryS {
  def createBuilding(kind: String): IBuilding
}



class ConstructionFactoryS extends IFactoryS {
  def createBuilding(kind: String): IBuilding =  kind match {
    case "Simple" =>   SimpleBuilding(new Door, new Wall, new Pillar)
    case "Luxury" =>   LuxuryBuilding(new Door, new Wall, new Pillar)
  }
}

object Test2 extends App{
  val iFactory:IFactoryS = new ConstructionFactoryS
  val iBuilding1:IBuilding = iFactory.createBuilding("Simple")
  val iBuilding2:IBuilding = iFactory.createBuilding("Luxury")
  iBuilding1.show()
  iBuilding2.show()
}

// 简洁版
//object IBuilding {
//  def apply(kind: String): IBuilding = kind match {
//    case "Simple" =>   SimpleBuilding(new Door, new Wall, new Pillar)
//    case "Luxury" =>   LuxuryBuilding(new Door, new Wall, new Pillar)
//  }
//}

object Test3 extends App{
  val iBuilding3:IBuilding = IBuilding("Simple")
  val iBuilding4:IBuilding = IBuilding("Luxury")
  iBuilding3.show()
  iBuilding4.show()
}