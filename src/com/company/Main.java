/*
 * Class name :  Main
 *
 * Version info 1.0
 *
 * 06-Jun-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 *
    Cycles. Practice.
    1. Write to console 8 facts about yourself using primitive types.
    2. Check a string as a palindrome.
    3. Get the area limited by the following functions
       x = 0 .. 3.14;  y = sin(x);   y = 0.1 * k,
       where k is the last cipher in your student card;
 */

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * Method that calculates integral of provided function.
     * @param x x function parameter.
     * @param y y function parameter.
     * @return Returns double result of integration.
     */
    static double calculateIntegral(double x, double y) {
        return (y - Math.sin(x));
    }

    /**
     * Main class method
     * @param args default arguments for "main" method
     */
    public static void main(String[] args) {

        System.out.println("\n Task 1 \n");
        // 1. Write to console 8 facts about yourself using primitive types.
        // Eight facts about me
        byte myAge = 23;
        short myCurrentSalary = 24000;
        int approximateAmountOfCells = 2147483647;
        long amountOfHairSinceBorn = 2_036_854_775_808L;
        float sugarLevel = 3.4f;
        double amountOfSulfurInBody = 0.0025d;
        boolean isSelfConfident = false;
        char favoriteLetter = 'A';

        // set to string formatted information about me
        String informationAboutMyself =
                "My age is: " + myAge + "\n" +
                "My current salary is approximate: " + myCurrentSalary + "\n" +
                "Approximate amount of cells in my body is: " +
                        approximateAmountOfCells + "\n" +
                "Approximate amount of my hair during life is: " +
                        amountOfHairSinceBorn + "\n" +
                "Now my sugar level is at: " + sugarLevel + "\n" +
                "Amount of sulfur in my body is: " +
                        amountOfSulfurInBody + "\n" +
                "Am I self confident person ? " + isSelfConfident + "\n" +
                "My favorite letter is: " + favoriteLetter;

        // output string value and string length
        System.out.println(informationAboutMyself);
        System.out.println("Length of a \"informationAboutMyself\" is: " +
            informationAboutMyself.length()
        );


        System.out.println("\n Task 2 \n");
        // 2. Check a string as a palindrome.

        // Use of scanner to ask user to enter palindrome string
        // Some examples : "спеллепс пилип аргенинаманитнегра"
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter palindrome please: ");

        // scan inputted text
        String userString = scanner.nextLine();

        // remove all the unnecessary symbols and spaces
        String convertedString = userString.toLowerCase().trim().replaceAll("[\\p{Zs}\\P{L}]+", "");

        // check whether string is empty or not
        // and if not empty then iterate through each character
        // and compare them
        if (!convertedString.equals("")) {
            int convertedStringLength = convertedString.length() - 1;

            // array which will contain comparison of each character results
            Boolean[] comparisonResults = new Boolean[convertedString.length()];
            for (int i = 0; i <= convertedStringLength; i++) {
                char first = convertedString.charAt(i);
                char last = convertedString.charAt(convertedStringLength - i);
                comparisonResults[i] = (first == last);
            }

            // check if array of results has at least one false result
            boolean isPalindrome = !Arrays.asList(comparisonResults).contains(false);
            System.out.println("'" + convertedString + "' string " + (isPalindrome ? "is" : "isn`t") + " palindrome.");
        } else {
            System.out.println("String is empty or didn`t match the regular expression.");
        }

        System.out.println("\n Task 3 \n");
        // 3. Get the area limited by the following functions
        // x = 0 .. 3.14;  y = sin(x);   y = 0.1 * k,
        // where k is the last cipher in your student card;

        // initialize all the necessary variables
        double a = 0, n = 30, x, result = 0, k = 97;
        double b = Math.PI;
        double y = 0.1 * k;
        double h = (b - a) / n;

        // implementing integral rectangles calculation method
        for (int i = 1; i <= n; i++) {
            x = a + (i - 1) * h;
            result += calculateIntegral((x + h / 2), y);
        }

        // outputting results
        result *= h;
        System.out.println(result);

    }
}
