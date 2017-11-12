package Factory.Simple.Java;


/**
 * Created by prefert on 2017/8/16.
 * 简单工厂模式 // 静态工厂方法
 */
interface IBuilding {
    void build();
}

abstract class AbstractBuilding implements IBuilding {
    protected void buildCommon(){
        System.out.println("Europe style"); // 公共的部分
    }
}

class BuildingA extends AbstractBuilding {
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

class BuildingB extends AbstractBuilding {
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

public class SimpleFactory {
    public static IBuilding getProduct(String name){
        if("bedroom".equals(name)){
            return new BuildingA(name);
        }else if("kitchen".equals(name)){
            return new BuildingB(name);
        }else{
            throw new IllegalArgumentException();
        }
    }
}

class Client {
    public static void main(String[] args) {
        IBuilding buildingA =  SimpleFactory.getProduct("bedroom");
        IBuilding buildingB =  SimpleFactory.getProduct("kitchen");
        buildingA.build();
        buildingB.build();
    }
}
