package com.pattern;

public class Main {
    public static void main(String[] args) {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();//饿汉式
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();//饿汉式

        LazySingleton lazySingleton = LazySingleton.getInstance();//懒汉式
        LazySingleton lazySingleton1 = LazySingleton.getInstance();//懒汉式

        System.out.println(hungrySingleton.getClass().hashCode());
        System.out.println(hungrySingleton1.getClass().hashCode());
        System.out.println(lazySingleton.getClass().hashCode());
        System.out.println(lazySingleton1.getClass().hashCode());
    }
}
