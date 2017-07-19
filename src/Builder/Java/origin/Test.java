package Builder.Java.origin;

/**
 * Created by prefert on 2017/7/19.
 */
public class Test {
    public static void main(String[] args) {
        Robot robot1 = new Robot("89757", "火星一号", 1, 99, 250, 180, 180);
        System.out.println(robot1);

        Robot robot2 = new Robot("89757", "火星一号", 1);
        System.out.println(robot2);
    }
}
