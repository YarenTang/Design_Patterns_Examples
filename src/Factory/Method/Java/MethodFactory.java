package Factory.Method.Java;

/**
 * Created by prefert on 2017/8/16.
 */
public class MethodFactory {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        FactoryB factoryB = new FactoryB();
        FactoryC factoryC = new FactoryC();
        factoryA.createBuilding();
        factoryB.createBuilding();
        factoryC.createBuilding();
    }
}

interface IBuilding {
    void build();
}

interface IFactory {
    public IBuilding createBuilding();
}

abstract class AbstractBuildingS implements  IBuilding {
    protected void buildCommon(){
        System.out.println("Europe style"); // 公共的部分
    }
}

class BuildingA extends AbstractBuildingS {
    private String name;
    public BuildingA(String name){
        this.name = name;
    }
    @Override
    public void build() {
        this.buildCommon();
        System.out.println(name + " is building");
    }
}

class BuildingB extends AbstractBuildingS {
    private String name;
    public BuildingB(String name) {
        this.name = name;
    }

    @Override
    public void build() {
        this.buildCommon();
        System.out.println(name + " is building");
    }
}

class FactoryA implements IFactory{

    @Override
    public IBuilding createBuilding() {
        // 可以进行复杂的处理，每一种方法对应一种模型
        return new BuildingA("bedroom");
    }
}

class FactoryB implements IFactory{

    @Override
    public IBuilding createBuilding() {
        return new BuildingA("kitchen");
    }
}

class FactoryC implements IFactory{

    @Override
    public IBuilding createBuilding() {
        return new BuildingA("restroom");
    }
}



