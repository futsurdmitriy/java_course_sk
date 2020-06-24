/*
 * Class name :  Main
 *
 * @author  Dmitriy Futsur
 *
 * @version 1.0 24 Jun 2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 */

package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

/**
 * Main class
 * @author Dmitriy Futsur
 * @version 1.0 24 Jun 2020
 */
public class Main {

    /**
     * Main method to execute
     * @param args Default params.
     * @throws IOException Throws error if there is no file exists.
     */
    public static void main(String[] args) throws IOException {

        // 1. Parse the file logs.txt (see the attachment).
        // Extract to a separate file all the logs from October 2019.
        String logsContent =
                new String (Files.readAllBytes(Paths.get(System.getProperty(
                        "user.dir") + "/src/logs.txt")));
        String[] stringLines = logsContent.split("\n");
        FileWriter fw = new FileWriter("OctoberLogs.txt");

        // We will write to our OctoberLogs.txt file
        // every line from string until we met 2019-11 date
        int i = 0;
        while (!(stringLines[i].contains("2019-11"))) {
            fw.write(stringLines[i] + "\n");
            i++;
        }
        fw.close();

        // 2. Calculate the total number of logs (lines).
        Stream<String> lines1 = Files.lines(Paths.get(System.getProperty(
                "user.dir") + "/src/logs.txt"),
                StandardCharsets.UTF_8);
        long numberOfLinesFromLinesMethod = lines1.count();
        System.out.println(
                "Total number of log`s lines by Files.lines method = \"" +
                        numberOfLinesFromLinesMethod +
                        "\"");

        long numberOfLinesFromStringMethod = stringLines.length;
        System.out.println(
                "Total number of log`s lines by String.split method = \"" +
                        numberOfLinesFromStringMethod +
                        "\"");

        // 3. Calculate the total  number of  ERROR logs.
        // Use previous skills - String.split
        long numberOfErrorsByStringMethod = 0;

        LocalDateTime searchErrorWithStringStart = LocalDateTime.now();
        for (String stringLine : stringLines) {
            if (stringLine.contains("ERROR")) {
                numberOfErrorsByStringMethod++;
            }
        }
        LocalDateTime searchErrorWithStringEnd = LocalDateTime.now();

        long milisecondsForStringMethod =
                ChronoUnit.MILLIS.between(searchErrorWithStringStart,
                        searchErrorWithStringEnd);
        System.out.println(
                "Total number of ERRORS by string method = \"" +
                        numberOfErrorsByStringMethod +
                        "\"");
        System.out.println("Time results = " + milisecondsForStringMethod);

        // 4.  Calculate the total number of ERROR logs. Use Files.lines.
        Stream<String> lines2 = Files.lines(Paths.get(System.getProperty(
                "user.dir") + "/src/logs.txt"),
                StandardCharsets.UTF_8);

        LocalDateTime searchErrorWithFilesStart = LocalDateTime.now();
        long numberOfErrorsByFilesMethod =
                lines2.filter(l->l.contains("ERROR")).count();
        LocalDateTime searchErrorWithFilesEnd = LocalDateTime.now();

        long milisecondsForFilesMethod =
                ChronoUnit.MILLIS.between(searchErrorWithFilesStart,
                        searchErrorWithFilesEnd);
        System.out.println(
                "Total number of ERRORS by files method = \"" +
                        numberOfErrorsByFilesMethod +
                        "\"");
        System.out.println("Time results = " + milisecondsForFilesMethod);

    }

}
