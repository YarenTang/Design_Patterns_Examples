package Prototype.Scala

/**
  * Created by prefert on 2017/7/26.
  */
case class Cell(dna: String, structure: List[String])
object Test extends App {
  val initialCell = Cell("AAAGTCTGAC", List("Mitochondrion", "Nucleus"))
  val copy1 = initialCell.copy()
  val copy2 = initialCell.copy()
  val copy3 = initialCell.copy(dna = "1234")
  System.out.println(s"The prototype is: ${initialCell}")
  System.out.println(s"Cell 1: ${copy1}")
  System.out.println(s"Cell 2: ${copy2}")
  System.out.println(s"Cell 3: ${copy3}")
  System.out.println(s"1 and 2 are equal: ${copy1 == copy2}")
}
