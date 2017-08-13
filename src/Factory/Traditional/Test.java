package Factory.Traditional;

/**
 * Created by prefert on 2017/8/9.
 */
class Door {
    public void getInfo() {
        System.out.println("门");
    }
}

class Wall {
    public void getInfo() {
        System.out.println("墙");
    }
}

class Pillar {
    public void getInfo() {
        System.out.println("支柱");
    }
}

class Building   {
    private Door door;
    private Wall wall;
    private Pillar pillar;

    public Building(Door door, Wall wall, Pillar pillar) {
        this.door = door;
        this.wall = wall;
        this.pillar = pillar;
    }

    public void show() {
        System.out.println("房屋建好了");
    }
}

public class Test {
    public static void main(String[] args) {
        Door door = new Door();
        Wall wall = new Wall();
        Pillar pillar = new Pillar();
        Building building = new Building(door, wall, pillar);
        building.show();
    }
}
