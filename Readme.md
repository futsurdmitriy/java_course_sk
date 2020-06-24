# Final course task."
By Dmitriy Futsur

This is a simple description to current task via github Readme file.

Task description:

Home Task: Multi-threading.

    1. Use the file from the previous task  - logs.txt.

    2. Create a class that manages logs in this file.

    3. Create a method that finds all the ERROR logs  for a specific date and write them into a specific file (name = ERROR  + Date  + .log)

    4. In your main class develop a functionality to create  5 such a files for 5 different days. Launch them in consistent way (one after another ).

    5. Repeat the above  task in parallel way. Multi-threading.

    6. Compare the results.
    
# Result of excecuting a program."

    /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Xms512m -Xmx4096m -javaagent:/home/fuda/snap/inteli-ji/idea-IU-201.7223.91/lib/idea_rt.jar=45959:/home/fuda/snap/inteli-ji/idea-IU-201.7223.91/bin -Dfile.encoding=UTF-8 -classpath /usr/lib/jvm/java-8-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/cldrdata.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/dnsns.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/icedtea-sound.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/jaccess.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/java-atk-wrapper.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/localedata.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/nashorn.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunec.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunjce_provider.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunpkcs11.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/zipfs.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/management-agent.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/home/fuda/JavaProjects/java_course_sk/Task_1/out/production/Task_1 com.company.Main
    --------------CONSISTANT------------------
    Make log for date "2019-12-20" of type "ERROR" started at = 2020-06-24T13:41:32.653
    Make log for date "2019-12-20" of type "ERROR" finished at = 2020-06-24T13:41:32.994
    Make log for date "2019-12-28" of type "ERROR" started at = 2020-06-24T13:41:32.994
    Make log for date "2019-12-28" of type "ERROR" finished at = 2020-06-24T13:41:33.328
    Make log for date "2020-01-01" of type "ERROR" started at = 2020-06-24T13:41:33.328
    Make log for date "2020-01-01" of type "ERROR" finished at = 2020-06-24T13:41:33.601
    Make log for date "2019-12-09" of type "ERROR" started at = 2020-06-24T13:41:33.601
    Make log for date "2019-12-09" of type "ERROR" finished at = 2020-06-24T13:41:33.883
    Make log for date "2019-12-27" of type "ERROR" started at = 2020-06-24T13:41:33.883
    Make log for date "2019-12-27" of type "ERROR" finished at = 2020-06-24T13:41:34.149
    Creation of all log files in a consistant way took "1509" milliseconds
    
    -------------MULTITHREADING------------------
    Make log for date "2019-12-20" of type "ERROR" started at = 2020-06-24T13:41:34.154
    Make log for date "2019-12-28" of type "ERROR" started at = 2020-06-24T13:41:34.154
    Make log for date "2020-01-01" of type "ERROR" started at = 2020-06-24T13:41:34.154
    Make log for date "2019-12-09" of type "ERROR" started at = 2020-06-24T13:41:34.156
    Make log for date "2019-12-27" of type "ERROR" started at = 2020-06-24T13:41:34.168
    Make log for date "2019-12-09" of type "ERROR" finished at = 2020-06-24T13:41:34.586
    Make log for date "2019-12-20" of type "ERROR" finished at = 2020-06-24T13:41:34.590
    Make log for date "2020-01-01" of type "ERROR" finished at = 2020-06-24T13:41:34.640
    Make log for date "2019-12-27" of type "ERROR" finished at = 2020-06-24T13:41:34.683
    Make log for date "2019-12-28" of type "ERROR" finished at = 2020-06-24T13:41:34.716
    
    Creation of all log files in a multithreaded hard to calculate because they startin chaotic way