/*
 * Class name :  RegularTriangularPrism
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
 * Class that represents 3-dimensional triangular prism.
 *
 * @author Dmitriy Futsur
 * @version 1.0 13 Jun 2020
 */
public class RegularTriangularPrism implements IGeometry {

    /**
     * Simple side of regular triangle that is
     * a base of regular triangular prism.
     */
    private int basePrismSideA;

    /**
     *  Height of a regular triangle prism that is
     *  a distance between two bases triangles. One triangle
     *  is at bottom, other above.
     */
    private int height;

    /**
     * Width of regular triangle prism.
     * It equals to basePrismSideA.
     */
    private int width;

    /**
     * Getter for regularTrianglePrism basePrismSideA field
     *
     * @return Returns basePrismSideA of regularTrianglePrism object
     */
    public int getBasePrismSideA() {
        return basePrismSideA;
    }

    /**
     * Setter for regularTrianglePrism basePrismSideA field
     *
     * @param basePrismSideA Sets basePrismSideA of regularTrianglePrism object
     */
    public void setBasePrismSideA(int basePrismSideA) {
        this.basePrismSideA = basePrismSideA;
    }

    /**
     * Getter for regularTrianglePrism height field
     *
     * @return Returns height of regularTrianglePrism object
     */
    public int getHeight() {
        return height;
    }

    /**
     * Setter for regularTrianglePrism height field
     *
     * @param height Sets height of regularTrianglePrism object
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Getter for regularTrianglePrism width field
     *
     * @return Returns width of regularTrianglePrism object
     */
    public int getWidth() {
        return width;
    }

    /**
     * Setter for regularTrianglePrism width field
     *
     * @param width Sets width of regularTrianglePrism object
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Constructor for regularTrianglePrism object
     *
     * @param basePrismSideA BasePrismSideA that will be set to
     * regularTrianglePrism object
     * @param height Height that will be set to regularTrianglePrism object
     * @param width Width that will be set to regularTrianglePrism object
     */
    public RegularTriangularPrism(int basePrismSideA, int height, int width) {
        this.setBasePrismSideA(basePrismSideA);
        this.setHeight(height);
        this.setWidth(width);
    }

    /**
     * Method to get formatted regularTrianglePrism object
     * @return Returns info about regularTrianglePrism object
     */
    @Override
    public String toString() {
        return "RegularTriangularPrism {" +
                " basePrismSideA=" + this.getBasePrismSideA() +
                ", height=" + this.getHeight() +
                ", width=" + this.getWidth() +
                " }";
    }

    /**
     * Method that has to return current 3-dimensional figure
     * volume.
     * Formula URL = https://uk.wikipedia.org/wiki/Трикутна_призма
     *
     * @return Returns double value of 3-dimensional figure
     * volume.
     */
    @Override
    public double getVolume() {
        return 0.5 *
                getBasePrismSideA() *
                calculateBaseTriangleHeight() *
                getHeight();
    }

    /**
     * Method that has to return current 3-dimensional figure base
     * surface area.
     * Formula url =
     * http://reshalkin.in.ua/26-ploschad-ravnostoronnego-treugolnika.html
     *
     * @return Returns double value of 3-dimensional figure base
     * surface area.
     */
    @Override
    public double getSurfaceArea() {
        return (Math.sqrt(3) / 4) * Math.pow(getBasePrismSideA(), 2) ;
    }

    /**
     * Method to calculate height of a regular triangle that
     * is a base of prism.
     * Formula url =
     * http://reshalkin.in.ua/26-ploschad-ravnostoronnego-treugolnika.html
     *
     * @return Returns double value of a base regular triangle height
     */
    public double calculateBaseTriangleHeight()
    {
        return ((getSurfaceArea() * getBasePrismSideA()) / 2);
    }

}
