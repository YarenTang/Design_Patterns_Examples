package Singleton.Java;

/**
 * Created by prefert on 2017/7/3.
 * <p>
 * 懒汉模式 基础版（线程不安全
 */
public class LazySingletonOne implements Runnable{
    private static LazySingletonOne instance;

    private LazySingletonOne() {
        System.out.println(("LazySingletonOne is created"));
    }

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            LazySingletonOne.getInstance();
        }
        System.out.println(System.currentTimeMillis() - beginTime);
    }

    public static LazySingletonOne getInstance() {
        if (instance == null) {
            instance = new LazySingletonOne();
        }
        return instance;
    }

    public static void main(String[] args) {
//        LazySingletonOne.run();  // 验证是否 lazy

        for(int i=0;i<5;i++){
            new Thread(new LazySingletonOne()).start();
        }

    }


}
