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
 *
 * Home Task: Multi-threading.

    1. Use the file from the previous task  - logs.txt.

    2. Create a class that manages logs in this file.

    3. Create a method that finds all the ERROR logs  for a specific
       date and write them into a specific file (name = ERROR  + Date  + .log)

    4. In your main class develop a functionality to create  5 such a files
       for 5 different days. Launch them in consistent way (one after another ).

    5. Repeat the above  task in parallel way. Multi-threading.

    6. Compare the results.

 */

package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * Main class
 * @author Dmitriy Futsur
 * @version 1.0 24 Jun 2020
 */
public class Main {

    /**
     * Thread class to implement multithreading log search
     * @author Dmitriy Futsur
     * @version 1.0 24 Jun 2020
     */
    static class MyThread extends Thread {

        /**
         * Date to search for
         */
        private final String date;

        /**
         * Content of log file as a String to search in
         */
        private final String[] logsContent;

        /**
         * Constructor of thread object
         * @param date Date to search for
         * @param logsContent Content of log file as a String to search in
         */
        MyThread(String date, String[] logsContent) {
            this.date = date;
            this.logsContent = logsContent;
        }

        /**
         *  Method to run thread with specific logic
         *  to search for logs
         */
        @Override
        public void run() {
            LogsManagerServiceImpl logsManager = new LogsManagerServiceImpl();
            try {
                logsManager.writeLogsByDateAndTypeToFile(this.date,
                        "ERROR", this.logsContent);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Main method to execute
     * @param args Default params.
     * @throws IOException Throws error if there is no file exists.
     * @throws InterruptedException Throws exception
     */
    public static void main(String[] args) throws IOException,
            InterruptedException {

        LogsManagerServiceImpl logsManager = new LogsManagerServiceImpl();
        String logsContent =
                new String (Files.readAllBytes(Paths.get(System.getProperty(
                        "user.dir") + "/src/logs.txt")));
        String[] stringLines = logsContent.split("\n");
        List<String> listOfDates = new ArrayList<>(Arrays.asList(
                "2019-12-20", "2019-12-28", "2020-01-01",
                "2019-12-09", "2019-12-27"
        ));

        System.out.println("--------------CONSISTANT------------------");
        LocalDateTime consistentMakeLogsStart = LocalDateTime.now();
        for(String date : listOfDates) {
            logsManager.writeLogsByDateAndTypeToFile(date,
                    "ERROR", stringLines);
        }
        LocalDateTime consistentMakeLogsFinish = LocalDateTime.now();

        System.out.println("Creation of all log files " +
                "in a consistant way took \"" +
                ChronoUnit.MILLIS.between(consistentMakeLogsStart
                , consistentMakeLogsFinish) + "\" milliseconds\n");

        System.out.println("-------------MULTITHREADING------------------");
        LocalDateTime multiThreadMakeLogsStart = LocalDateTime.now();
        for(String date : listOfDates) {
            new MyThread(date, stringLines).start();
        }
        LocalDateTime multiThreadMakeLogsFinish = LocalDateTime.now();

        // Make delay to output final message
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println("\nCreation of all log files " +
                "in a multithreaded hard to calculate because they start" +
                "in chaotic way");

    }

}
