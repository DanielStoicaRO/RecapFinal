package com.sda.dsSDA.eFactoryRecap;

public class Main {
    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();

        Car car1 = carFactory.getCar("FamilyCar");
        car1.carType();

        Car car2 = carFactory.getCar("SportCar");
        car2.carType();
    }
}
