package com.company;

/*
 * Classname Main
 *
 * Version info 2.1
 *
 * Copyright Futsur Dmitriy
 */

public class Main {

    public static void main(String[] args) {

        RectangularBox rectangleBox1 = new RectangularBox();
        RectangularBox.outputResult("The surface area of rectangle box 1 " +
                "equals: ", rectangleBox1.calculateSurfaceArea());
        RectangularBox.outputResult("The diagonal length of rectangle box 1 " +
                "equals: ",
                rectangleBox1.calculateDiagonalLengthOfRectangularBox());
        RectangularBox.outputResult("The squared diagonal length of rectangle" +
                " box 1 equals: ",
                rectangleBox1.calculateSquaredDiagonalLengthOfRectangularBox());
        RectangularBox.outputResult("The diagonal of rectangle box surface 1 " +
                "equals: ",
                rectangleBox1.calculateDiagonalOfARectangleBoxSurface());

        RectangularBox rectangleBox2 = new RectangularBox(3, 4, 6);
        RectangularBox.outputResult("The surface area of rectangle box 2 " +
                "equals: ", rectangleBox2.calculateSurfaceArea());
        RectangularBox.outputResult("The diagonal length of rectangle box 2 " +
                        "equals: ",
                rectangleBox2.calculateDiagonalLengthOfRectangularBox());
        RectangularBox.outputResult("The squared diagonal length of rectangle" +
                        " box 2 equals: ",
                rectangleBox2.calculateSquaredDiagonalLengthOfRectangularBox());
        RectangularBox.outputResult("The diagonal of rectangle box 2 surface " +
                        "equals: ",
                rectangleBox2.calculateDiagonalOfARectangleBoxSurface());
    }
}
