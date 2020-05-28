package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Eight facts about me
        byte myAge = 23;
        short myCurrentSalary = 24000;
        int approximateAmountOfCells = 2147483647;
        long amountOfHairSinceBorn = 2_036_854_775_808L;
        float sugarLevel = 3.4f;
        double amountOfSulfurInBody = 0.0025d;
        boolean isSelfConfident = false;
        char favoriteLetter = 'A';

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter palindrome please: ");
        //спеллепс пилип аргенинаманитнегра
        String userString = scanner.nextLine();
        String convertedString = userString.toLowerCase().trim().replaceAll("[\\p{Zs}\\P{L}]+", "");
        if (!convertedString.equals("")) {
            int convertedStringLength = convertedString.length() - 1;
            Boolean[] comparisonResults = new Boolean[convertedString.length()];
            for (int i = 0; i <= convertedStringLength; i++) {
                char first = convertedString.charAt(i);
                char last = convertedString.charAt(convertedStringLength - i);
                comparisonResults[i] = (first == last);
                // System.out.println(
                //    "[" + first + "] = " + i +
                //    " == " +
                //    "[" + last + "] = " + (convertedStringLength - i) +
                //    " - " + (first == last)
                // );
            }
            boolean isPalindrome = !Arrays.asList(comparisonResults).contains(false);
            System.out.println("'" + convertedString + "' string " + (isPalindrome ? "is" : "isn`t") + " palindrome.");
        } else {
            System.out.println("String is empty or didn`t match the regular expression.");
        }

    }
}
