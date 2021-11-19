package com.sda.recapFinalExercises.Abstract;

import java.time.LocalDate;

public class Horse extends Animal{
    public Horse(String name, LocalDate dateOfBirth, String breed, Color color) {
        super(name, dateOfBirth, breed, color);
    }
    @Override
    public String yieldVoice() {
        return "neigh neigh";
    }
}
