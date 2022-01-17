package com.sda.recapFinalExercises.genericType;

public class GenericBox<T>{

    private T item;

    public GenericBox(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Inside this box is a " + item;
    }
}
