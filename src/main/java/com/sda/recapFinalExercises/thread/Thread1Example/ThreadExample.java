package com.sda.recapFinalExercises.thread.Thread1Example;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        StopWatchThread sw1 = new StopWatchThread("sw1");
        StopWatchThread sw2 = new StopWatchThread("sw2");
        sw1.start();
        sw2.start();
        System.out.println("Main thread starts");
        Thread.sleep(5000);
        System.out.println("Main thread is running");
        Thread.sleep(5000);
        System.out.println("Main thread ends");
    }
}
