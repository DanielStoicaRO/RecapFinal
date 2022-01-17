package com.sda.recapFinalExercises.nestedClass;

public class NestedClassesExample {
    public static void main(String[] args) {

        Bicycle myBicycle = new Bicycle();

        System.out.print("Initial max speed: ");
        System.out.println(myBicycle.getMaxSpeed());

        // non-static inner class
        Bicycle.Wheel wheel = myBicycle.new Wheel();
        wheel.damage();
        System.out.print("Max speed after wheel damage: ");
        System.out.println(myBicycle.getMaxSpeed());

        // static inner class
        Bicycle.Mechanic mechanic = new Bicycle.Mechanic();
        mechanic.repair(myBicycle);
        System.out.print("Max speed after repair: ");
        System.out.println(myBicycle.getMaxSpeed());
    }
}
