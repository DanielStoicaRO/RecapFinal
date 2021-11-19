package com.sda.recapFinalExercises.DependencyInversion;

public class Movie implements ComputerOperation{
    @Override
    public void operation() {
        System.out.println("Play Movie");
    }
}
