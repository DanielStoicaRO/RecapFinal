package com.sda.recapFinalExercises;

import java.util.Arrays;
import java.util.List;

public class CleanCodeDRY {

    public static void main(String[] args) {

        List<String> myStringList = Arrays.asList("string1", "string2");
        displayList(myStringList);

        List<String> myStringList2 = Arrays.asList("string1", "string2");
        displayList(myStringList2);

        List<Integer> myIntegerList3 = Arrays.asList(1,2,3);
        displayList(myIntegerList3);

    }

    public static void displayList(List<?> list) {
        for (Object s : list) {
            System.out.println(s);
        }
    }
}
