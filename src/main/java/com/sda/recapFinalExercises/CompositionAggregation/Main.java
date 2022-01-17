package com.sda.recapFinalExercises.CompositionAggregation;

public class Main {

    public static void main(String[] args) {

        Bikes bike = new Bikes();
        bike.bikeHasWheels();
        bike.setColour("Bike Red");
        bike.setSpeed(100);
        System.out.println(bike);

        Cars car = new Cars();
        car.carsHasWheels();
        car.setColour("Car Blue");
        System.out.println(car);

        car.methodIsNull("Honda");
        System.out.println(car.getBrand());

    }
}
