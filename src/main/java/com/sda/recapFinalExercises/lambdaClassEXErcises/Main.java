package com.sda.recapFinalExercises.lambdaClassEXErcises;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        List<String> listaX = new ArrayList<>();
        listaX.add("Ana");
        listaX.add("Maria");
        listaX.add("Diana");
        listaX.add("Alexandra");
        listaX.add("Strychnine");

        System.out.println("processList ::: ");
        processList(listaX, item -> System.out.println(item + " ABC"));
        processList(listaX, item -> System.err.println("ERROR: " + item));

        processList(listaX, das -> System.out.println(das + " cacat "));

        System.out.println("printValidateIntems  ::: ");
        printValidateIntems(listaX, item -> item.length() > 0);
        printValidateIntems(listaX, item -> item.startsWith("A"));

        System.out.println("printProcessIntem  ::: ");
        printProcessIntem(listaX, String::length);

        System.out.println("printProcessList  ::: ");
        printProcessList(listaX, item -> item.toLowerCase(Locale.ROOT));
        printProcessList(listaX, item -> item.toUpperCase(Locale.ROOT));
        printProcessList(listaX, item -> item.trim());
    }


    public static void processList(List<String> lista, Consumer<String> consumer) {
        for (String item : lista) {
            consumer.accept(item);
        }
    }

    public static void printValidateIntems(List<String> lista, Predicate<String> predicate) {
        for (String item : lista) {
            if (predicate.test(item)) {
                System.out.println(item);
            }
        }
    }

    public static void printProcessIntem(List<String> lista, Function<String, Integer> function) {
        for (String item : lista) {
            System.out.println(function.apply(item));
        }
    }

    public static void printProcessList(List<String> lista, UnaryOperator<String> unaryOperator) {
        for (String item : lista) {
            System.out.println(unaryOperator.apply(item));
        }
    }
}
