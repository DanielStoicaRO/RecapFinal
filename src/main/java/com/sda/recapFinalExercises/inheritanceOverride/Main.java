package com.sda.recapFinalExercises.inheritanceOverride;

public class Main {

    public static void main(String[] args) {


        SubClassOne subClassOne = new SubClassOne();
        subClassOne.displayMethod("ONE");
        subClassOne.displayMethod(5);

        SubClassTwo subClassTwo = new SubClassTwo();
        subClassTwo.displayMethod("TWO");

    }
}
