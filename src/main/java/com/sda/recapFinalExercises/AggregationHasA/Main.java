package com.sda.recapFinalExercises.AggregationHasA;


/**
 * 1.Car class has a couple of instance variable and few methods
 * 2.Maserati is a type of car that extends the Car class that shows Maserati is a Car.
 * Maserati also uses an Engine’s method, stop, using composition. So it shows that a Maserati has an Engine.
 * 3.The Engine class has the two methods start() and stop() that are used by the Maserati class.
 **/


public class Main {
    public static void main(String[] args) {
        // Creating an object of Car class
        Car car = new Car("Green", 329, "Car");

        car.setMaxSpeed(123);

        Maserati maserati = new Maserati("RED", 235, "Maserati");

        maserati.MaseratiStartDemo();

        MotorBike motorBike = new MotorBike("Blue", 111, "Yamaha");
        motorBike.BikeStartDemo();

        car.carInfo();
        motorBike.carInfo();
        maserati.carInfo();
    }
}
