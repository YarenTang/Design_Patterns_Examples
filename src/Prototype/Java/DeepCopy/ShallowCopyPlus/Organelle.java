package Prototype.Java.DeepCopy.ShallowCopyPlus;

import Prototype.Java.ShallowCopy.*;

/**
 * Created by prefert on 2017/7/27.
 */
public class Organelle implements Cloneable {
    private String cytoplasm; // 细胞质
    private String nucleus; // 细胞核
    // ...

    public String getCytoplasm() {
        return cytoplasm;
    }

    public void setCytoplasm(String cytoplasm) {
        this.cytoplasm = cytoplasm;
    }

    public String getNucleus() {
        return nucleus;
    }

    public void setNucleus(String nucleus) {
        this.nucleus = nucleus;
    }

    public Organelle(String cytoplasm, String nucleus) {
        this.cytoplasm = cytoplasm;
        this.nucleus = nucleus;
    }

    @Override
    public String toString() {
        return "Organelle: {" +
                "cytoplasm = " + cytoplasm + '\'' +
                "nucleus = " + nucleus + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }
}
