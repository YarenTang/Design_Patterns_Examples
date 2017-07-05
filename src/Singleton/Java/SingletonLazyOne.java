package Singleton.Java;

/**
 * Created by prefert on 2017/7/3.
 * <p>
 * 懒汉模式 基础版（线程不安全
 */
public class SingletonLazyOne {
    private static SingletonLazyOne instance;

    private SingletonLazyOne() {
    }

    public static SingletonLazyOne getInstance() {
        if (instance == null) {
            instance = new SingletonLazyOne();
        }
        return instance;
    }
}
