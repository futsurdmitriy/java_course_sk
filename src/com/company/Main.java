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
 * @author Dmitriy Futsur
 * @version 1.0 13-Jun-2020
 */
public class Main {

    /**
     * Method that is default entry point of a program.
     *
     * @param args Default argument for main method.
     */
    public static void main(String[] args) {

        // Creating RectangularBox object via "create" method of
        // RectangularBoxFactory class
        RectangularBox rectangularBox1 =
                RectangularBoxFactory.create(3, 4, 5);
        System.out.println(rectangularBox1);

        // Creating objects of IGeometry type via "create" method of
        // AbstractFactory class
        IGeometry cylinder1 =
                AbstractFactory.create(3, 4, 5, Figure.CYLINDER);
        System.out.println(cylinder1);

        IGeometry rectangularBox2 =
                AbstractFactory.create(3, 4, 5, Figure.RECTANGULAR_BOX);
        System.out.println(rectangularBox2);

        IGeometry prism1 =
                AbstractFactory.create(3,4,5, Figure.REGULAR_TRIANGLE_PRISM);
        System.out.println(prism1);

        IGeometry emptyRectBox =
                AbstractFactory.create(0,0,0, Figure.RECTANGULAR_BOX);
        System.out.println(emptyRectBox);

    }
}
