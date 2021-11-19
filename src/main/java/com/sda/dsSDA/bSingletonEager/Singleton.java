package com.sda.dsSDA.bSingletonEager;

public class Singleton {

    private static Singleton instance = new Singleton();

    private int counter;

    private Singleton() {
        System.out.println("=> => => => => => ");
        System.out.println("Engine Java START: Hello from Singleton Constructor EAGER !");
    }

    public static Singleton getInstance() {
        return instance;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
