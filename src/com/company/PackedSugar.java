/*
 * Class name :  PackedSugar
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0 22 Jun 2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 *
    Laboratory work. (6 points)

    Topic: Object-oriented programming,  JavaCollectionFramework

    Choose a subject according to your number. Develop a service using all your best in OOP and Java collections.

    Six methods must be written like in the following example. A point for each one.

    Creative approaches are welcome.

    EXAMPLE

     A company contains two types of employees:  full-time and  part-time ones.
    1. Create two appropriate classes and 5 objects of each one.
    2. Calculate   the total salary of a month.
    3. Find the highest salary employee.
    4. Find he lowest salary employee
    5.  The average salary.
    6. Who get more salary, part-time or full-time employees?

    MY TASK IS 4. Sugar packed and by weight.

 */

package com.company;

/**
 * Packeged sugar class
 * @author Dmitriy Futsur
 *
 * @version 1.0 22 Jun 2020
 */
public class PackedSugar extends Sugar implements ISugar {


    private double weight;

    /**
     * Getter for weight
     * @return Returns weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets weight for sugar
     * @param weight Sugar weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Costructor
     * @param sugarGrade
     * @param sugarColorType
     * @param sugarMadeFrom
     * @param costPerOneKg
     * @param isCrystallized
     * @param isPressed
     * @param popularity
     * @param weight
     */
    public PackedSugar(String sugarGrade, String sugarColorType,
                       String sugarMadeFrom, int costPerOneKg,
                       boolean isCrystallized, boolean isPressed,
                       int popularity, double weight) {
        super(sugarGrade, sugarColorType, sugarMadeFrom, costPerOneKg,
                isCrystallized, isPressed, popularity, weight);
    }

    /**
     *  Returns sugar cost
     * @return Returns cost of sugar
     */
    @Override
    public int calculateCost() {
        return (int) (this.getCostPerOneKg() * this.getWeight());
    }
}
