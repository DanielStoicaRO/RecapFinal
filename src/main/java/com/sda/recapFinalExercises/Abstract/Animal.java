package com.sda.recapFinalExercises.Abstract;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;

public abstract class Animal { private String name;
    private LocalDate dateOfBirth;
    private String breed;
    private Color color;

    public Animal(String name, LocalDate dateOfBirth, String breed, Color color) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.breed = breed;
        this.color = color;
    }

    public abstract String yieldVoice();

    public int getAge() {
        LocalDate today = LocalDate.now();
        return Period.between(dateOfBirth, today).getYears();
    }

    //Voxy is a 17 years old black horse of Anglo Arab breed: neigh neigh!
    @Override
    public String toString() {
        return
                name + " is a " +
                        this.getAge() + " years old " + color.name().toLowerCase(Locale.ROOT)
                        + " " + this.getClass().getSimpleName().toLowerCase(Locale.ROOT) + " of " +
                        breed + " breed: " + this.yieldVoice() + "!";
    }
}

