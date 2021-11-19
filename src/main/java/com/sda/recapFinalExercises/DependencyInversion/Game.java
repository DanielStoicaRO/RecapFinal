package com.sda.recapFinalExercises.DependencyInversion;

public class Game implements ComputerOperation{
    @Override
    public void operation() {
        System.out.println("Play VideoGame");
    }
}
