package com.sda.recapFinalExercises.Thread.Thread2Example;

public class Bench {
    private int availableSeats;

    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public synchronized void takeASeat(String name) {
        if (availableSeats > 0) {
            System.out.println(name + " is taking a seat.");
            availableSeats--;
            System.out.println("Free seats left " + availableSeats);
        } else {
            System.out.println("There are no seats left for " + name + " :(");
        }
    }
}
