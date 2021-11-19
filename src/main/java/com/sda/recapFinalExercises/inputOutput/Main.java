package com.sda.recapFinalExercises.inputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


//        D:\Repository\RecapFinal\src\main\java\com\sda\recapFinalExercises\inputOutput

        File file = new File("D:\\Repository\\RecapFinal\\src\\recapFinalExercises\\inputOutput\\test");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String fileLine;
            int i = 0;
            int wordCount = 0;
            while ((fileLine = bufferedReader.readLine()) != null) {
                i++;
                wordCount += fileLine.split(" ").length;
            }
            System.out.println("word count: "+ wordCount + " lines: " + i);
        }

    }
}
