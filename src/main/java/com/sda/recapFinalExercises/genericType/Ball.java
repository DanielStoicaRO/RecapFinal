package com.sda.recapFinalExercises.genericType;

public class Ball {

    private String color;
    private int size;

    public Ball(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return  size + " cm "+ color + " ball";
    }
}
