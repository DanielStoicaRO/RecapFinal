package com.sda.recapFinalExercises.enums;

import java.util.Scanner;

public class UnitConvertor {

    public static LengthUnit showMenuAndReadOption(String message) {

        LengthUnit[] elements = LengthUnit.values();
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i].ordinal() + " - " + elements[i].name());
        }

        int option = scanner.nextInt();


        return elements[option];
    }

    public static double convert(double value, LengthUnit unit, LengthUnit newUnit) {
        double valueInMeters = value * unit.getValueInMeters();
        double valueInNewUnit = valueInMeters / newUnit.getValueInMeters();
        return valueInNewUnit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LengthUnit unitToConvertFrom = showMenuAndReadOption("Chose unit to convert FROM: ");
        LengthUnit unitToConvertTo = showMenuAndReadOption("Chose unit to convert TO: ");
        System.out.println("Input value in " + unitToConvertFrom.name().toLowerCase() + ": ");

        double value = scanner.nextDouble();
        double valueInNewUnit = convert(value, unitToConvertFrom, unitToConvertTo);

        System.out.printf("Converted value in " + unitToConvertTo.name().toLowerCase() + " : %.2f", valueInNewUnit);

    }
}
