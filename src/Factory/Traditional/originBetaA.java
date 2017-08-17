package Factory.Traditional;

/**
 * Created by prefert on 2017/8/16.
 * 最原始版本
 */
public class originBetaA {
    public static void main(String[] args) {
        BuildingA buildingA = new BuildingA("bedroom");
        BuildingB buildingB = new BuildingB("kitchen");
        buildingA.build();
        buildingB.build();
    }
}

class BuildingA {
    private String name;

    public BuildingA(String name) {
        this.name = name;
    }

    public void build() {
        System.out.println(name + " is building");
    }
}

class BuildingB {
    private String name;

    public BuildingB(String name) {
        this.name = name;
    }

    public void build() {
        System.out.println(name + " is building");
    }
}

