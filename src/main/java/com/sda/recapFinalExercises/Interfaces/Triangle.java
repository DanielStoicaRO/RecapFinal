package com.sda.recapFinalExercises.Interfaces;

public class Triangle implements Shape {

    private double l1, l2, l3;

    public Triangle(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - l1) * (s - l2) * (s - l3));
    }

    @Override
    public double[] getDimensions() {
        return new double[]{l1, l2, l3};
    }

    @Override
    public String printDimensions() {
        return "dimensions: " + l1 + " x " + l2 + " x " + l3;
    }
}
