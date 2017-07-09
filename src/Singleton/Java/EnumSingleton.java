package Singleton.Java;

import java.util.Arrays;

/**
 * Created by prefert on 2017/7/8.
 */
public enum EnumSingleton {
    INSTANCE;
    private final String[] preference =
            {"intresting", "nice", "just so so"};

    public void printPreference() {
        System.out.println(Arrays.toString(preference));
    }
}


//    $ javap EnumSingleton.class
//   编译后：
//Compiled from "EnumSingleton.java"
//
//public final class Singleton.Java.EnumSingleton extends java.lang.Enum<Singleton.Java.EnumSingleton>{
//public static final Singleton.Java.EnumSingleton INSTANCE;
//public static Singleton.Java.EnumSingleton[]values();
//public static Singleton.Java.EnumSingleton valueOf(java.lang.String);
//public void printPreference();
//static {};
//        }

