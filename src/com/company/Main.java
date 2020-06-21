package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {

    public static int defaultSizeOfList = 100000;
    public static int defaultSizeOfManipulatedElements = 1000;
    private static final Random random = new Random();

    public static void main(String[] args) {

        int startPosition = 0;
        int middlePosition = (defaultSizeOfList - 1) / 2;
        int endPosition = defaultSizeOfList - 1;
        List<Integer> simpleListOfNumbers = new ArrayList<Integer>();
        LinkedList<Integer> linkedListOfNumbers = new LinkedList<Integer>();

        System.out.println(
                "CREATION of simple list took \"" +
                        Main.createList(simpleListOfNumbers) +
                            "\" milliseconds.");
        System.out.println(
                "CREATION of linked list took \"" +
                        Main.createList(linkedListOfNumbers) +
                            "\" milliseconds.");

        System.out.println(
                "INSERTION to BEGIN at simple list took \"" +
                        Main.processList(simpleListOfNumbers,
                                        Action.INSERT, startPosition) +
                            "\" milliseconds.");
        System.out.println(
                "INSERTION to BEGIN at linked list took \"" +
                        Main.processList(linkedListOfNumbers,
                                        Action.INSERT, startPosition) +
                            "\" milliseconds.");

        System.out.println(
                "INSERTION to MIDDLE of simple list took \"" +
                        Main.processList(simpleListOfNumbers,
                                        Action.INSERT, middlePosition) +
                            "\" milliseconds.");
        System.out.println(
                "INSERTION to MIDDLE of linked list took \"" +
                        Main.processList(linkedListOfNumbers,
                                        Action.INSERT, middlePosition) +
                            "\" milliseconds.");

        System.out.println(
                "INSERTION to the END of simple list took \"" +
                        Main.processList(simpleListOfNumbers,
                                        Action.INSERT, endPosition) +
                            "\" milliseconds.");
        System.out.println(
                "INSERTION to the END of linked list took \"" +
                        Main.processList(linkedListOfNumbers,
                                        Action.INSERT, endPosition) +
                            "\" milliseconds.");

        System.out.println(
                "UPDATE at BEGIN of simple list took \"" +
                        Main.processList(simpleListOfNumbers,
                                        Action.UPDATE, startPosition) +
                            "\" milliseconds.");
        System.out.println(
                "UPDATE at BEGIN of linked list took \"" +
                        Main.processList(linkedListOfNumbers,
                                        Action.UPDATE, startPosition) +
                            "\" milliseconds.");

        System.out.println(
                "UPDATE at the MIDDLE of simple list took \"" +
                        Main.processList(simpleListOfNumbers,
                                        Action.UPDATE, middlePosition) +
                            "\" milliseconds.");
        System.out.println(
                "UPDATE at the MIDDLE of linked list took \"" +
                        Main.processList(linkedListOfNumbers,
                                        Action.UPDATE, middlePosition) +
                            "\" milliseconds.");

        System.out.println(
                "UPDATE at the END of simple list took \"" +
                        Main.processList(simpleListOfNumbers,
                                        Action.UPDATE, endPosition) +
                            "\" milliseconds.");
        System.out.println(
                "UPDATE at the END of linked list took \"" +
                        Main.processList(linkedListOfNumbers,
                                        Action.UPDATE, endPosition) +
                            "\" milliseconds.");

        System.out.println(
                "DELETION from the BEGIN of simple list took \"" +
                        Main.processList(simpleListOfNumbers,
                                        Action.DELETE, startPosition) +
                            "\" milliseconds.");
        System.out.println(
                "DELETION from the BEGIN of linked list took \"" +
                        Main.processList(linkedListOfNumbers,
                                        Action.DELETE, startPosition) +
                            "\" milliseconds.");

        System.out.println(
                "DELETION from the MIDDLE of simple list took \"" +
                        Main.processList(simpleListOfNumbers,
                                        Action.DELETE, middlePosition) +
                            "\" milliseconds.");
        System.out.println(
                "DELETION from the MIDDLE of linked list took \"" +
                        Main.processList(linkedListOfNumbers,
                                        Action.DELETE, middlePosition) +
                            "\" milliseconds.");

        System.out.println(
                "DELETION from the end of simple list took \"" +
                        Main.processList(simpleListOfNumbers,
                                        Action.DELETE, endPosition) +
                            "\" milliseconds.");
        System.out.println(
                "DELETION from the end of linked list took \"" +
                        Main.processList(linkedListOfNumbers,
                                        Action.DELETE, endPosition) +
                            "\" milliseconds.");

    }

    private static long createList(List list) {

        LocalDateTime listCreationStartDate =
                LocalDateTime.now();
        for (int i = 0; i < Main.defaultSizeOfList; i++) {
            list.add(Main.random.nextInt(1997));
        }
        LocalDateTime listCreationFinishDate =
                LocalDateTime.now();

        return ChronoUnit.MILLIS.between(listCreationStartDate,
                listCreationFinishDate);

    }

    private static Long processList(List list, Action action, int position) {
        if (position >= 0 && position <= list.size() - 1) {
            if (action == Action.INSERT) {
                LocalDateTime listInsertStartDate = LocalDateTime.now();
                for (int i = position; i < Main.defaultSizeOfManipulatedElements; i++) {
                    list.add(position, random.nextInt(1997));
                }
                LocalDateTime listInsertFinishDate = LocalDateTime.now();

                return ChronoUnit.MILLIS.between(listInsertStartDate,
                        listInsertFinishDate);
            }
            if (action == Action.UPDATE) {
                LocalDateTime listUpdateStartDate = LocalDateTime.now();
                for (int i = position; i < Main.defaultSizeOfManipulatedElements; i++) {
                    list.set(i, random.nextInt(1997));
                }
                LocalDateTime listUpdateFinishDate = LocalDateTime.now();

                return ChronoUnit.MILLIS.between(listUpdateStartDate,
                        listUpdateFinishDate);
            }
            if (action == Action.DELETE) {
                LocalDateTime listDeleteStartDate = LocalDateTime.now();
                for (int i = position; i < Main.defaultSizeOfManipulatedElements; i++) {
                    list.remove(i);
                }
                LocalDateTime listDeleteFinishDate = LocalDateTime.now();

                return ChronoUnit.MILLIS.between(listDeleteStartDate,
                        listDeleteFinishDate);
            }
        }

        return null;
    }

}
