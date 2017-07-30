package Prototype.Java.DeepCopy.ShallowCopyPlus;


/**
 * Created by prefert on 2017/7/27.
 */
public class Cell implements Cloneable {
    private String dna;
    private Organelle organelle; // 细胞器

    public String getDna() {
        return dna;
    }

    public void setDna(String dna) {
        this.dna = dna;
    }

    public Organelle getOrganelle() {
        return organelle;
    }

    public void setOrganelle(Organelle organelle) {
        this.organelle = organelle;
    }

    public Cell(String dna, Organelle organelle) {
        this.dna = dna;
        this.organelle = organelle;
    }

    @Override
    public String toString() {
        return "Cell: {" +
                "DNA = " + dna + '\'' +
                "Organelle = " + organelle.toString() +
                '}';
    }

    @Override
    public Cell clone() throws CloneNotSupportedException {
        Cell cellCopy = null;
        try {
            cellCopy = (Cell) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        if (cellCopy != null) {
            cellCopy.organelle = (Organelle) organelle.clone();
        }
        return cellCopy;
    }
}
