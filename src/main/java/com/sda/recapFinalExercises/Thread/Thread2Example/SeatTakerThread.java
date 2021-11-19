package com.sda.recapFinalExercises.Thread.Thread2Example;

public class SeatTakerThread extends Thread {
    private Bench bench;
    public SeatTakerThread(String name, Bench bench) {
        super(name);
        this.bench = bench;
    }
    @Override
    public void run() {
        bench.takeASeat(getName());
    }
}
