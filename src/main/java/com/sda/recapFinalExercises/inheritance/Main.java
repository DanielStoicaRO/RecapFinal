package com.sda.recapFinalExercises.inheritance;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2, 4);
        Circle circle = new Circle(4);

        System.out.println("rectangle area: " + rectangle.getArea()
                + " perimeter " + rectangle.getPerimeter());

        System.out.println("circle area: " + circle.getArea()
                + " perimeter " + circle.getPerimeter());


        Shape shape = new Rectangle(2,5);
        shape.getDimension();


    }
}
