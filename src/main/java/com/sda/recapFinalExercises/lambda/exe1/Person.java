package com.sda.recapFinalExercises.lambda.exe1;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age + " years old";
    }

    public boolean isAdult() {
        return this.age >= 18;
    }
}
