package Bridge.Java.Shape;

import Bridge.Java.Color.Color;

/**
 * Created by prefert on 2018/1/1.
 */
public abstract class Shape {
    Color color;

    public void setColor(Bridge.Java.Color.Color color) {
        this.color = color;
    }

    public abstract void draw();
}
