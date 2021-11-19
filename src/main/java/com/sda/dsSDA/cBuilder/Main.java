package com.sda.dsSDA.cBuilder;

public class Main {
    public static void main(String[] args) {

//        make computer just with required fields
        Computer computer1 = new Computer.ComputerBuilder("intel i7", "1tb", "32gb")
                .build();

//        make computer with all fields
        Computer computer2 = new Computer.ComputerBuilder("intel i7", "1tb", "32gb")
                .setBluetoothEnable(true)
                .setGraphicCardEnable(true)
                .build();




//Version 2 cu LOMBOK BUILDER
        ComputerLombok computerLombok = ComputerLombok.builder()
                .CPU("i8")
                .HDD("2tb")
                .RAM("32gb")
                .isBluetoothEnable(true)
                .isGraphicCardEnable(true)
                .build();




    }
}
