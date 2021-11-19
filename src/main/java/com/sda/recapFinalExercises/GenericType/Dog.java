package com.sda.recapFinalExercises.GenericType;

public class Dog {

    private String name;
    private int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return age + " years old dog named " + name;
    }
}
