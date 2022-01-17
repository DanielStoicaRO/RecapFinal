package com.sda.recapFinalExercises.CompositionAggregation;

public class Vehicle {

   private String colour;
    int speed;

    public Vehicle() {
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "colour='" + colour + '\'' +
                ", speed=" + speed +
                '}';
    }
}
