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
    Polymorphism.
    Create and implement two interfaces for your class.
 */

package com.company;

public class Main {

    /**
     * Method that is default entry point of a program.
     *
     * @param args Default argument for main method.
     */
    public static void main(String[] args) {

        // My own created class according to task is RectangularBox.
        // Let`s instantiate object of that class.
        RectangularBox rectangleBox1 = new RectangularBox();

        // Output result of implemented methods of "IGeometry" interface.
        System.out.println("rectangularBox1 surface perimeter = " +
                rectangleBox1.getPerimeter());
        System.out.println("rectangularBox1 surface area = " +
                rectangleBox1.getArea());

        // Output result of implemented methods of "IPackaging" interface.
        System.out.println("\nTo JSON\n" + rectangleBox1.toJSON());
        System.out.println("\nTo XML\n" + rectangleBox1.toXML());
        System.out.println("\nTo String\n" + rectangleBox1.toString());
        System.out.println("\nTo Console\n" + rectangleBox1.toConsole());
    }
}
