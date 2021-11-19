package com.sda.dsSDA.lObserver;

public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        subject.setState(5);
        subject.setState(15);
        System.out.println("=======");

        subject.setState(10);


    }
}
