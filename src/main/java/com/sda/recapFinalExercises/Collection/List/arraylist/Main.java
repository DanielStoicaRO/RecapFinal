package com.sda.recapFinalExercises.Collection.List.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class Main {
    /**
     * ArrayList resides within Java Core Libraries, so you don't need any additional libraries. In order to use it just add the following import statement:
     * import java.util.ArrayList;
     * <p>
     * List represents an ordered sequence of values where some value may occur more than one time.
     * ArrayList is one of the List implementations built atop an array, which is able to dynamically grow and shrink as you add/remove elements.
     * Elements could be easily accessed by their indexes starting from zero.
     * This implementation has the following properties:
     * - Random access takes O(1) time
     * - Adding element takes amortized constant time O(1)
     * - Inserting/Deleting takes O(n) time
     * - Searching takes O(n) time for unsorted array and O(log n) for a sorted one
     */
    public static void main(String[] args) {
        listExample();

        listIteratorExample();

        listSortExample();

        listFullExample();
    }

    private static void listExample() {
        List<String> visitedCountries = new ArrayList<>();
        visitedCountries.add("Germany");
        visitedCountries.add("France");
        visitedCountries.add("Spain");

        visitedCountries.remove("France");

        // prints Germany Spain, as "France" was removed
        for (String country : visitedCountries) {
            System.out.print(country + " ");
        }
    }

    private static void listIteratorExample() {
        List<String> visitedCountries = new ArrayList<>();
        visitedCountries.add("Germany");
        visitedCountries.add("France");
        visitedCountries.add("Spain");

        visitedCountries.remove("France");

        // prints Germany Spain, as "France" was removed
        Iterator<String> iterator = visitedCountries.iterator();

        // prints Germany Spain, as "France" was removed
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    private static void listSortExample() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(10);
        numbers.add(1);
        numbers.add(5);

        System.out.println("List before sort " + numbers);

        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        System.out.println("List after sort " + numbers);
    }

    private static void listFullExample() {
        // ArrayList has several constructors and we will present them all in this section.
        // First, notice that ArrayList is a generic class, so you can parameterize it with any type you want and the compiler will ensure that,
        // for example, you will not be able to put Integer values inside a collection of Strings.
        // Also, you don't need to cast elements when retrieving them from a collection.
        //
        // Secondly, it is good practice to use generic interface List as a variable type, because it decouples it from a particular implementation.

        // Default No-Arg Constructor
        List<String> visitedCountries = new ArrayList<>();

        // How to add new items at the end of a list
        visitedCountries.add("Germany");
        visitedCountries.add("France");
        visitedCountries.add("Spain");

        // How to add a new item on a specified index ( index >=0, index <= length of list )
        visitedCountries.add(0, "USA");

        // Ho to get an item from a list based on index ( index >=0, index < length of list )
        System.out.println(visitedCountries.get(1));

        // How to access the list size
        System.out.println("I've visited " + visitedCountries.size() + " countries");

        // How to check if a specific element is present in a list
        System.out.println("I've visited Germany ? " + visitedCountries.contains("Germany"));
        System.out.println("I've visited Australia ? " + visitedCountries.contains("Australia"));

        // Foreach on the list
        for (String country : visitedCountries) {
            System.out.print(country + " ");
        }

        // For on the list
        for (int i = 0; i < visitedCountries.size(); i++) {
            System.out.print(visitedCountries.get(i) + " ");
        }

        // How to remove a specific item from a list
        visitedCountries.remove("France");
        // How to remove an item from a list based on index
        visitedCountries.remove(1);

        // How to remove all elements from a list
        visitedCountries.clear();
        System.out.println("I've visited " + visitedCountries.size() + "countries");

        // How to check if a list is empty
        System.out.println("Is the visited country list empty ?" + visitedCountries.isEmpty());
    }
}
