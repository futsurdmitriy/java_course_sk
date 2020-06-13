/*
 * Class name :  Main
 *
 * Version info 1.0
 *
 * 13-Jun-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
    Develop for your class
    1. Factory.
    2. Abstract factory.
    3. Create a class Student  - 25 fields.
    4. Create a builder for the class Student

    My geometric figure is Rectangular Box.
 */

package com.company;

/**
 * Main program class.
 *
 * @version 1.0 13-Jun-2020
 * @author Dmitriy Futsur
 */
public class Main {

    /**
     * Method that is default entry point of a program.
     * @param args Default argument for main method.
     */
    public static void main(String[] args) {

        // Creating RectangularBox object via "create" method of
        // RectangularBoxFactory class
        RectangularBox rectBox1 =
                RectangularBoxFactory.create(3, 4, 5);
        System.out.println(rectBox1);

    }
}
