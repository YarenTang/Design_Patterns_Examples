package Singleton.Java;

/**
 * Created by prefert on 2017/7/3.
 * <p>
 * 饿汉模式
 */
public class HungrySingleton {
    //类加载时就初始化
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
        System.out.println(("HungrySingleton is created"));
    }

    public static void run() {
        System.out.println(("HungrySingleton is running"));
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        HungrySingleton.run();
    }
}
