package com.sda.recapFinalExercises.Collection.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExeCarsList {
    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();

        String input = "";

        while (!input.trim().equalsIgnoreCase("stop")) {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();

            System.out.println(input);

            if (input.equals("stop")){
                System.out.println("program stop");
                break;
            }

            if (!cars.contains(input)) {
                if (!input.equals("stop")) cars.add(input);
                System.out.println("car added");
            } else {
                System.out.println("already in list");
            }
        }

        System.out.println(cars);

    }
}

