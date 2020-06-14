/*
 * Class name :  RectangularBox
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

import java.util.Objects;

/**
 * Class that represents Rectangular Box figure.
 *
 * @version 2.0 13 Jun 2020
 * @author Dmitriy Futsur
 */
public class RectangularBox implements IGeometry {

    /**
     * Length of rectangularBox
     */
    private int length;

    /**
     * Width of rectangularBox
     */
    private int width;

    /**
     * Height of rectangularBox
     */
    private int height;

    /**
     * Class constructor without parameters
     */
    public RectangularBox() {
        this.setHeight(4);
        this.setWidth(6);
        this.setLength(5);
    }

    /**
     * Class constructor with parameters
     * @param length Length that will be set to rectangularBox object
     * @param height Height that will be set to rectangularBox object
     * @param width Width that will be set to rectangularBox object
     */
    public RectangularBox(int length, int height, int width) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    /**
     * Getter for rectangularBox length field
     * @return Returns length of rectangularBox object
     */
    public int getLength() {
        return length;
    }

    /**
     * Setter for rectangularBox length field
     * @param length Sets length of rectangularBox object
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Getter for rectangularBox width field
     * @return Returns width of rectangularBox object
     */
    public int getWidth() {
        return width;
    }

    /**
     * Setter for rectangularBox width field
     * @param width Sets width of rectangularBox object
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Getter for rectangularBox height field
     * @return Returns height of rectangularBox object
     */
    public int getHeight() {
        return height;
    }

    /**
     * Setter for rectangularBox height field
     * @param height Sets height of rectangularBox object
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Method to get formatted rectangularBox object
     * @return Returns info about rectangularBox object
     */
    @Override
    public String toString() {
        return "RectangularBox {" +
                " length=" + length +
                ", width=" + width +
                ", height=" + height +
                " }";
    }

    /**
     * Method to check whether object equals by value
     * @param o Object as parameter
     * @return Return boolean value as a result of comparison
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangularBox that = (RectangularBox) o;
        return  getLength() == that.getLength() &&
                getWidth() == that.getWidth() &&
                getHeight() == that.getHeight();
    }

    /**
     * Method to get object hash
     * @return Returns rectangularBox object hash.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth(), getHeight());
    }

    /**
     * Method that checks if rectangle has all fields set.
     * If not return false.
     * @return Returns boolean value that depends on rectangularBox fields.
     */
    private boolean rectangleExists() {
        return this.getHeight() != 0 &&
                this.getWidth() != 0 &&
                this.getLength() != 0;
    }

    /**
     * Method that calculates surface area of rectangularBox.
     * You can see formula on
     * https://ru.wikipedia.org/wiki/Прямоугольный_параллелепипед
     * @return Returns calculated surface area of rectangularBox.
     */
    public int calculateSurfaceArea() {
        if (this.rectangleExists()) {
            return 2 * (getLength() * getWidth() +
                    getWidth() * getHeight() +
                    getLength() * getHeight());
        } else {
            System.out.println("Rectangular box is empty. " +
                    "Surface area cannot be calculated.");
            return 0;
        }
    }

    /**
     * Method that calculates volume of a rectangularBox.
     * @return Returns volume of rectangularBox.
     */
    public int calculateVolumeOfRectangularBox() {
        if (this.rectangleExists()) {
            return this.getLength() * this.getHeight() * this.getWidth();
        } else {
            System.out.println("Rectangular box is empty. " +
                    "Surface area cannot be calculated.");
            return 0;
        }
    }

    /**
     * Method that has to return current 3-dimensional figure
     * volume.
     *
     * @return Returns double value of 3-dimensional figure
     * volume.
     */
    @Override
    public double getVolume() {
        return this.calculateVolumeOfRectangularBox();
    }

    /**
     * Method that has to return current 3-dimensional figure base
     * surface area.
     *
     * @return Returns double value of 3-dimensional figure
     * base surface area.
     */
    @Override
    public double getSurfaceArea() {
        return this.calculateSurfaceArea();
    }
}
