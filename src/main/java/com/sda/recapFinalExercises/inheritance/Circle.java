package com.sda.recapFinalExercises.inheritance;

public class Circle extends Shape {

    public Circle(double radius) {
        super(new double[]{radius});
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public double getRadius() {
        return getDimension()[0];
    }

    public void setRadius(double radius) {
        getDimension()[0] = radius;

    }
}
