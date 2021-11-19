package com.sda.dsSDA.gPrototype.bDeepcopy;

import java.util.Arrays;

public class Example {

    private int[] data;

    //different constructor type
    public Example(int[] dataValues) {
        this.data = new int[dataValues.length];

        for (int i = 0; i < dataValues.length; i++) {
            this.data[i] = dataValues[i];
        }
    }

    public void showData(){
        System.out.println(Arrays.toString(this.data));
    }
}
