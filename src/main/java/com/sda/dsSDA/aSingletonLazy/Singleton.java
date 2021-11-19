package com.sda.dsSDA.aSingletonLazy;

public class Singleton {

    private static Singleton instance;

    private int counter;

    private Singleton() {
        System.out.println("=> => => => => => ");
        System.out.println("Engine Java START: Hello from Singleton Constructor LAZY !");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
