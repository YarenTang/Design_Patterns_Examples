package Builder.Java;

/**
 * Created by prefert on 2017/7/16.
 */
public class Director {

    public void Construct(Builder builder){
       // 组成产品的方法，组成的过程可能是有顺序的
        builder.BuildSensor();
        builder.BuildControl();
        builder.BuildDrive();
        builder.BuildShell();
    }
}
