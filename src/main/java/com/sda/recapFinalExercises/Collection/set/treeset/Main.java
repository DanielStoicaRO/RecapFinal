package com.sda.recapFinalExercises.Collection.set.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class Main
{
    /**
     * The TreeSet is a sorted collection that extends the AbstractSet class and implements the NavigableSet interface.
     * Here's a quick summary of the most important aspects of this implementation:
     * - It stores unique elements
     * - It doesn't preserve the insertion order of the elements
     * - It sorts the elements in ascending order
     * - It's not thread-safe
     *
     *  TreeSet no longer supports the addition of null.
     */
    public static void main(String[] args)
    {

        Set<String> travelRoute = new TreeSet<>();

        // We can construct a TreeSet with a constructor that lets us define the order in which the elements get sorted by using a Comparable or Comparator:
        Set<String> treeSetWithComparator = new TreeSet<>(Comparator.comparing(String::length));

        travelRoute.add("Berlin");
        travelRoute.add("Paris");
        travelRoute.add("Madrid");
        travelRoute.add("Cluj");
        travelRoute.add("Paris");
        travelRoute.add("Berlin");
        travelRoute.remove("Paris");

        // The contains() method is used to check if a given element is present in a given TreeSet.
        System.out.println("Is Cluj present ?" + travelRoute.contains("Cluj"));

        // The remove() method is used to remove the specified element from the set if it's present.
        travelRoute.remove("Cluj");

        for (String country : travelRoute)
        {
            System.out.print(country + " ");
        }

        // The size() method is used to identify the number of elements present in the TreeSet. It's one of the fundamental methods in the API:
        System.out.println("Travel routes in set: " + travelRoute.size());

        // If we want to remove all the items from a set, we can use the clear() method:
        travelRoute.clear();

        // The isEmpty() method can be used to figure out if a given TreeSet instance is empty or not:
        System.out.println("Is the travel routes set empty ? " + travelRoute.isEmpty());


        // ---------- METHODS SPECIFIC TO TREE SET -------------
        TreeSet<String> treeSetTravelRoute = (TreeSet<String>) travelRoute;
        treeSetTravelRoute.add("Berlin");

        // This method returns the first element from a TreeSet if it's not empty. Otherwise, it throws a NoSuchElementException.
        System.out.println("First element in set is " + treeSetTravelRoute.first());

        // Analogously to the above example, this method will return the last element if the set is not empty:
        treeSetTravelRoute.add("Cluj");
        System.out.println("Last element in set is " + treeSetTravelRoute.last());

    }
}
