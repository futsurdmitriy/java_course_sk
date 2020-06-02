package com.company;

/*
 * Classname RectangularBox
 *
 * Version info 2.1
 *
 * Copyright Futsur Dmitriy
 */

public class RectangularBox {

    private int length;
    private int width;
    private int height;

    // default constructor.
    // It will be created by JAVA
    // if you doesn`t create it by
    // yourself

    // public RectangularBox () {
    //
    // }

    public RectangularBox() {
        this.setHeight(4);
        this.setWidth(6);
        this.setLength(5);
    }

    public RectangularBox(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private boolean rectangleExists() {
        if (this.getHeight() == 0 ||
                this.getWidth() == 0 ||
                this.getLength() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public int calculateSquaredDiagonalLengthOfRectangularBox() {
        if (this.rectangleExists()) {
            return (int) (Math.pow(getLength(), 2) *
                    Math.pow(getHeight(), 2) *
                    Math.pow(getWidth(), 2));
        } else {
            System.out.println("Rectangular box is empty. " +
                    "Squared diagonal length cannot be calculated.");
            return 0;
        }
    }

    public int calculateDiagonalLengthOfRectangularBox() {
        return (int)
                Math.sqrt(this.calculateSquaredDiagonalLengthOfRectangularBox());
    }

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

    public int calculateDiagonalOfARectangleBoxSurface() {
        if (this.getHeight() != 0 && this.getLength() != 0) {
            return (int) Math.sqrt(this.getHeight() * this.getLength());
        } else {
            System.out.println("Height and length of rectangle box is empty. " +
                    "Diagonal of surface cannot be calculated.");
            return 0;
        }
    }

    public static void outputResult(String message, int variable) {
        System.out.println(message + variable);
    }
}
