package Singleton.Java;

/**
 * Created by prefert on 2017/7/3.
 * <p>
 * 懒汉模式 基础版（线程不安全
 */
public class LazySingletonOne {
    private static LazySingletonOne instance;

    private LazySingletonOne() {
    }

    public void run() {
        System.out.println(("LazySingletonOne is running"));
    }

    public static LazySingletonOne getInstance() {
        if (instance == null) {
            instance = new LazySingletonOne();
        }
        return instance;
    }
}
