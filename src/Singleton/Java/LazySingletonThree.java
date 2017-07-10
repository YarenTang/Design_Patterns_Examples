package Singleton.Java;

/**
 * Created by prefert on 2017/7/3.
 * <p>
 * 懒汉模式 volatile（线程安全
 */
public class LazySingletonThree {
    private static LazySingletonThree instance;

    private LazySingletonThree() {
        System.out.println(("LazySingletonThree is created"));
    }

    public void run() {
        System.out.println(("LazySingletonThree is running"));
    }

    public static LazySingletonThree getInstance() {
        if (instance == null) {                         //Single Checked
            synchronized (LazySingletonThree.class) {
                if (instance == null) {                 //Double Checked
                    instance = new LazySingletonThree();
                }
            }
        }
        return instance ;
    }
}
