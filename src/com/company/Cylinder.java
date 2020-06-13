/*
 * Class name :  Cylinder
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

import jdk.nashorn.internal.ir.annotations.Ignore;

/**
 * Class that represents 3-dimensional cylinder.
 *
 * @author Dmitriy Futsur
 * @version 1.0 13 Jun 2020
 */
public class Cylinder implements IGeometry {

    /**
     * Diameter of a circle that is a base of Cylinder.
     */
    private int baseCircleDiameter;

    /**
     *  Height of a cylinder that is
     *  a distance between two bases circles. One circle
     *  is at bottom, other above.
     */
    private int height;

    /**
     * Width of a cylinder that is base circle diameter.
     */
    private int width;

    /**
     * Getter for cylinder baseCircleDiameter field
     *
     * @return Returns baseCircleDiameter of cylinder object
     */
    public int getBaseCircleDiameter() {
        return baseCircleDiameter;
    }

    /**
     * Setter for cylinder baseCircleDiameter field
     *
     * @param baseCircleDiameter Sets baseCircleDiameter of cylinder object
     */
    public void setBaseCircleDiameter(int baseCircleDiameter) {
        this.baseCircleDiameter = baseCircleDiameter;
    }

    /**
     * Getter for cylinder height field
     *
     * @return Returns height of cylinder object
     */
    public int getHeight() {
        return height;
    }

    /**
     * Setter for cylinder height field
     *
     * @param height Sets height of cylinder object
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Getter for cylinder width field
     *
     * @return Returns width of cylinder object
     */
    public int getWidth() {
        return width;
    }

    /**
     * Setter for cylinder width field
     *
     * @param width Sets width of cylinder object
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Constructor for cylinder object
     *
     * @param baseCircleDiameter BasePrismSideA that will be set to
     * cylinder object
     * @param height Height that will be set to cylinder object
     * @param width Width that will be set to cylinder object
     */
    public Cylinder (int baseCircleDiameter, int height, int width) {
        this.setBaseCircleDiameter(baseCircleDiameter);
        this.setHeight(height);
        this.setWidth(width);
    }

    /**
     * Method to get formatted cylinder object
     * @return Returns info about cylinder object
     */
    @Override
    public String toString() {
        return "Cylinder {" +
                " baseCircleDiameter=" + this.getWidth() +
                ", height=" + this.getHeight() +
                ", width=" + this.getWidth() +
                " }";
    }

    /**
     * Method that has to return current 3-dimensional figure
     * volume.
     * Formula URL = http://ua.onlinemschool.com/math/formula/volume/#h6
     *
     * @return Returns double value of 3-dimensional figure
     * volume.
     */
    @Override
    public double getVolume() {
        return getSurfaceArea() * getHeight();
    }

    /**
     * Method that has to return current 3-dimensional figure base
     * surface area.
     * Formula S = Pi * r^2
     *
     * @return Returns double value of 3-dimensional figure
     * surface area.
     */
    @Override
    public double getSurfaceArea() {
        return Math.PI * Math.pow((getBaseCircleDiameter() / 2.0 ), 2) ;
    }

}
