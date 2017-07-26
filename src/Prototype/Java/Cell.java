package Prototype.Java;

import scala.reflect.internal.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prefert on 2017/7/27.
 */
public class Cell implements Prototype{
    private String dna;
    private List<String> structure;

    public String getDna() {
        return dna;
    }

    public void setDna(String dna) {
        this.dna = dna;
    }

    public List<String> getStructure() {
        return structure;
    }

    public void setStructure(List<String> structure) {
        this.structure = structure;
    }
     @Override
    public Prototype clone() {
            List cellList = new ArrayList<String>();
            cellList.add("Mitochondrion");
            cellList.add("Nucleus");
         Cell cell = new Cell();
         // Todo
        return cell;
    }
}
