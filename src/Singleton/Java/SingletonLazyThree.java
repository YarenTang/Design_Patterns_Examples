package Singleton.Java;

/**
 * Created by prefert on 2017/7/3.
 * <p>
 * 懒汉模式 volatile（线程安全
 */
public class SingletonLazyThree {
    private static SingletonLazyThree instance;

    private SingletonLazyThree() {
    }

    public static SingletonLazyThree getSingleton() {
        if (instance == null) {                         //Single Checked
            synchronized (SingletonLazyThree.class) {
                if (instance == null) {                 //Double Checked
                    instance = new SingletonLazyThree();
                }
            }
        }
        return instance ;
    }
}
