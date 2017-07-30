package Prototype.Java.DeepCopy.Serializable;

import java.io.*;
/**
 * Created by prefert on 2017/7/27.
 */
public class Cell implements Serializable {
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

    // 序列化实现深拷贝
    public Cell deepClone() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        // 序列化（将对象写入流中）
        ByteArrayOutputStream bos=new  ByteArrayOutputStream();
        ObjectOutputStream oos=new  ObjectOutputStream(bos);
        oos.writeObject(this);

        // 反序列化（将对象从流中取出）
        ByteArrayInputStream bis=new  ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois=new  ObjectInputStream(bis);
        return  (Cell)ois.readObject();
    }
}
