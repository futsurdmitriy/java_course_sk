/*
 * Class name :  RectangularBox
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

import java.util.Objects;

// 2. Create another class as a super class for your one.
// Or create a daughterly class for your one.
public class RectangularBox extends Rectangle {

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

    // 1. Constructor.

    // default constructor.
    // It will be created by JAVA
    // if you doesn`t create it by
    // yourself

    // public RectangularBox () {
    //
    // }

    /**
     * Class constructor without parameters
     */
    public RectangularBox() {
        super();
        this.setHeight(4);
        this.setWidth(6);
        this.setLength(5);
    }

    /**
     * Class constructor with parameters
     * @param length Length that will be set to rectangularBox object
     * @param width Width that will be set to rectangularBox object
     * @param height Height that will be set to rectangularBox object
     */
    public RectangularBox(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // 2. Getters/Setters.

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

    // 4. Override toString() method

    /**
     * Method to get formatted rectangularBox object
     * @return Returns info about rectangularBox object
     */
    @Override
    public String toString() {
        return "RectangularBox{ " +
                " length= " + length +
                ", width= " + width +
                ", height= " + height +
                " }";
    }

    // 5. Override hash() and equals() methods.

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

    // 3. 5 methods.

    /**
     * Method that checks if rectangle has all fields set.
     * If not return false.
     * @return Returns boolean value that depends on rectangularBox fields.
     */
    private boolean rectangleExists() {
        if (this.getHeight() == 0 ||
                this.getWidth() == 0 ||
                this.getLength() == 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Method that calculates squared diagonal length of rectangularBox.
     * You can see formula on
     * https://ru.wikipedia.org/wiki/Прямоугольный_параллелепипед
     * @return Returns calculated squared diagonal length of rectangularBox.
     */
    public double calculateSquaredDiagonalLengthOfRectangularBox() {
        if (this.rectangleExists()) {
            return  (Math.pow(getLength(), 2) +
                    Math.pow(getHeight(), 2) +
                    Math.pow(getWidth(), 2));
        } else {
            System.out.println("Rectangular box is empty. " +
                    "Squared diagonal length cannot be calculated.");
            return 0;
        }
    }

    /**
     * Method that calculates diagonal length of rectangularBox.
     * You can see formula on
     * https://ru.wikipedia.org/wiki/Прямоугольный_параллелепипед
     * @return Returns calculated diagonal length of rectangularBox.
     */
    public double calculateDiagonalLengthOfRectangularBox() {
        return Math.sqrt(this.calculateSquaredDiagonalLengthOfRectangularBox());
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
     * Calculates the diagonal of surface of rectangularBox by Pythagorean
     * theorem. If the lengths of both a and b are known,
     * then c can be calculated as c = √( a*a + b*b ), where a = height and
     * b = length.
     * URL https://en.wikipedia.org/wiki/Pythagorean_theorem
     * @return Returns calculated diagonal length of a rectangularBox surface.
     */
    public double calculateDiagonalOfARectangleBoxSurface() {
        if (this.getHeight() != 0 && this.getLength() != 0) {
            return Math.sqrt(this.getHeight() * this.getLength());
        } else {
            System.out.println("Height and length of rectangle box is empty. " +
                    "Diagonal of surface cannot be calculated.");
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

}
