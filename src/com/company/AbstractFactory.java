/*
 * Class name :  AbstractFactory
 *
 * Version info 1.0
 *
 * 13 Jun 2020
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
 * Class that implements Abstract Factory programming pattern
 * for 3-dimensional geometric figures such as triangular prism,
 * rectangular box and cylinder.
 *
 * @author Dmitriy Futsur
 * @version 1.0 13 Jun 2020
 */
public class AbstractFactory {

    /**
     * Method that implements abstract factory create method.
     *
     * @param length Length of a 3-dimensional figure
     * @param height Height of a 3-dimensional figure
     * @param width Width of a 3-dimensional figure
     * @param type Type of a 3-dimensional figure
     *
     * @return Returns object of requested type of a 3-dimensional figure if
     * parameters is valid and type exists otherwise returns null.
     */
    public static IGeometry create(int length, int height, int width,
                                   Figure type) {
        if (length > 0 && height > 0 && width > 0) {
            if (type.equals(Figure.CYLINDER))
                return new Cylinder(length, height, width);
            if (type.equals(Figure.REGULAR_TRIANGLE_PRISM))
                return new RegularTriangularPrism(length, height, width);
            if (type.equals(Figure.RECTANGULAR_BOX))
                return new RectangularBox(length, height, width);
            return null;
        }

        return null;
    }

}
