/*
 * Class name :  IGeometry
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
 * This is Interface for figures that declares necessary
 * methods to be implemented in classes that will implement
 * IGeometry interface.
 *
 * @version 2.0 13 Jun 2020
 * @author Dmitriy Futsur
 */
public interface IGeometry {

    /**
     * Interface method that must be implemented
     * to calculate 3-dimensional figure volume.
     *
     * @return Must return double value which is figure volume.
     */
    double getVolume();

    /**
     * Interface method that must be implemented
     * to calculate 3-dimensional figure surface area.
     *
     * @return Must return double value which is 3-dimensional
     * figure surface area.
     */
    double getSurfaceArea();

}