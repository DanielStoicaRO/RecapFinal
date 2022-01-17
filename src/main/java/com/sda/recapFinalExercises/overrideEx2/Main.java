package com.sda.recapFinalExercises.overrideEx2;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicleCar = new Car(200, "red", true);
        Vehicle vehicleBike = new Bike(35, "white", false);

        System.out.println(vehicleCar);
        System.out.println(vehicleBike);

    }
}
