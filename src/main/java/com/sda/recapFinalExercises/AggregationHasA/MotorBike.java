package com.sda.recapFinalExercises.AggregationHasA;

public class MotorBike extends Car {

    public MotorBike(String color, int maxSpeed, String brand) {
        super(color, maxSpeed, brand);
    }

    public void BikeStartDemo() {
        Engine engine = new Engine();
        engine.start();
        engine.stop();
    }


}
