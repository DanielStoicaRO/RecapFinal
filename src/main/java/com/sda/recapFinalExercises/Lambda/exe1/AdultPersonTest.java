package com.sda.recapFinalExercises.Lambda.exe1;

import java.util.function.Predicate;

public class AdultPersonTest implements Predicate<Person> {

    @Override
    /*
    Using test method to check if a person is an adult.
     */
    public boolean test(Person person) {
        return person.getAge() >= 18;
    }
}