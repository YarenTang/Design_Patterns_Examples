package Bridge.Java.Color;

/**
 * Created by prefert on 2018/1/7.
 */
public class Red implements Color {
    @Override
    public void drawShape(String type) {
        System.out.println("Red " + type +" is drawn");
    }
}
