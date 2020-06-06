/*
 * Class name :  Pyramid
 *
 * Version info 1.0
 *
 * 06-Jun-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
    Inheritance
    1. Create a child  from the class Rectangle.
    2. Create another class as a super class for your one.
    Or create a daughterly class for your one.

    My geometric figure is Rectangular Box.
    First of all Rectangle class will be created,
    then will be created RegularQadrangularPyramid that extends Rectangle class.
    Then RectangularBox class that is my own class by task will be child class
    of Rectangle.
 */

package com.company;

// 1. Create a child  from the class Rectangle.
public class RegularQadrangularPyramid extends Rectangle {

    /**
     *  Edge of a pyramid.
     */
    private int edge;

    /**
     * Height of a pyramid.
     */
    private int height;

    /**
     * Constructor for creation pyramid object from sideA, edge and height.
     * @param pyramidBaseSideA Pyramid base rectangle side.
     * @param edge Pyramid edge.
     * @param height Pyramid height.
     */
    public RegularQadrangularPyramid(int pyramidBaseSideA, int edge,
                                     int height) {
        super(pyramidBaseSideA, pyramidBaseSideA);
        this.setEdge(edge);
        this.setHeight(height);
    }

    /**
     * Constructor for creation pyramid object from sideA and edge.
     * Height will be calculated automatically.
     * @param pyramidBaseSideA Pyramid edge.
     * @param edge Pyramid height.
     */
    public RegularQadrangularPyramid(int pyramidBaseSideA, int edge) {
        super(pyramidBaseSideA, pyramidBaseSideA);
        this.setEdge(edge);
        this.setHeight((int) this.calculateRegularQadrangularPyramidHeight());
    }

    /**
     * Getter for pyramid edge.
     * @return Returns pyramid edge.
     */
    public int getEdge() {
        return edge;
    }

    /**
     * Sets pyramid edge.
     * @param edge Pyramid edge.
     */
    public void setEdge(int edge) {
        this.edge = edge;
    }

    /**
     * Getter for pyramid height.
     * @return Returns pyramid height.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets pyramid height.
     * @param height Pyramid height.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Method to get string object representation.
     * @return Object in string format.
     */
    @Override
    public String toString() {
        return "RegularQadrangularPyramid {" +
                " baseLength= " + this.getLength() +
                ", baseWidth= " + this.getWidth() +
                ", edge= " + this.getEdge() +
                ", height= " + this.getHeight() +
                " }";
    }

    /**
     * Method to calculate pyramid height.
     * @return Returns height of a pyramid.
     */
    public double calculateRegularQadrangularPyramidHeight() {
        double pyramidBaseRectangleDiagonal =
                this.calculateDiagonalOfARectangle();

        return Math.sqrt(
                Math.pow(this.getEdge(), 2) -
                        Math.pow((pyramidBaseRectangleDiagonal / 2), 2)
        );
    }
}
