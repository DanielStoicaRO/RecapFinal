package com.sda.recapFinalExercises.Interfaces;

public class Rectangle implements Shape {


    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double[] getDimensions() {
        return new double[]{length, width, length, width};
    }

    @Override
    public String printDimensions() {
        return "dimensions: " + length + " x " + width;
    }
}
