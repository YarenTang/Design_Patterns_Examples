package Builder.Java;

/**
 * Created by prefert on 2017/7/16.
 */
public class ConcreteBuilder extends Builder {
    //创建产品实例
    Robot robot = new Robot();

    @Override
    public void BuildSensor() {
      robot.setSensor("创建并组装传感器");
    }

    @Override
    public void BuildControl() {
      robot.setControl("创建并组装控制器");
    }

    @Override
    public void BuildDrive() {
      robot.setDrive("创建并组装驱动");
    }

    @Override
    public void BuildShell() {
      robot.setShell("创建并组装外壳");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
