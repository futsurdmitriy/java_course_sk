/*
 * Class name :  ILogsManagerService
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

import java.io.IOException;

/**
 * Interface that needs to be implemented for log management
 * @author  Dmitriy Futsur
 * @version 1.0 24 Jun 2020
 */
public interface ILogsManagerService {

    /**
     * Method to write to a file specific log by type and date
     * @param stringTypeDate String representation of date
     * @param logType String type that is type of log (ERROR, WARNING, INFO)
     * @param logsStringLines Array of String that contains log file content
     * @throws IOException Throws exception if file is invalid
     */
    void writeLogsByDateAndTypeToFile(
            String stringTypeDate,
            String logType,
            String[] logsStringLines) throws IOException;

}
