package com.sda.recapFinalExercises.Collection.set.hashset;

import java.util.HashSet;
import java.util.Set;


public class Main
{

    /**
     * HashSet is one of the fundamental data structures in the Java Collections API.
     * <p>
     * Let's recall the most important aspects of this implementation:
     * <p>
     * It stores unique elements and permits nulls
     * It's backed by a HashMap
     * It doesn't maintain insertion order
     * It's not thread-safe
     * <p>
     * Note that this internal HashMap gets initialized when an instance of the HashSet is created:
     * public HashSet() {
     * map = new HashMap<>();
     * }
     */
    public static void main(String[] args)
    {
        setExample();

        setFullExample();
    }

    private static void setExample()
    {
        Set<String> travelRoute = new HashSet<>();

        travelRoute.add("Berlin");
        travelRoute.add("Paris");
        travelRoute.add("Madrid");
        travelRoute.add("Paris");
        travelRoute.add("Berlin");

        travelRoute.remove("Paris");

        // prints Berlin Madrid, order may differ
        // as set is not ordered
        for (String country : travelRoute)
        {
            System.out.print(country + " ");
        }
    }

    private static void setFullExample()
    {
        Set<String> travelRoute = new HashSet<>();

        // The add() method can be used for adding elements to a set.
        // The method contract states that an element will be added only when it isn't already present in a set.
        // If an element was added, the method returns true, otherwise – false.
        travelRoute.add("Berlin");
        travelRoute.add("Paris");
        travelRoute.add("Madrid");
        travelRoute.add("Paris");
        travelRoute.add("Berlin");

        // The purpose of the contains method is to check if an element is present in a given HashSet.
        // It returns true if the element is found, otherwise false.
        System.out.println("Is Berlin present ? " + travelRoute.contains("Berlin"));

        // The method removes the specified element from the set if it's present.
        // This method returns true if a set contained the specified element.
        travelRoute.remove("Paris");

        // This is one of the fundamental methods in the API.
        // It's used heavily as it helps in identifying the number of elements present in the HashSet.
        // The underlying implementation simply delegates the calculation to the HashMap's size() method.
        System.out.println("The number of travel routes is " + travelRoute.size());

        // prints Berlin Madrid, order may differ
        // as set is not ordered
        for (String country : travelRoute)
        {
            System.out.print(country + " ");
        }

        // We use this method when we intend to remove all the items from a set.
        // The underlying implementation simply clears all elements from the underlying HashMap.
        travelRoute.clear();

        // We can use this method to figure if a given instance of a HashSet is empty or not.
        // This method returns true if the set contains no elements:
        System.out.println("Is the travel routes set empty ? " + travelRoute.isEmpty());
    }
}
