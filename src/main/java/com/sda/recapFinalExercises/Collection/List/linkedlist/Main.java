package com.sda.recapFinalExercises.Collection.List.linkedlist;

import java.util.LinkedList;
import java.util.List;


public class Main
{
    /**
     * Below you can find the most important properties of the LinkedList:
     *
     * - Operations that index into the list will traverse the list from the beginning or the end, whichever is closer to the specified index
     * - It is not synchronized
     * - Its Iterator and ListIterator iterators are fail-fast (which means that after the iterator's creation, if the list is modified, a ConcurrentModificationException will be thrown)
     * - Every element is a node, which keeps a reference to the next and previous ones
     * - It maintains insertion order
     *
     * An ArrayList is an index based data structure backed by an Array. It provides random access to its elements with a performance equal to O(1).
     * On the other hand, a LinkedList stores its data as a list of elements and every element is linked to its previous and next element.
     * In this case, the search operation for an item has execution time equal to O(n).
     *
     * The insertion, addition and removal operations of an item are faster in a LinkedList because there is no need
     * to resize an array or update the index when an element is added to some arbitrary position inside the collection,
     * only references in surrounding elements will change.
     *
     * A LinkedList consumes more memory than an ArrayList because of every node in a LinkedList stores two references,
     * one for its previous element and one for its next element, whereas ArrayList holds only data and its index.
     */
    public static void main(String[] args)
    {
        linkedListSpecificOperations();

        linkedListInheritedOperations();
    }

    private static void linkedListSpecificOperations()
    {
        LinkedList<String> visitedCountries = new LinkedList<>();

        // Linked list specific methods for adding elements
        visitedCountries.addFirst("Spain");
        visitedCountries.push("USA"); // Add new element at the front of the list

        visitedCountries.addLast("Romania");
        visitedCountries.offer("Bulgaria"); // Add new element at end front of the list

        // Linked list specific methods for getting first element
        visitedCountries.getFirst();
        visitedCountries.peekFirst(); // just another alternative
        visitedCountries.peek(); // just another alternative

        // Linked list specific methods for getting last element
        visitedCountries.getLast(); // just another alternative
        visitedCountries.peekLast(); // just another alternative

        // Linked list specific methods for removing and getting first element
        visitedCountries.removeFirst();
        visitedCountries.pollFirst(); // just another alternative
        visitedCountries.poll(); // just another alternative
        visitedCountries.pop(); // just another alternative

        // Linked list specific methods for removing and getting last element
        visitedCountries.removeLast();
        visitedCountries.pollLast(); // just another alternative
    }

    private static void linkedListInheritedOperations()
    {
        List<String> visitedCountries = new LinkedList<>();

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
        for (String country : visitedCountries)
        {
            System.out.print(country + " ");
        }

        // For on the list
        for (int i = 0; i < visitedCountries.size(); i++)
        {
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
