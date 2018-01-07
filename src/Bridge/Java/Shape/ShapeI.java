package Bridge.Java.Shape;

/**
 * Created by prefert on 2018/1/7.
 */
public class ShapeI extends Shape {
    @Override
    public void draw() {
        color.drawShape("ShapeI");
    }
}
