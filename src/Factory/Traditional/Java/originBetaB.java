package Factory.Traditional.Java;

/**
 * Created by prefert on 2017/8/16.
 * 初步抽象
 */
public class originBetaB {
    public static void main(String[] args) {
        BuildingAs buildingA = new BuildingAs("bedroom");
        BuildingBs buildingB = new BuildingBs("kitchen");
        buildingA.build();
        buildingB.build();
    }
}

interface IBuilding {
    void build();
}

abstract class AbstractBuilding implements IBuilding {
    protected void buildCommon(){
        System.out.println("Europe style"); // 公共的部分
    }
}

 class BuildingAs extends AbstractBuilding {
    private String name;
    public BuildingAs(String name){
        this.name = name;
    }
    @Override
    public void build() {
        this.buildCommon();
        System.out.println(name + " is building");
    }
}

 class BuildingBs extends AbstractBuilding {
    private String name;
    public BuildingBs(String name) {
        this.name = name;
    }

    @Override
    public void build() {
        this.buildCommon();
        System.out.println(name + " is building");
    }
}