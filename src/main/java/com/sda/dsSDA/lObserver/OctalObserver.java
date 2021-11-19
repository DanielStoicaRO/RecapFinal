package com.sda.dsSDA.lObserver;

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("OCTAL string: " + Integer.toOctalString(subject.getState()));
    }

}
