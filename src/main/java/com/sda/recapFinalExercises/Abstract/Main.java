package com.sda.recapFinalExercises.Abstract;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Garfield", LocalDate.of(2019, 05, 24), "Persian", Color.ORANGE),
                new Dog("Rex", LocalDate.of(2020, 02, 19), "French Bulldog", Color.BROWN),
                new Horse("Voxy", LocalDate.of(2004, 03, 15), "Anglo Arabian", Color.BLACK)
        };
        for (Animal currentAnimal : animals
        ) {
            System.out.println(currentAnimal);
        }
    }
}
