package com.company;

/*
 * Classname Main
 *
 * Version info 1.1
 *
 * Copyright Futsur Dmitriy
 */

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        // Initialization of variables
        String theLongestWord = "";
        int numberOfLinesInBook, numberOfLinesThatHasHarryWord = 0,
            numberOfIntersections = 0;

        // Get all lines form file
        List<String> lines = Files.readAllLines(Paths.get(System.getProperty(
                "user.dir") + "/src/_harryPotter_1.txt"),
                StandardCharsets.UTF_8);
        String content = lines.toString();

        // Get single words from lines of book
        String[] words =
                content.replaceAll("[\\P{L}]+", " ")
                        .trim().toLowerCase().split("\\s+");

        // Get number of all lines in book &&
        // get number of occurrences of word "harry" in each line
        numberOfLinesInBook = lines.size();
        for (int i = 0; i < numberOfLinesInBook; i++) {
            if (lines.get(i).toLowerCase().contains("harry")) {
                numberOfLinesThatHasHarryWord++;
            }
        }

        // Sort array of words in alphabet order ASC
        Arrays.sort(words);
        String[] unique =
                Arrays.stream(words).distinct().toArray(String[]::new);

        // Initialize array of hashes
        String[] arrayOfHashesFromBookWords = new String[unique.length];
        for (int i = 0; i < unique.length; i++) {

            // Get the longest word among all word from book
            if (theLongestWord.length() < unique[i].length()) {
                theLongestWord = unique[i];
            }

            // Fill array of hashes by hash codes of each word
            arrayOfHashesFromBookWords[i] =
                    String.valueOf(unique[i].hashCode());

            // Counting words intersections
            String wordToSearchForIntersections = unique[i];
            for (int j = 0; j < words.length; j++) {
                if (wordToSearchForIntersections.equals(words[j])) {
                    numberOfIntersections++;
                }
            }
        }

        // Output of results
        System.out.println("Number of intersections = " + numberOfIntersections);
        System.out.println("The longest word is: \"" + theLongestWord +
                "\"");
        System.out.println("Amount of lines that contains \"harry\" word is :" +
                " " + numberOfLinesThatHasHarryWord);
        System.out.println("Number of lines in book is: " + numberOfLinesInBook);

    }
}


