/*
 * Class name :  RectangularBoxFactory
 *
 * Version info 1.0
 *
 * 14 Jun 2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 */

package com.company.figures;

/**
 * Class that implements factory programming pattern for
 * RectangularBox class.
 *
 * @version 1.0 13 Jun 2020
 * @author Dmitriy Futsur
 */
public class RectangularBoxFactory {

    /**
     * Method that implements factory creation of RectangularBox object
     * in case every parameter of object is greater than zero.
     *
     * @param length Length that will be set to rectangularBox object
     * @param width Width that will be set to rectangularBox object
     * @param height Height that will be set to rectangularBox object
     *
     * @return Returns RectangularBox object or null in case of invalid
     * parameters.
     */
    public static RectangularBox create(int length, int width, int height)
    {
        if (length > 0 && width > 0 && height > 0) {
            return new RectangularBox(length, width, height);
        } else {
            return null;
        }
    }

}
