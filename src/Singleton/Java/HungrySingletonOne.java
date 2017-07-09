package Singleton.Java;

/**
 * Created by prefert on 2017/7/3.
 * <p>
 * 饿汉模式 基础版
 */
public class HungrySingletonOne {
    //类加载时就初始化
    private static final HungrySingletonOne instance = new HungrySingletonOne();

    private HungrySingletonOne() {
    }

    public void run() {
        System.out.println(("HungrySingletonOne is running"));
    }

    public static HungrySingletonOne getInstance() {
        return instance;
    }
}
