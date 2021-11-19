package com.sda.recapFinalExercises.Interfaces;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(3, 4),
                new Circle(7),
                new Triangle(3, 4, 5),

        };

        double totalPerimeter = 0;
        double totalArea = 0;
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].printShape());
            totalPerimeter += shapes[i].getPerimeter();
            totalArea += shapes[i].getArea();
        }

        System.out.printf("%nTotal perimeter: %.2f", totalPerimeter);
        System.out.printf("%nTotal area: %.2f", totalArea);
    }
}

