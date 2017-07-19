package Builder.Java.simple;

/**
 * Created by prefert on 2017/7/19.
 */
public class Test {
    public static void main(String[] args) {
        Robot robot = new Robot.RobotBuilder("89757", "火星一号", 1)
                .withOptionalBattery(99)
                .withOptionalAbility(250)
                .withOptionalWeight(180)
                .withOptionalHeight(180)
                .buildRobot();
        System.out.println(robot);
    }
}
