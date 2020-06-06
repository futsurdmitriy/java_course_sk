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
    Polymorphism.
    Create and implement two interfaces for your class.
 */

package com.company;

import java.util.Objects;

public class RectangularBox implements IGeometry, IPackaging {

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
        return "RectangularBox{ " +
                " length= " + this.getLength() +
                ", width= " + this.getWidth() +
                ", height= " + this.getHeight() +
                " }";
    }

    /**
     * Method that outputs object in string JSON format.
     * @return Returns string JSON object representation.
     */
    @Override
    public String toJSON() {
        return "{\"" +
                    "rectangularBox\": {\n" +
                        "    \"length\": " + this.getLength() + ",\n" +
                        "    \"width\": " + this.getWidth() + ",\n" +
                        "    \"height\": " + this.getHeight() + "\n" +
                    "}" +
               "}";
    }

    /**
     * Method that outputs object in string XML format.
     * @return Returns string XML object representation.
     */
    @Override
    public String toXML() {
        return "<RectangularBox>\n" +
                    "   <length>" + this.getLength() + "</length>\n" +
                    "   <width>" + this.getWidth() + "</width>\n" +
                    "   <height>" + this.getHeight() + "</height>\n" +
               "</RectangularBox>";
    }

    /**
     * Method that outputs object in console in handsome way.
     * @return Returns string object representation.
     */
    @Override
    public String toConsole() {
        return "RectangularBox = {\n" +
                    "   length = " +
                        this.getLength() +
                    "\n" +
                    "   width = " +
                        this.getWidth() +
                    "\n" +
                    "   height = "
                        + this.getHeight() +
                    "\n" +
                    "   rectangleExists = " +
                        this.rectangleExists() +
                    "\n" +
                    "   calculateSquaredDiagonalLengthOfRectangularBox = " +
                        this.calculateSquaredDiagonalLengthOfRectangularBox() +
                    "\n" +
                    "   calculateDiagonalLengthOfRectangularBox = " +
                        this.calculateDiagonalLengthOfRectangularBox() +
                    "\n" +
                    "   calculateDiagonalOfARectangleBoxSurface = " +
                        this.calculateDiagonalOfARectangleBoxSurface() +
                    "\n" +
                    "   calculateVolumeOfRectangularBox = " +
                        this.calculateVolumeOfRectangularBox() +
                    "\n" +
                "}";
    }

    /**
     * Method to calculate rectangularBox surface area.
     * @return Returns rectangularBox surface area.
     */
    @Override
    public double getArea() {
        return this.calculateSurfaceArea();
    }

    /**
     * Method to calculate perimeter of rectangularBox surface.
     * @return Returns perimeter of rectangularBox surface.
     */
    @Override
    public double getPerimeter() {
        if (this.rectangleExists()) {
            return 2 * (this.getLength() * this.getWidth());
        } else {
            System.out.println("Rectangular box is empty. " +
                    "Surface area cannot be calculated.");
            return 0;
        }
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
    public double calculateSurfaceArea() {
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
