package com.sda.recapFinalExercises.Lambda.exe1;

import java.util.Random;
import java.util.function.*;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person("Ana", "Popescu", 18);

        // without lambda expressions
        AdultPersonTest adultPersonTest = new AdultPersonTest();
        System.out.println(person + " is an adult? " + adultPersonTest.test(person));

        // with lambda expressions
        Predicate<Person> adultPersonTestLambda = p -> p.getAge() >= 18;
        System.out.println(person + " is an adult? " + adultPersonTestLambda.test(person));

        // other lambda examples
        // implementing a method without parameters with return type void
        System.out.println(" implementing a method without parameters with return type void");
        Runnable myRunnable = () -> System.out.println("Running!");
        myRunnable.run();

        // testing if a String starts with ABC
        System.out.println("testing if a String starts with ABC");
        Predicate<String> startsWithABC = s -> s.startsWith("ABC");
        System.out.println(startsWithABC.test("ABCDE"));

        // using Function interface to return the length of a String
        System.out.println("using Function interface to return the length of a String");
        Function<String, Integer> stringLengthFunction = s -> s.length();
        System.out.println(stringLengthFunction.apply("Hello"));

        // using Function interface to replace , with . in a String
        System.out.println("using Function interface to replace , with . in a String");
        Function<String, String> replaceCommasWithDotsFunction = s -> s.replace(',', '.');
        System.out.println(replaceCommasWithDotsFunction.apply("a, b, c"));

        // using lambda expression to refer a method
        System.out.println("using lambda expression to refer a method");
        Predicate<Person> adultPersonTestMethodReference = Person::isAdult;
        System.out.println(person + " is an adult? " + adultPersonTestMethodReference.test(person));

        // using Supplier interface to generate a random integer number
        System.out.println("using Supplier interface to generate a random integer number");
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt();
        System.out.println(randomNumberSupplier.get());

        // using Consumer interface to print a number with some message
        System.out.println("using Consumer interface to print a number with some message");
        Consumer<Integer> printAgeConsumer = n -> System.out.println(n + " years old");
        printAgeConsumer.accept(8);

        // using UnaryOperator interface to calculate square power of a number
        System.out.println("using UnaryOperator interface to calculate square power of a number");
        UnaryOperator<Double> toSquareUnaryOperator = d -> d * d;
        System.out.println(toSquareUnaryOperator.apply(5.0));

        // using UnaryOperator interface to calculate square power of a number with a block of code
        System.out.println("using UnaryOperator interface to calculate square power of a number with a block of code");
        UnaryOperator<Double> toSquareUnaryOperator2 = d -> {
            double result = d * d;
            System.out.println(d + " to square is " + result);
            return result;
        };
        toSquareUnaryOperator2.apply(3.0);
    }
}
