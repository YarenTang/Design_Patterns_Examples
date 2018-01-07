package Bridge.Java.Color;

/**
 * Created by prefert on 2018/1/7.
 */
public class Yellow implements Color {
    @Override
    public void drawShape(String type) {
        System.out.println("Yellow " + type +" is drawn");
    }
}
