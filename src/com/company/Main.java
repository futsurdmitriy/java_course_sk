/*
 * Class name :  Main
 *
 * 05-Jun-2020
 *
 * Copyright (c)  Futsur Dmitriy UzhNU
 *
 * Description:
 *  Module_1 Task_4
 *  Arrays. Practice.
    1. Find in the net and download a text version of a novel about Harry
       Potter.  For instance,  "Harry Potter and the Sorcerer's Stone".
    2. Split the novel into an array of words.
    3. Clean the words from a punctuation signs.
    4. Create another array containing distinct words.
    5. Order the words in alphabetic order.
 */

package com.company;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Class Main
 * This is a main class that is entry point of program.
 */
public class Main {

    /**
     * @author Dmitriy Futsur
     * @version 1.0
     * @param args Default parameter for main method.
     * @throws IOException In case file doesn`t exist exception will be thrown.
     */
    public static void main(String[] args) throws IOException {

        // 1.1 Parse the file harry.txt (see the attachment).
        // Extract to a separate file all the logs from October 2019.


        // 1.2. For each distinct word in the text calculate the number
        // of occurrence.
        HashMap<String, Integer> glossary = new HashMap<>();

        // 1.3. Use RegEx.

        // 1.4. Sort in the DESC mode by the number of occurrence.

        // 1.5. Find  the first 20 pairs.

        // 1.6  Find all the proper names

        // 1.7.  Count them and arrange in alphabetic order.

        // 1.8.   First 20 pairs and names write into to a file test.txt

        // 1.9.  Create a fine header for the file

        // 1.10  Use Java  Collections to demonstrate your experience (Map, List )
        List<String> lines = Files.readAllLines(Paths.get(System.getProperty(
                "user.dir") + "/src/_harryPotter_1.txt"),
                StandardCharsets.UTF_8);

        List<String> words = new ArrayList<>(Arrays.asList(
                lines.toString()
                    .replaceAll("[\\P{L}]+", " ")
                    .trim()
                    .split("\\s+")
        ));

        System.out.println(words);

    }
}


