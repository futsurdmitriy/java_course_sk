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
 *
    Laboratory work. (6 points)

    Topic: Object-oriented programming,  JavaCollectionFramework

    Choose a subject according to your number. Develop a service using all your best in OOP and Java collections.

    Six methods must be written like in the following example. A point for each one.

    Creative approaches are welcome.

    EXAMPLE

     A company contains two types of employees:  full-time and  part-time ones.
    1. Create two appropriate classes and 5 objects of each one.
    2. Calculate   the total salary of a month.
    3. Find the highest salary employee.
    4. Find he lowest salary employee
    5.  The average salary.
    6. Who get more salary, part-time or full-time employees?

    MY TASK IS 4. Sugar packed and by weight.

 */

package com.company;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Main class to show working program
 * @author Dmitriy Futsur
 * @version 1.0 22 Jun 2020
 */
public class Main {
    /**
     * Default main method
     * @param args Default arguments
     */
    public static void main(String[] args) {


        // 1. Create 5 objects of each sugar type

        ///////////////////////WEIGHTED///////////////////////////

        Sugar weightedSugar1 = SugarAbstractFactory.create(
                "second", "white",
                "beetroot",5,
                true,true,
                70, 0.5d,
                ESugar.WEIGHT
                );
        Sugar weightedSugar2 = SugarAbstractFactory.create(
                "third", "white",
                "cane",3,
                false,false,
                20, 1.0d,
                ESugar.WEIGHT
        );
        Sugar weightedSugar3 = SugarAbstractFactory.create(
                "first", "brown",
                "beetroot",15,
                true,true,
                40, 2.0d,
                ESugar.WEIGHT
        );
        Sugar weightedSugar4 = SugarAbstractFactory.create(
                "first", "white",
                "cane",10,
                false,false,
                70, 0.5d,
                ESugar.WEIGHT
        );
        Sugar weightedSugar5 = SugarAbstractFactory.create(
                "third", "brown",
                "cane",10,
                true,false,
                50, 1.5d,
                ESugar.WEIGHT
        );

        //////////////////////PACKED/////////////////////////////////

        Sugar packedSugar1 = SugarAbstractFactory.create(
                "third", "white",
                "beetroot",5,
                true,true,
                70, 0.5d,
                ESugar.PACKED
        );
        Sugar packedSugar2 = SugarAbstractFactory.create(
                "second", "white",
                "cane",10,
                false,false,
                50, 1.0d,
                ESugar.PACKED
        );
        Sugar packedSugar3 = SugarAbstractFactory.create(
                "second", "brown",
                "beetroot",15,
                true,true,
                30, 2.0d,
                ESugar.PACKED
        );
        Sugar packedSugar4 = SugarAbstractFactory.create(
                "first", "brown",
                "cane",20,
                false,false,
                40, 0.5d,
                ESugar.PACKED
        );
        Sugar packedSugar5 = SugarAbstractFactory.create(
                "first", "white",
                "cane",10,
                true,false,
                70, 1.5d,
                ESugar.PACKED
        );

        // Created list of sugars of different types
        List<Sugar> listOfSugars = new ArrayList<Sugar>();
        listOfSugars.add(weightedSugar1);
        listOfSugars.add(packedSugar1);
        listOfSugars.add(packedSugar5);
        listOfSugars.add(weightedSugar5);
        listOfSugars.add(packedSugar3);
        listOfSugars.add(weightedSugar3);
        listOfSugars.add(packedSugar2);
        listOfSugars.add(weightedSugar2);
        listOfSugars.add(packedSugar4);
        listOfSugars.add(weightedSugar4);

        // 2. calculate total weight for all sugars
        int totalSugarsWeight = 0;
        for (int i = 0; i < listOfSugars.size(); i++) {
            totalSugarsWeight += listOfSugars.get(i).getWeight();
        }

        // 3. find the most expensive sugar object
        Sugar theMostExpensiveSugar =
                Collections.max(listOfSugars,
                        Comparator.comparing(s -> s.calculateCost()));
        System.out.println("\nThe most expensive sugar is = " +
                theMostExpensiveSugar);

        // 4. find the cheapest sugar object
        Sugar theCheapestSugar =
                Collections.min(listOfSugars,
                        Comparator.comparing(s -> s.calculateCost()));
        System.out.println("\nThe cheapest sugar is = " +
                theCheapestSugar);

        // 5. find the most heavy sugar object
        Sugar theHeaviestSugar =
                Collections.max(listOfSugars,
                        Comparator.comparing(s -> s.getWeight()));
        System.out.println("\nThe heaviest sugar is = " +
                theHeaviestSugar);

        // 6. find the average cost among all sugars
        int totalSugarsCost = 0;
        for (int i = 0; i < listOfSugars.size(); i++) {
            totalSugarsCost += listOfSugars.get(i).calculateCost();
        }
        System.out.println("Total suggar cost = " + totalSugarsCost);
        int averageCostOfSugar = totalSugarsCost / listOfSugars.size();
        System.out.println("Average cost of sugar = " + averageCostOfSugar);

        // 7. Sort sugar objects by popularity from lowest
        List<Sugar> sortedSugarsByPopularity = listOfSugars.stream()
                .sorted(Comparator.comparing(s -> s.getPopularity()))
                .collect(Collectors.toList());
        System.out.println("\nSorted sugar list by popularity\n" +
                sortedSugarsByPopularity);

    }
}
