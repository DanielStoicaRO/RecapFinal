package com.sda.recapFinalExercises.overrideEx2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {

    int maxSpeed;
    String colour;
    boolean engine;

    public Vehicle(int maxSpeed, String colour, boolean engine) {
        this.maxSpeed = maxSpeed;
        this.colour = colour;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maxSpeed=" + maxSpeed +
                ", colour='" + colour + '\'' +
                ", engine=" + engine +
                '}';
    }
}
