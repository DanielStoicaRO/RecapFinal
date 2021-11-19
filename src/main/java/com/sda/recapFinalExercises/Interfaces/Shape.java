package com.sda.recapFinalExercises.Interfaces;

import java.text.DecimalFormat;

public interface Shape {

     default double getPerimeter() {
        double perimeter = 0;
        double[] dimensions = getDimensions();
        for (int i = 0; i < dimensions.length; i++) {
            perimeter += dimensions[i];
        }
        return perimeter;
    }

    double getArea();

    double[] getDimensions();

    String printDimensions();

    default String printShape() {
        DecimalFormat df = new DecimalFormat("###.00");
        return getClass().getSimpleName() + " " + printDimensions()
                + " perimeter: " + df.format(getPerimeter())
                + " area: " + df.format(getArea());
    }
}
