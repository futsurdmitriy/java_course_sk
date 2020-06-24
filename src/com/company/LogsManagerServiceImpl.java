/*
 * Class name :  LogsManagerServiceImpl
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
import java.time.LocalDateTime;
import java.util.regex.Pattern;

/**
 * Interface implementation for log management
 * @author  Dmitriy Futsur
 * @version 1.0 24 Jun 2020
 */
public class LogsManagerServiceImpl implements ILogsManagerService {

    /**
     * Method to write to a file specific log by type and date
     * @param stringTypeDate String representation of date
     * @param logType String type that is type of log (ERROR, WARNING, INFO)
     * @param logsStringLines Array of String that contains log file content
     * @throws IOException Throws exception if file is invalid
     */
    @Override
    public void writeLogsByDateAndTypeToFile(
            String stringTypeDate,
            String logType,
            String[] logsStringLines) throws IOException {

        LocalDateTime makeLogStart = LocalDateTime.now();
        System.out.println("Make log for date \"" + stringTypeDate +
                "\" of type \"" + logType + "\" " +
                "started at = " +makeLogStart);

        FileWriter fw = new FileWriter(logType +
                "_" + stringTypeDate + "_.log");

        // Get the regex to be checked
        String regex =
                "\\d{4}-[01]\\d-[0-3]\\d\\s[0-2]\\d((:[0-5]\\d)?){2}.\\d{3}";
        // Create a pattern from regex
        Pattern pattern
                = Pattern.compile(regex);

        for (int j = 0; j < logsStringLines.length - 1; j++) {
            if (logsStringLines[j].contains(stringTypeDate) &&
                logsStringLines[j].contains(logType)) {
                fw.write(logsStringLines[j] + "\n");
                int i = j + 1;
                while (!pattern.matcher(logsStringLines[i]).lookingAt()) {
                    fw.write(logsStringLines[i] + "\n");
                    i++;
                    j = i;
                }
            }
        }
        fw.close();

        LocalDateTime makeLogFinish = LocalDateTime.now();
        System.out.println("Make log for date \"" + stringTypeDate +
                "\" of type \"" + logType + "\" " +
                "finished at = " +makeLogFinish);

    }
}
