package com.pattern;

/**
 * 懒汉式
 */
public class LazySingleton {
    private LazySingleton(){}
    private static LazySingleton lazySingleton;
    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            synchronized (LazySingleton.class){
                if(lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
