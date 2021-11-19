package com.sda.recapFinalExercises.Collection.map;

import java.util.HashMap;
import java.util.Map;


public class Main
{
    /**
     * Let's first look at what it means that HashMap is a map.
     * A map is a key-value mapping, which means that every key is mapped to exactly one value and that we can use the key
     * to retrieve the corresponding value from a map.
     *
     * One might ask why not simply add the value to a list.
     * Why do we need a HashMap? The simple reason is performance.
     * If we want to find a specific element in a list, the time complexity is O(n) and if the list is sorted,
     * it will be O(log n) using, for example, a binary search.
     *
     * The advantage of a HashMap is that the time complexity to insert and retrieve a value is O(1) on average.
     */
    public static void main(String[] args)
    {
        mapsExample();

        mapsFullExample();
    }

    private static void mapsExample()
    {
        Map<String, String> countries = new HashMap<>();
        countries.put("Poland", "Warsaw");
        countries.put("Germany", "Berlin");

        for (Map.Entry<String, String> dictionary : countries.entrySet())
        {
            String country = dictionary.getKey();
            String capital = dictionary.getValue();
            System.out.printf("%s : %s\n", country, capital);
        }
    }

    private static void mapsFullExample()
    {
        // We can create a HashMap with the key of type String and elements of type Product:
        Map<String, Product> productsByName = new HashMap<>();

        // And add products to our HashMap:
        Product eBike = new Product("E-Bike", "A bike with a battery");
        Product roadBike = new Product("Road bike", "A bike for competition");

        productsByName.put(eBike.getName(), eBike);
        productsByName.put(roadBike.getName(), roadBike);

        // We can retrieve a value from the map by its key:
        Product nextPurchase = productsByName.get("E-Bike");
        System.out.println(nextPurchase);

        // If we try to find a value for a key that doesn't exist in the map, we'll get a null value:
        nextPurchase = productsByName.get("Car");
        System.out.println(nextPurchase);

        // And if we insert a second value with the same key, we'll only get the last inserted value for that key:
        Product newEBike = new Product("E-Bike", "A bike with a better battery");
        productsByName.put(newEBike.getName(), newEBike);
        nextPurchase = productsByName.get("E-Bike");
        System.out.println(nextPurchase);

        // HashMap also allows us to have null as a key:
        Product defaultProduct = new Product("Chocolate", "At least buy chocolate");
        productsByName.put(null, defaultProduct);

        nextPurchase = productsByName.get(null);
        System.out.println(nextPurchase);

        // Furthermore, we can insert the same object twice with a different key:
        productsByName.put(defaultProduct.getName(), defaultProduct);

        nextPurchase = productsByName.get(defaultProduct.getName());
        System.out.println(nextPurchase);

        // We can remove a key-value mapping from the HashMap:
        productsByName.remove("E-Bike");
        nextPurchase = productsByName.get("E-Bike");
        System.out.println(nextPurchase);

        // To check if a key is present in the map, we can use the containsKey() method:
        boolean containsEBike = productsByName.containsKey("E-Bike");
        System.out.println("Map contains E-Bike ? " + containsEBike);

        // Or, to check if a value is present in the map, we can use the containsValue() method:
        boolean containsValue = productsByName.containsValue(eBike);
        System.out.println("Map contains E-Bike value ? " + containsValue);

        // Iterating Over a HashMap:

        // We can iterate over the set of all keys:
        for (String key : productsByName.keySet())
        {
            Product product = productsByName.get(key);
        }

        // Or we can iterate over the set of all entries:
        for (Map.Entry<String, Product> entry : productsByName.entrySet())
        {
            Product product = entry.getValue();
            String key = entry.getKey();
            //do something with the key and value
        }

        // Finally, we can iterate over all values:
        for(Product product : productsByName.values())
        {
            // do something with the value
        }

    }
}
