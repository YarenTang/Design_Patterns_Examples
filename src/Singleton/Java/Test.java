package Singleton.Java;


/**
 * Created by prefert on 2017/7/4.
 */
public class Test {
    public static void main(String[] args) {


        System.out.println("<---------------------分割线----------------------->");

        HungrySingleton.getInstance().run();
        System.out.println("StaticNestedSingleton -> getValue is called: "+ StaticNestedSingleton.getInstance());

        LazySingletonOne.getInstance().run();
        LazySingletonTwo.getInstance().run();
        LazySingletonThree.getInstance().run();

        EnumSingleton.INSTANCE.printPreference();

        System.out.println("<---------------------分割线----------------------->");

        HungrySingleton hungryOne1 =  HungrySingleton.getInstance();
        HungrySingleton hungryOne2 =  HungrySingleton.getInstance();
        System.out.println((hungryOne1 == hungryOne2 ? "hungryOne1 == hungryOne2" : "hungryOne1 != hungryOne2"));

        StaticNestedSingleton hungryTwo1 =  StaticNestedSingleton.getInstance();
        StaticNestedSingleton hungryTwo2 =  StaticNestedSingleton.getInstance();
        System.out.println((hungryTwo1 == hungryTwo2 ? "hungryTwo1 == hungryTwo2" : "hungryTwo1 != hungryTwo2"));

        LazySingletonOne lazyOne1 = LazySingletonOne.getInstance();
        LazySingletonOne lazyOne2 = LazySingletonOne.getInstance();
        System.out.println((lazyOne1 == lazyOne2 ? "lazyOne1 == lazyOne2" : "lazyOne1 != lazyOne2"));

        LazySingletonTwo lazyTwo1 = LazySingletonTwo.getInstance();
        LazySingletonTwo lazyTwo2 = LazySingletonTwo.getInstance();
        System.out.println((lazyTwo1 == lazyTwo2 ? "lazyTwo1 == lazyTwo2" : "lazyTwo1 != lazyTwo2"));

        LazySingletonThree lazyThree1 = LazySingletonThree.getInstance();
        LazySingletonThree lazyThree2 = LazySingletonThree.getInstance();
        System.out.println((lazyThree1 == lazyThree2 ? "lazyThree1 == lazyThree2" : "lazyThree1 != lazyThree2"));

        EnumSingleton Enum1 = EnumSingleton.INSTANCE ;
        EnumSingleton Enum2 = EnumSingleton.INSTANCE ;
        System.out.println((Enum1 == Enum2 ? "Enum1 == Enum2" : "Enum1 != Enum2")); // idea 中直接提示 "Enum1 == Enum2" is always true
    }
}
