package com.sda.dsSDA.cBuilderRecap;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car.CarBuilder("BMW", "white", 4)
                .setAerCondition(true)
                .setAlloyWheels(true)
                .build();
        System.out.println(car1);

        Car car2 = new Car.CarBuilder("Dacia", "green", 4)
                .build();
        System.out.println(car2);

        Motorcycle motorcycle = Motorcycle.builder()
                .power("250")
                .speed(300)
                .colour("red")
                .decals(true)
                .storageBox(true)
                .build();
        System.out.println(motorcycle);


    }
}
