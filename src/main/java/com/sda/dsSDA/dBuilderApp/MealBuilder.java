package com.sda.dsSDA.dBuilderApp;

public class MealBuilder {

    public MealMenu prepareVeganMeal(){
        MealMenu mealMenu = new MealMenu();
        mealMenu.addItem(new VeganBurger());
        mealMenu.addItem(new Coke());
        return mealMenu;
    }

    public MealMenu prepareNonVeganMeal(){
        MealMenu mealMenu = new MealMenu();
        mealMenu.addItem(new ChickenBurger());
        mealMenu.addItem(new Pepsi());
        return mealMenu;
    }

}
