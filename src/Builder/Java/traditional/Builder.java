package Builder.Java.traditional;

/**
 * Created by prefert on 2017/7/16.
 */
abstract class Builder {

    public abstract void BuildSensor();  // 构建传感器模块
    public abstract void BuildControl(); // 构建控制模块
    public abstract void BuildDrive();   // 构建驱动模块
    public abstract void BuildShell();   // 构建shell

    public abstract Robot getRobot();
}
