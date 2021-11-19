package com.sda.recapFinalExercises.Lambda.exe2;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ArithmeticOperations {

//    public static void main(String[] args) {
//        BinaryOperator<Double> addition = (a, b) -> (a + b);
//        System.out.println(addition.apply(3.0, 5.0));
//        BinaryOperator<Double> subtraction = (a, b) -> (a - b);
//        System.out.println(subtraction.apply(3.0, 5.0));
//        BinaryOperator<Double> multiplication = (a, b) -> (a * b);
//        System.out.println(multiplication.apply(3.0, 5.0));
//        BinaryOperator<Double> division = (a, b) -> (a / b);
//        System.out.println(division.apply(3.0, 5.0));
//    }

    public static void main(String[] args) {
        // addition
        BiFunction<Double, Double, Double> addition = (i1, i2) -> i1 + i2;
        System.out.println(addition.apply(2.0, 4.0));
        // subtraction
        BiFunction<Double, Double, Double> subtraction = (i1, i2) -> i1 - i2;
        System.out.println(subtraction.apply(2.0, 4.0));
        // multiplication
        BiFunction<Double, Double, Double> multiplication = (i1, i2) -> i1 * i2;
        System.out.println(multiplication.apply(2.0, 4.0));
        //division
        BiFunction<Double, Double, Double> division = (i1, i2) -> i1 / i2;
        System.out.println(division.apply(2.0, 4.0));
    }
}
