package Factory.Abstract.Java;

/**
 * Created by prefert on 2017/8/17.
 */
public class AbstractFactory {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.createBuildingA();
        factory.createBuildingB();
    }
}

interface IBuildingA {
    void buildA();
}

interface IBuildingB {
    void buildB();
}

interface IFactory {
    public IBuildingA createBuildingA();

    public IBuildingB createBuildingB();
}

class BuildingA implements IBuildingA {
    private String name;

    public BuildingA(String name) {
        this.name = name;
    }

    @Override
    public void buildA() {
        System.out.println((name + "is building"));
    }
}

class BuildingB implements IBuildingB {
    private String name;
    public BuildingB(String name) {
        this.name = name;
    }

    @Override
    public void buildB() {
        System.out.println(name + " is building");
    }
}

class Factory implements IFactory {
    @Override
    public IBuildingA createBuildingA() {
        return new BuildingA("big bedroom");
    }

    @Override
    public IBuildingB createBuildingB() {
        return new BuildingB("small bedroom");
    }
}

