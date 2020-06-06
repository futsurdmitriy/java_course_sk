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
        rectangleBox1.getPerimeter();
        rectangleBox1.getArea();

        // Output result of implemented methods of "IPackaging" interface.
        rectangleBox1.toConsole();
        rectangleBox1.toXML();
        rectangleBox1.toJSON();
        rectangleBox1.toString();
    }
}
