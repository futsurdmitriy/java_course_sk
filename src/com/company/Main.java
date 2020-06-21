/*
 * Class name :  Main
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0 21 Jun 2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
    JavaCollectionsFramework. List.

    1. Create ArrayList and LinkedList containing  100 000 Integer elements. Compare time intervals.
    2. Insert  new 1000 elements  on the  beginning, on  the middle  and on the end of ones. Compare time intervals.
    3. Update 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
    4. Delete 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
 */

package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

/**
 * This is Main class to demonstrate completed task.
 * Main idea is to play with collections. List and LinkedList
 * @author Dmitriy Futsur
 * @version 1.0 21 Jun 2020
 */
public class Main {

    /**
     *  Field for default size of a List and LinkedList
     */
    public static int defaultSizeOfList = 100000;

    /**
     *  Field for default size of elements that will be changed
     */
    public static int defaultSizeOfManipulatedElements = 1000;

    /**
     *  Composition for random class usage to generate
     *  random numbers for lists
     */
    private static final Random random = new Random();

    /**
     * Main method to execute
     * @param args Default params.
     */
    public static void main(String[] args) {

        int startPosition = 0;
        int middlePosition = (defaultSizeOfList / 2);
        int endPosition =
                (defaultSizeOfList) - Main.defaultSizeOfManipulatedElements;
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
                "============================================" +
                "============================"
        );

        System.out.println(
                "\nINSERTION to BEGIN at simple list took \"" +
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
                "============================================" +
                        "============================"
        );

        System.out.println(
                "\nUPDATE at BEGIN of simple list took \"" +
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
                "============================================" +
                        "============================"
        );

        System.out.println(
                "\nDELETION from the BEGIN of simple list took \"" +
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

    /**
     * Static method to create lists both List type and LinkedList type
     * @param list List object to fill by random values
     * @return Returns value of milliseconds that were taken to create list
     */
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

    /**
     * Static method to insert, update, delete lists elements
     * both List type and LinkedList type. It also validates position and action
     * to do. If something will be wrong it return null.
     * @param list List object
     * @param action Action to do (insert, update, delete). Enum params.
     * @param position Position from where to start change elements.
     * @return Returns integer that represents time that were taken to
     * do action in milliseconds.
     */
    private static Long processList(List list, Action action, int position) {
        if (position >= 0 && position <= list.size() - 1) {
            int startPos = position;
            int endPos = Main.defaultSizeOfManipulatedElements + position;
            if (action == Action.INSERT) {
                LocalDateTime listInsertStartDate = LocalDateTime.now();
                for (int i = startPos; i < endPos; i++) {
                    list.add(position, random.nextInt(1997));
                }
                LocalDateTime listInsertFinishDate = LocalDateTime.now();

                return ChronoUnit.MILLIS.between(listInsertStartDate,
                        listInsertFinishDate);
            }
            if (action == Action.UPDATE) {
                LocalDateTime listUpdateStartDate = LocalDateTime.now();
                for (int i = startPos; i < endPos; i++) {
                    list.set(i, 0);
                }
                LocalDateTime listUpdateFinishDate = LocalDateTime.now();

                return ChronoUnit.MILLIS.between(listUpdateStartDate,
                        listUpdateFinishDate);
            }
            if (action == Action.DELETE) {
                LocalDateTime listDeleteStartDate = LocalDateTime.now();
                for (int i = startPos; i < endPos; i++) {
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
