package com.sda.recapVehicle;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car implements Vehicle{

    private String brand;
    private String model;
    private CarType type;

    public Car(String brand, String model, CarType type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String brand() {
        return null;
    }

    @Override
    public String model() {
        return null;
    }

}
