package com.sda.recapFinalExercises.CompositionAggregation;

public class Cars extends Vehicle {

    String brand ;


    public void methodIsNull(String brand) {

        if (brand.equals(setBrand(brand))) {
            System.out.println("Brand NOT NULL");
        }
    }


    public void carsHasWheels() {
        Wheels wheels = new Wheels();
        System.out.println("Car  HAS - A Wheel   ");
        wheels.runningWheels();
        wheels.stoppingWheels();
    }


    public String setBrand(String brand) {
        this.brand = brand;
        return brand;
    }

    public String getBrand() {
        return brand;
    }
}

