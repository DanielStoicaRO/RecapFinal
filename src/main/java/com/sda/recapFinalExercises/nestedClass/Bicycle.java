package com.sda.recapFinalExercises.nestedClass;

public class Bicycle {
    private int maxSpeed = 40;
    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Wheel class can access maxSpeed field from Bicycle
    // because is defined inside Bicycle class
    // and because is a non-static inner class
    // this way being bound to an object of type Bicycle
    public class Wheel {
        public void damage() {
            maxSpeed *= 0.5;
        }
    }

    public static class Mechanic {
        public void repair(Bicycle bicycle) {
            // nested static class can refer
            // private fields of outer class
            bicycle.maxSpeed += 15;
        }
    }
}
