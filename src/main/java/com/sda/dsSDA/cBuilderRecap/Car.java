package com.sda.dsSDA.cBuilderRecap;

public class Car {

    private String engine;
    private String colour;
    private int doors;

    private boolean alloyWheels;
    private boolean aerCondition;

    @Override
    public String toString() {
        return "Car {" +
                "engine='" + engine + '\'' +
                ", colour='" + colour + '\'' +
                ", doors=" + doors +
                ", alloyWheels=" + alloyWheels +
                ", aerCondition=" + aerCondition +
                '}';
    }

    public Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.colour = builder.colour;
        this.doors = builder.doors;
        this.aerCondition = builder.aerCondition;
        this.alloyWheels = builder.alloyWheels;
    }

    public static class CarBuilder {
        private String engine;
        private String colour;
        private int doors;

        private boolean alloyWheels;
        private boolean aerCondition;

        public CarBuilder(String engine, String colour, int doors) {
            this.engine = engine;
            this.colour = colour;
            this.doors = doors;
        }

        public CarBuilder setAlloyWheels(boolean alloyWheels) {
            this.alloyWheels = alloyWheels;
            return this;
        }

        public CarBuilder setAerCondition(boolean aerCondition) {
            this.aerCondition = aerCondition;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

}
