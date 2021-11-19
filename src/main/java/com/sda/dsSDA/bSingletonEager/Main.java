package com.sda.dsSDA.bSingletonEager;

public class Main {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("===========");
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println("===========");

//        both point to same object in memory:
//        com.sda.dsSDA.aSingletonLazy.Singleton@65ab7765
//        com.sda.dsSDA.aSingletonLazy.Singleton@65ab7765


        // always object are the same:
        System.out.println("singleton1 Eager: " + singleton1.getCounter());
        System.out.println("singleton2 Eager: " + singleton2.getCounter());
        System.out.println("===========");

        singleton1.setCounter(10);
        System.out.println("singleton1 Eager: " + singleton1.getCounter());
        System.out.println("singleton2 Eager: " + singleton2.getCounter());

    }
}
