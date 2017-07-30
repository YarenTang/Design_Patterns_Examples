package Prototype.Scala

/**
  * Created by prefert on 2017/7/26.
  */
case class Cell(dna: String, organelle: Organelle)

case class Organelle(cytoplasm: String, nucleus: String)

object Test extends App {
  val initialCell = Cell("AAAGTCTGAC", Organelle("细胞质", "细胞核"))
  val cell1 = initialCell.copy()
  val cell2 = initialCell.copy()
  val cell3 = initialCell.copy(dna = "1234") // 可以在拷贝的时候重新赋值

  System.out.println(s"Cell 1: ${cell1}")
  System.out.println(s"Cell 2: ${cell2}")
  System.out.println(s"Cell 3: ${cell3}")
  System.out.println(s"Cell1 and 2 are equal: ${cell1 == cell2}")
  System.out.println(s"Cell1 and 3 are equal: ${cell1 == cell3}")
}
