package com.sda.dsSDA.dBuilderApp;

public class Main {
    public static void main(String[] args) {


        MealBuilder mealBuilder = new MealBuilder();

        System.out.println("prepareVeganMeal");
        MealMenu veganMeal = mealBuilder.prepareVeganMeal();
        veganMeal.showItems();
        veganMeal.getCost();

        System.out.println("======");
        System.out.println("prepareNonVeganMeal");
        MealMenu nonVeganMeal = mealBuilder.prepareNonVeganMeal();
        nonVeganMeal.showItems();
        nonVeganMeal.getCost();



    }


}
