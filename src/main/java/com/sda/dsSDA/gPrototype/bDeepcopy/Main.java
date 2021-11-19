package com.sda.dsSDA.gPrototype.bDeepcopy;


public class Main {
    public static void main(String[] args) {
        int[] dataValues = {2, 4, 6, 8};

        Example example = new Example(dataValues);

        //array initial
        example.showData();

        //The Big difference: try to modify array is not possible!
        dataValues[0] = 14;
        example.showData();
    }
}
