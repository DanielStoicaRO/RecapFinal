package com.sda.dsSDA.gPrototype.aShallowcopy;

import java.util.Arrays;

public class Example {

    private int[] data;

    public Example(int[] dataValues) {
        this.data = dataValues;
    }

    public void showData(){
        System.out.println(Arrays.toString(data));
    }
}
