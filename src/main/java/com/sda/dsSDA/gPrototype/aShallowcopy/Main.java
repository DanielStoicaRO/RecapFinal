package com.sda.dsSDA.gPrototype.aShallowcopy;

public class Main {
    public static void main(String[] args) {

        int[] dataValues = {1, 2, 3, 4};

        Example example = new Example(dataValues);

        //array initial
        example.showData();

        //modify array
        dataValues[0] = 13;
        example.showData();

    }
}
