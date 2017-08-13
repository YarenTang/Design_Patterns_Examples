package Factory.Method.Java;


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

interface IBuilding {
    public void show();
}
class Building implements Factory.Method.Scala.IBuilding {
    private Factory.Method.Scala.Door door;
    private Factory.Method.Scala.Wall wall;
    private Factory.Method.Scala.Pillar pillar;
    public Building(Factory.Method.Scala.Door door, Factory.Method.Scala.Wall wall, Factory.Method.Scala.Pillar pillar) {
        this.door = door;
        this.wall = wall;
        this.pillar = pillar;
    }
    public void show() {
        System.out.println("房屋建好了");
    }
}

interface IFactory {
    public Factory.Method.Scala.IBuilding createBuilding();
}
class ConstructionFactory implements Factory.Method.Scala.IFactory {
    public Factory.Method.Scala.IBuilding createBuilding() {
        Factory.Method.Scala.Door door = new Factory.Method.Scala.Door();
        Factory.Method.Scala.Wall wall = new Factory.Method.Scala.Wall();
        Factory.Method.Scala.Pillar pillar = new Factory.Method.Scala.Pillar();
        return new Factory.Method.Scala.Building(door, wall, pillar);
    }
}
public class Test {
    public static void main(String[] args) {
        Factory.Method.Scala.IFactory factory = new Factory.Method.Scala.ConstructionFactory();
        Factory.Method.Scala.IBuilding building = factory.createBuilding();
        building.show();
    }
}