package Singleton.Java;

/**
 * Created by prefert on 2017/7/3.
 *
 * 饿汉模式 基础版
 */
public class SingletonHungryOne {
    //类加载时就初始化
    private static final SingletonHungryOne instance = new SingletonHungryOne();
    private SingletonHungryOne() {}
    public static SingletonHungryOne getInstance() {
        return instance;
    }
}
