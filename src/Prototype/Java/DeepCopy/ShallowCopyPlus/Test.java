package Prototype.Java.DeepCopy.ShallowCopyPlus;

/**
 * Created by prefert on 2017/7/27.
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cell cellA, cellB, cellC;

        cellA = new Cell("AAAGTCTGAC", new Organelle("细胞质", "细胞核"));
        System.out.println(cellA);

        cellB = cellA.clone();
        System.out.println(cellB);

        cellC = cellA;

        System.out.println("cellA == cellB ? " + (cellA == cellB));
        System.out.println("cellA.organelle == cellB.organelle ? " + (cellA.getOrganelle() == cellB.getOrganelle()));
        System.out.println("cellA-class == cellB-class? :" + (cellA.getClass() == cellB.getClass()));

        System.out.println("cellB == cellC ? :" + (cellC == cellB));
        System.out.println("cellB-class == cellC-class? :" + (cellC.getClass() == cellB.getClass()));

        System.out.println("cellA == cellC ? :" + (cellA == cellC));
        System.out.println("cellA-class == cellC-class? :" + (cellA.getClass() == cellC.getClass()));
    }
}
