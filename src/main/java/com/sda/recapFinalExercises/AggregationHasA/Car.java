package com.sda.recapFinalExercises.AggregationHasA;

// Java Program to Illustrate has-a relation

// Class1
// Parent class
public class Car {
    private String brand;
    // Instance members of class Car
    private String color;
    private int maxSpeed;

    public Car(String color, int maxSpeed, String brand) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }

    // Methods implementation

    // Method 1
    // To set the maximum speed of car
    public void setMaxSpeed(int maxSpeed) {
        // This keyword refers to current object itself
        this.maxSpeed = maxSpeed;
    }

    // Method 2
    // To set the color of car
    public void setColor(String color) {
        // This keyword refers to current object
        this.color = color;
    }

    // Method 3
    // To display car information

    public void carInfo() {
        // Print the car information - cacat and speed
        System.out.println("Vehicle Color= " + color
                + " Max Speed= " + maxSpeed + " brand : " + brand);
    }



}
