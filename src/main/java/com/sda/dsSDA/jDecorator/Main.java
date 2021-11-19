package com.sda.dsSDA.jDecorator;

public class Main {
    public static void main(String[] args) {

        ShapeInterface circle = new Circle();
        //draw circle
        circle.draw();

        ShapeInterface redCircle = new RedShapeDecorator(new Circle());
        System.out.println("===== ===== =====");
        //draw circle and make redBorder
        redCircle.draw();

        ShapeInterface blueCircle = new BlueShapeDecorator(new Circle());
        System.out.println("===== ===== =====");
        //draw circle and make Blue Background
        blueCircle.draw();

    }
}
