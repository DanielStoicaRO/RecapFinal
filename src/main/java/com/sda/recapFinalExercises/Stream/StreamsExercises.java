package com.sda.recapFinalExercises.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExercises {

    /*
    Perform the following operations on the given lists using streams and lambda expressions:
    ["John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn"]
    [1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50]
    a) Sort the list.
    b) Print only those names, that start with letter E.
    c) Print values greater than 30 and lower than 200.
    d) Print names uppercase.
    e) Remove first and last letter , sort and print names.
    f) Sort backwards by implementing reverse Comparator and using lambda expression.
     */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");

        List<Integer> numbers = Arrays.asList(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 5);

        System.out.println("Sorted lists:");
        System.out.println(names
                .stream()
                .sorted()
                .collect(Collectors.toList()));

        System.out.println(numbers
                .stream()
                .sorted()
                .collect(Collectors.toList()));

        System.out.println("\nNames starting with E :");
        System.out.println(names
                .stream()
                .filter(s -> s.startsWith("E"))
                .collect(Collectors.toList()));

        System.out.println("\nNumbers greater than 30 and lower than 200 & sorted:");
        System.out.println(numbers
                .stream()
                .filter(i -> i > 30 && i < 200)
                .sorted()
                .collect(Collectors.toList()));

        System.out.println("\nNames in uppercase:");
        System.out.println(names
                .stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList()));

        System.out.println("\nNames with first and last letter removed and then sorted");
        System.out.println(names
                .stream()
                .map(s -> s.substring(1, s.length() - 1))
                .sorted()
                .collect(Collectors.toList()));

        System.out.println("\nSorted lists in reverse order:");
        System.out.println(names
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));
        System.out.println(numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));
    }
}
