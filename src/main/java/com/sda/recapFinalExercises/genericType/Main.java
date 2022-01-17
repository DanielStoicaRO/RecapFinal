package com.sda.recapFinalExercises.genericType;

public class Main {

    public static void main(String[] args) {
        GenericBox<Dog> boxWithADog = new GenericBox<>(new Dog("Max", 1));

        GenericBox<Ball> boxWithABall = new GenericBox<>(new Ball("red", 3));

        System.out.println(boxWithADog);

        System.out.println(boxWithABall);


    }
}
