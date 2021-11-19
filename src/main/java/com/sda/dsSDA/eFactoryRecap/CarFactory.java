package com.sda.dsSDA.eFactoryRecap;

public class CarFactory {

    public Car getCar(String carType) {

        if (carType.equals("FamilyCar")) {
            return new FamilyCar();
        } else if (carType.equals("SportCar")) {
            return new SportCar();
        }
        return null;

    }
}
