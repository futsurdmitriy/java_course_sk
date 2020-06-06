/*
 * Class name :  IGeometry
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

public interface IGeometry {

    /**
     * Interface method that must be implemented
     * to calculate figure area.
     * @return Must return double value which is figure area.
     */
    double getArea();

    /**
     * Interface method that must be implemented
     * to calculate figure perimeter.
     * @return Must return double value which is figure parameter.
     */
    double getPerimeter();

}
