package com.sda.recapFinalExercises.Abstract;

import java.time.LocalDate;

public class Cat extends Animal{

    public Cat(String name, LocalDate dateOfBirth, String breed, Color color) {
        super(name, dateOfBirth, breed, color);
    }

    @Override
    public String yieldVoice() {
        return "meow";
    }
}
