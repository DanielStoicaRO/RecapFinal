package com.sda.recapFinalExercises.Abstract;

import java.time.LocalDate;

public class Dog extends Animal{
    public Dog(String name, LocalDate dateOfBirth, String breed, Color color) {
        super(name, dateOfBirth, breed, color);
    }
    @Override
    public String yieldVoice() {
        return "woof woof";
    }
}
