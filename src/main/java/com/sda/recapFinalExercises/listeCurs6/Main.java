package com.sda.recapFinalExercises.listeCurs6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        final Logger log = LoggerFactory.getLogger(ClassName.class);

        ClassName className = new ClassName();
        log.info("Log info.............", className.addName());

        System.out.println("Sorted list:");
        System.out.println(className.addName()
                .stream()
                .sorted()
                .collect(Collectors.toList()));

        System.out.println("\nNames start with E: ");
        System.out.println(className.addName()
                .stream()
                .filter(s -> s.startsWith("E"))
                .collect(Collectors.toList()));

        System.out.println("\nNames in uppercase:");
        System.out.println(className.addName()
                .stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList()));


    }
}
