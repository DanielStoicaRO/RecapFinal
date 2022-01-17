package com.sda.recapFinalExercises.enums;

public class Main {
    public static void main(String[] args) {

        LengthUnit[] elements = LengthUnit.values();

        for (int i = 0; i < elements.length; i++) {
            System.out.println(  elements[i].ordinal()+ " - " + elements[i].name());
        }

    }
}
