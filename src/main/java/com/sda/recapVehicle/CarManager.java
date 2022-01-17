package com.sda.recapVehicle;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

    List<Car> cars = new ArrayList<>();

    public CarManager() {
        addCarsInStock();
    }

    public void addCarsInStock() {
        cars.add(new Car("BMW", "320", CarType.BMW));
        cars.add(new Car("Mercedes", "C", CarType.MERCEDES));
        cars.add(new Car("Audi", "B8", CarType.AUDI));
    }

    public Car getCar(int index) {
        return cars.get(index);
    }

    public void print() {
        int index = 1;
        for (Car element : cars) {
            System.out.println("Car No: " + index + " Type: "
                    + element.getType() + " " + element.getModel() + " "
                    + element.getBrand());
            index++;
        }
    }

    public void removeCar(int index){
        cars.remove(index);
    }
}
