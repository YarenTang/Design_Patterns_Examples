package Singleton.Java;

/**
 * Created by prefert on 2017/7/3.
 *
 * 饿汉模式 静态内部类版
 */
final class SingletonHungryTwo {
    // 声明为 final 能防止其在派生类中被 clone
    private int Countdown ;
    private static SingletonHungryTwo instance = new SingletonHungryTwo(60);

    public int getValue() { return Countdown; }
    public void setValue(int tmp) { Countdown = tmp; }

    private SingletonHungryTwo(int x) { Countdown = x; }
    public static SingletonHungryTwo getHandle() {
        return instance;
    }
}

