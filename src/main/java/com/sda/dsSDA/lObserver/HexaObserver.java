package com.sda.dsSDA.lObserver;

public class HexaObserver extends Observer{

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("HEXA string: " + Integer.toHexString(subject.getState()));
    }
}
