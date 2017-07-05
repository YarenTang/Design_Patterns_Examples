package Singleton.Java;

/**
 * Created by prefert on 2017/7/3.
 * <p>
 * 懒汉模式 双重锁（线程安全
 */
public class SingletonLazyTwo {
    private static SingletonLazyTwo instance;

    private SingletonLazyTwo() {
    }

    public static SingletonLazyTwo getSingleton() {
        if (instance == null) {                         //Single Checked
            synchronized (SingletonLazyTwo.class) {
                if (instance == null) {                 //Double Checked
                    instance = new SingletonLazyTwo();
                }
            }
        }
        return instance ;
    }
}
