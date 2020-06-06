/*
 * Class name :  Rectangle
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

public class Rectangle {

    /**
     * Length of rectangle.
     */
    private int length;

    /**
     * Width of rectangle.
     */
    private int width;

    /**
     * Getter for rectangle length.
     * @return Returns rectangle length.
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets rectangle length.
     * @param length Rectangle length.
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Getter for rectangle width.
     * @return Returns rectangle width.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets rectangle width.
     * @param width Rectangle width.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Constructor for rectangle object with parameters.
     * @param length Rectangle length.
     * @param width Rectangle width.
     */
    public Rectangle(int length, int width) {
        this.setLength(length);
        this.setWidth(width);
    }

    /**
     * Constructor for rectangle object without params.
     */
    public Rectangle() {
        this.setWidth(4);
        this.setLength(5);
    }

    /**
     * Method to get string object representation.
     * @return Object in string format.
     */
    @Override
    public String toString() {
        return "Rectangle{ " +
                "length= " + this.getLength() +
                ", width= " + this.getWidth() +
                " }";
    }

    /**
     * Calculates the diagonal of rectangle by Pythagorean
     * theorem. If the lengths of both a and b are known,
     * then c can be calculated as c = √( a*a + b*b ), where a = width and
     * b = length.
     * URL https://en.wikipedia.org/wiki/Pythagorean_theorem
     * @return Returns calculated diagonal length of a rectangle.
     */
    public double calculateDiagonalOfARectangle() {
        if (this.getWidth() != 0 && this.getLength() != 0) {
            return Math.sqrt(this.getWidth() * this.getLength());
        } else {
            System.out.println("Width and length of rectangle is empty. " +
                    "Diagonal cannot be calculated.");
            return 0;
        }
    }
}
