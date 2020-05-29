package com.company;

/*
 * Classname Main
 *
 * Version info 1.4
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

        List<String> lines = Files.readAllLines(Paths.get(System.getProperty(
                "user.dir") + "/src/_harryPotter_1.txt"),
                StandardCharsets.UTF_8);
        String content = lines.toString();
        String[] words = content.replaceAll("[\\P{L}]+", " ").trim().split(
                "\\s+");
        Arrays.sort(words);
        String[] unique =
                Arrays.stream(words).distinct().toArray(String[]::new);
        for (String s : unique) {
            System.out.println(s);
        }

    }
}


