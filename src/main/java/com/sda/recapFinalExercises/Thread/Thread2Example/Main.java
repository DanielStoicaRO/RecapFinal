package com.sda.recapFinalExercises.Thread.Thread2Example;

public class Main {
    public static void main(String[] args) {
        Bench bench = new Bench(3);
        SeatTakerThread st1 = new SeatTakerThread("Anna", bench);
        SeatTakerThread st2 = new SeatTakerThread("John", bench);
        SeatTakerThread st3 = new SeatTakerThread("Mary", bench);
        SeatTakerThread st4 = new SeatTakerThread("Peter", bench);
        // lunching the threads
        st1.start();
        st2.start();
        st3.start();
        st4.start();
    }
}
