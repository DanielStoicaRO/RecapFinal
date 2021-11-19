package com.sda.recapFinalExercises.DependencyInversion;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer();

        computer.operation(new Game());
        computer.operation(new Movie());
    }
}
