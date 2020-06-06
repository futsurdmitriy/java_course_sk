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
 * Java class creation
    Create a class from the attached document according to the order in your group .  The class must contain
    1. Constructor.
    2. Getters/Setters.
    3. 5 methods.
    4. Override toString() method
    5. Override hash() and equals() methods.

    My geometric figure is Rectangular Box.
 */

package com.company;

public class Main {

    /**
     * Method that is default entry point of a program.
     * @param args Default argument for main method.
     */
    public static void main(String[] args) {

        // Instantiate first RectangularBox object with constructor
        // with default params.
        RectangularBox rectangleBox1 = new RectangularBox();

        System.out.println("Result of \"toString\" overridden method " +
                "for rectangle box 1 for equals: " +
                rectangleBox1.toString());
        System.out.println("Result of \"hash\" overridden method " +
                "for rectangle box 1 equals: " +
                rectangleBox1.hashCode());

        // Output methods results for first object
        System.out.println("The surface area of rectangle box 1 " +
                "equals: " + rectangleBox1.calculateSurfaceArea());
        System.out.println("The diagonal length of rectangle box 1 " +
                "equals: " +
                rectangleBox1.calculateDiagonalLengthOfRectangularBox());
        System.out.println("The squared diagonal length of rectangle" +
                " box 1 equals: " +
                rectangleBox1.calculateSquaredDiagonalLengthOfRectangularBox());
        System.out.println("The diagonal of rectangle box 1 surface  " +
                "equals: " +
                rectangleBox1.calculateDiagonalOfARectangleBoxSurface());
        System.out.println("The volume of rectangle box 1 " +
                "equals: " +
                rectangleBox1.calculateVolumeOfRectangularBox());

        // Instantiate second RectangularBox object with constructor
        // with default params.
        RectangularBox rectangleBox2 =
                new RectangularBox(3, 4, 6);

        System.out.println("Result of \"toString\" overridden method " +
                "for rectangle box 2 equals: " +
                rectangleBox2.toString());
        System.out.println("Result of \"hash\" overridden method " +
                "for rectangle box 2 equals: " +
                rectangleBox2.hashCode());

        // Output methods results for first object
        System.out.println("\nThe surface area of rectangle box 2 " +
                "equals: " + rectangleBox2.calculateSurfaceArea());
        System.out.println("The diagonal length of rectangle box 2 " +
                        "equals: " +
                rectangleBox2.calculateDiagonalLengthOfRectangularBox());
        System.out.println("The squared diagonal length of rectangle" +
                        " box 2 equals: " +
                rectangleBox2.calculateSquaredDiagonalLengthOfRectangularBox());
        System.out.println("The diagonal of rectangle box 2 surface " +
                        "equals: " +
                rectangleBox2.calculateDiagonalOfARectangleBoxSurface());
        System.out.println("The volume of rectangle box 2 " +
                "equals: " +
                rectangleBox2.calculateVolumeOfRectangularBox());

        // Result of equals method
        System.out.println("\nIs rectangular box 1 object equals" +
                "rectangle box 2 : " +rectangleBox1.equals(rectangleBox2));

    }
}
