package Prototype.Java.DeepCopy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prefert on 2017/7/27.
 */
public class Cell implements Cloneable{
    private String dna;
    private ArrayList<String> structure;

    public String getDna() {
        return dna;
    }

    public void setDna(String dna) {
        this.dna = dna;
    }

    public List<String> getStructure() {
        return structure;
    }

    public void setStructure(ArrayList<String> structure) {
        this.structure = structure;
    }

    public Cell(String dna, ArrayList<String> structure) {
        this.dna = dna;
        this.structure = structure;
    }


    @Override
    public String toString() {
        StringBuilder sb =new StringBuilder();
        for (String s : structure) {
            sb.append(", structure = '").append(s).append("\'");
        }
        return "Cell: {" +
                "DNA = " + dna + '\'' +
               sb.toString() +
                '}';
    }

    @Override
    public Cell clone() {
         Cell cellCopy  = null;
         try{
             cellCopy=(Cell)super.clone();
         }catch (CloneNotSupportedException e) {
            e.printStackTrace();
         }
         return cellCopy;
     }
}
