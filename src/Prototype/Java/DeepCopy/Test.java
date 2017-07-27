package Prototype.Java.DeepCopy;

import Prototype.Java.ShallowCopy.Cell;

import java.util.ArrayList;

/**
 * Created by prefert on 2017/7/27.
 */
public class Test {
    public static void main(String[] args) {
        Prototype.Java.ShallowCopy.Cell cellA, cellB, cellC;
        ArrayList<String> list = new ArrayList<>();
        list.add("Mitochondrion");
        list.add("Nucleus");
        cellA = new Cell("AAAAAA", list);
        System.out.println(cellA);

        cellB = cellA.clone();
        System.out.println(cellB);

        cellC = cellA;

        System.out.println("cellA == cellB ? " + (cellA == cellB));
        System.out.println("cellA.structure == cellB.structure ? " + (cellA.getStructure() == cellB.getStructure()));
        System.out.println("cellA == cellB -class? :" + (cellA.getClass() == cellB.getClass()));

        System.out.println("cellB == cellC ? :" + (cellC == cellB));
        System.out.println("cellB == cellC -class? :" + (cellC.getClass() == cellB.getClass()));

        System.out.println("cellA == cellC ? :" + (cellA == cellC));
        System.out.println("cellA == cellC -class? :" + (cellA.getClass() == cellC.getClass()));
    }
}
