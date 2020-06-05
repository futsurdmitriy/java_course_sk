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
import java.util.Arrays;
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

        // 1. Find in the net and download a text version of a novel about Harry
        // Potter.  For instance,  "Harry Potter and the Sorcerer's
        // Stone".
        // Here we just set all the lines from file "_harryPotter_1.txt"
        // to "lines" variable.
        List<String> lines = Files.readAllLines(Paths.get(System.getProperty(
                "user.dir") + "/src/_harryPotter_1.txt"),
                StandardCharsets.UTF_8);

        // 2. Split the novel into an array of words.
        // 3. Clean the words from a punctuation signs.
        //
        // To make it work we convert all the lines into one string
        // variable "content". And then replacing replacing all
        // symbols that is not words ([\P{L}]+) by spaces. After that we split
        // content string by spaces thar we created to get array of words.
        String content = lines.toString();
        String[] words = content.replaceAll("[\\P{L}]+", " ").trim().split(
                "\\s+");

        // 5. Order the words in alphabetic order.
        Arrays.sort(words);

        // 4. Create another array containing distinct words.
        String[] unique =
                Arrays.stream(words).distinct().toArray(String[]::new);

        // Finally we output all the words after our manipulations.
        for (String s : unique) {
            System.out.println(s);
        }

    }
}


