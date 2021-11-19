package com.sda.dsSDA.dBuilderApp;

import java.util.ArrayList;
import java.util.List;

public class MealMenu {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }
    public float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }
    
    public void showItems(){
        for (Item item : items) {
            System.out.println("Item: " + item.name() + " is packed in " + item.packing().pack()
            + " and cost " + item.price());
        }
    }



}
