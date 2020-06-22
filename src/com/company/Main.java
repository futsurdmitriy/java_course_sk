/*
 * Class name :  Main
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0 22 Jun 2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
    Home task. Files management.
    1. Parse the file logs.txt (see the attachment).
       Extract to a separate file all the logs from October 2019.
    2. Calculate the total number of logs (lines).
    3. Calculate the total  number of  ERROR logs.
       Use previous skills - String.split
    4. Calculate the total number of ERROR logs. Use Files.lines.
    5. Compare two results.

    * IMPORTANT IF YOU FACING WITH "Exception in thread
      "main" java.lang.OutOfMemoryError: Java heap space"
    * THAN WATCH THIS VIDEO https://www.youtube.com/watch?v=aZuu8kPO1KQ
    * OR CLICK ON "EDIT CONFIGURATION" NEAR BUTTON TO RUN PROGRAM
    * AND CHANGE VM OPTIONS FIELD TO = -Xms512m -Xmx4096m
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
 * This is Main class to demonstrate completed task.
 * @author Dmitriy Futsur
 * @version 1.0 22 Jun 2020
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
        for (int j = 0; j < stringLines.length; j++) {
            if (stringLines[j].contains("ERROR")) {
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
