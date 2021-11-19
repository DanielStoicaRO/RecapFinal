package com.sda.recapFinalExercises.Collection.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Dacia");
        cars.add("Mercedes");

        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println(cars);
        System.out.println(cars.get(2));

        cars.add(0, "Add Car 0");
        System.out.println(cars);
        System.out.println(cars.size());
        cars.remove(0);
        System.out.println(cars);

//        for( String car : cars){
//            System.out.println( car + " ");
//        }
        System.out.println("==== ITERATOR ====");
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }

        System.out.println("===========");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(11);
        numbers.add(7);
        numbers.add(2);
        numbers.add(6);

        System.out.println("List before sort " + numbers);

        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        System.out.println("List after sort " + numbers);

    }
}
