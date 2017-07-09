package Singleton.Java;


/**
 * Created by prefert on 2017/7/4.
 */
public class Test {
    public static void main(String[] args) {
        HungrySingletonOne.getInstance().run();
        HungrySingletonTwo.getInstance().getValue();

        LazySingletonOne.getInstance().run();
        LazySingletonTwo.getInstance().run();
        LazySingletonThree.getInstance().run();

        EnumSingleton.INSTANCE.printPreference();
    }
}
