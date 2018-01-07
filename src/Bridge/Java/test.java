package Bridge.Java;

import Bridge.Java.Color.Color;
import Bridge.Java.Color.Red;
import Bridge.Java.Shape.Shape;
import Bridge.Java.Shape.ShapeI;
import Bridge.Java.Shape.ShapeJ;

/**
 * Created by prefert on 2017/12/19.
 */
public class test {
    public static void main(String[] args) {

        Color red = new Red();
        Shape shapeI = new ShapeI();
        // 红色的 I
        shapeI.setColor(red);
        shapeI.draw();

        // 红色的 L
        Shape shapeL = new ShapeJ();
        shapeL.setColor(red);
        shapeL.draw();
    }
}
