package com.sda.recapFinalExercises.exceptions;

public class ExceptionExample {

    public static void main(String[] args) {

        try {
            // generationg a division by 0 exception
            // use x = 5 / 0 to generate the exception
            int x = 5 / 0;
            // generation an index out of bounds exception
            // use System.out.println(arr[2]) to generate the exception
            int[] arr = {10, 7};
            System.out.println(arr[1]);
            // generating a null pointer exception
            // use s = null to generate the exception
            String s = "";
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } catch (Exception e) {
            System.out.println("Another exception: " + e.getMessage());
        } finally {
            // code is executed no matter if an exception was caught or not
            System.out.println("Good bye!");
        }
        System.out.println("Program ran without exceptions or exceptions were handled :)");


    }
}
