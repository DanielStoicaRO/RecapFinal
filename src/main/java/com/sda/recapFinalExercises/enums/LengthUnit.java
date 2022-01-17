package com.sda.recapFinalExercises.enums;

public enum LengthUnit {

    METER(1),
    CENTIMETER(0.01),
    FOOT(0.3),
    INCH(0.025);

   private double valueInMeters;

    LengthUnit(double valueInMeters) {
        this.valueInMeters = valueInMeters;
    }

    public double getValueInMeters() {
        return valueInMeters;
    }
}
