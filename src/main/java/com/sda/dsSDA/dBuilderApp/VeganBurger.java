package com.sda.dsSDA.dBuilderApp;

public class VeganBurger extends Burger{
    @Override
    public String name() {
        return "Vegan burger";
    }

    @Override
    public float price() {
        return 20.09f;
    }
}
