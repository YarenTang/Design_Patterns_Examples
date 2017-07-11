package Singleton.Java;

/**
 * Created by prefert on 2017/7/3.
 * <p>
 * 饿汉模式 静态内部类版
 */
final class StaticNestedSingleton {
    // 声明为 final 能防止其在派生类中被 clone
    private StaticNestedSingleton(){
        System.out.println(("StaticNestedSingleton is created"));
    }

    public static StaticNestedSingleton getInstance()
    {
        return Nested.instance;
    }

    //在第一次被引用时被加载
    static class Nested
    {
        private static StaticNestedSingleton instance = new StaticNestedSingleton();
    }

    public static void main(String[] args) {
        StaticNestedSingleton.getInstance();
        StaticNestedSingleton.getInstance();
    }
}

