package Singleton.Java;


/**
 * Created by prefert on 2017/7/4.
 */
public class Test {
    public static void main(String[] args) {
        SingletonHungryOne.getInstance();

        SingletonHungryTwo.getHandle().getValue();
    }
}
