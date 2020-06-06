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
    Inheritance
    1. Create a child  from the class Rectangle.
    2. Create another class as a super class for your one.
    Or create a daughterly class for your one.

    My geometric figure is Rectangular Box.
    First of all Rectangle class will be created,
    then will be created RegularQadrangularPyramid that extends Rectangle class.
    Then RectangularBox class that is my own class by task will be child class
    of Rectangle.
 */

package com.company;

public class Main {

    /**
     * Method that is default entry point of a program.
     *
     * @param args Default argument for main method.
     */
    public static void main(String[] args) {

        // Instantiate object of Rectangle class
        // with default parameters
        Rectangle rectangle1 = new Rectangle();

        System.out.println("Output of rectangle 1 object: " +
                rectangle1.toString());

        // Object 1 instantiation of Pyramid class
        // that is child class from Rectangle.
        RegularQadrangularPyramid regQadPyramid1 =
                new RegularQadrangularPyramid(4, 6, 5);

        // Object 2 instantiation of Pyramid class
        // that is child class from Rectangle but without height.
        // Height will be calculated automatically.
        RegularQadrangularPyramid regQadPyramid2 =
                new RegularQadrangularPyramid(5, 7);

        // Created pyramid object 1
        System.out.println("\nPyramid object 1 = " + regQadPyramid1.toString());

        // Created pyramid object 1
        System.out.println("\nPyramid object 2 = " + regQadPyramid2.toString());

        // For Pyramid class we can call some methods of parent class Rectangle
        System.out.println("\nDiagonal of pyramid 2 base rectangle is: " +
                regQadPyramid2.calculateDiagonalOfARectangle());

        // My own created class according to task is RectangularBox.
        // So my class is a child class form Rectangle class.
        // Instantiate first RectangularBox object with constructor
        // with default params.
        RectangularBox rectangleBox1 = new RectangularBox();

        // Then call some parent methods
        System.out.println("\nDiagonal of rectangle box is:" +
                rectangleBox1.calculateDiagonalOfARectangle());
    }
}
