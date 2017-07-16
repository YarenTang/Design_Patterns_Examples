package Singleton.Java;

/**
 * Created by prefert on 2017/7/3.
 * <p>
 * 懒汉模式 双重锁（线程安全,可能出现单例类初始化到一半
 */
public class LazySingletonTwo {
    private static LazySingletonTwo instance;

    private LazySingletonTwo() {
        System.out.println(("LazySingletonTwo is created"));
    }

    public void run() {
        System.out.println(("LazySingletonTwo is running"));
    }

    public static LazySingletonTwo getInstance() {
        if (instance == null) {                         //Single Checked
            synchronized (LazySingletonTwo.class) {
                if (instance == null) {                 //Double Checked

                    instance = new LazySingletonTwo();
                }
            }
        }
        return instance ;
    }
}
