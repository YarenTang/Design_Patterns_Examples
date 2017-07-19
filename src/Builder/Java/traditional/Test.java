package Builder.Java.traditional;

/**
 * Created by prefert on 2017/7/19.
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        director.Construct(builder); // 发出组装机器人的指令
        Robot robot = builder.getRobot(); // 拿来拼装好的机器人
        System.out.println(robot); // 展示机器人
    }
}
