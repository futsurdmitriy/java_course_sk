/*
 * Class name :  Sugar
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
 * Class for Sugar representation
 * @author  Dmitriy Futsur
 * @version @version 1.0 22 Jun 2020
 */
public class Sugar implements ISugar{

    private String sugarGrade;

    private String sugarColorType;

    private String sugarMadeFrom;

    private int costPerOneKg;

    boolean isCrystallized;

    boolean isPressed;

    private int popularity;

    private double weight;

    /**
     * Constructor
     * @param sugarGrade sugar grade
     * @param sugarColorType sugar color type
     * @param sugarMadeFrom vegetable from which sugar were made
     * @param costPerOneKg cost of sugar per one kg
     * @param isCrystallized whether sugar is crystallized
     * @param isPressed whether sugar is pressed
     * @param popularity popularity of sugar among customers
     * @param weight sugar weight
     */
    public Sugar(String sugarGrade, String sugarColorType,
                 String sugarMadeFrom, int costPerOneKg,
                 boolean isCrystallized, boolean isPressed, int popularity,
                 double weight) {
        this.sugarGrade = sugarGrade;
        this.sugarColorType = sugarColorType;
        this.sugarMadeFrom = sugarMadeFrom;
        this.costPerOneKg = costPerOneKg;
        this.isCrystallized = isCrystallized;
        this.isPressed = isPressed;
        this.popularity = popularity;
        this.weight = weight;
    }

    /**
     * To string method implementation
     * @return Returns object as string
     */
    @Override
    public String toString() {
        return "Sugar{" +
                "sugarGrade='" + sugarGrade + '\'' +
                ", sugarColorType='" + sugarColorType + '\'' +
                ", sugarMadeFrom='" + sugarMadeFrom + '\'' +
                ", costPerOneKg=" + costPerOneKg +
                ", isCrystallized=" + isCrystallized +
                ", isPressed=" + isPressed +
                ", popularity=" + popularity +
                ", weight=" + weight +
                '}';
    }

    /**
     *
     * @return Return sugar popularity
     */
    public int getPopularity() {
        return popularity;
    }

    /**
     * Sets popularity
     * @param popularity Sugar popularity param
     */
    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    /**
     * Get Sugar Grade
     * @return Returns sugar grade
     */
    public String getSugarGrade() {
        return sugarGrade;
    }

    /**
     * Set sugar garde
     * @param sugarGrade SugarGrade (first, second, third)
     */
    public void setSugarGrade(String sugarGrade) {
        this.sugarGrade = sugarGrade;
    }

    /**
     *
     * @return Returns sugar color type
     */
    public String getSugarColorType() {
        return sugarColorType;
    }

    /**
     *
     * @param sugarColorType Sets sugar color type
     */
    public void setSugarColorType(String sugarColorType) {
        this.sugarColorType = sugarColorType;
    }

    /**
     * Returns from what sugar made from
     * @return Returns sugarMadeFrom
     */
    public String getSugarMadeFrom() {
        return sugarMadeFrom;
    }

    /**
     * Sets sugar made from vegetable
     * @param sugarMadeFrom From what sugarMadeFrom
     */
    public void setSugarMadeFrom(String sugarMadeFrom) {
        this.sugarMadeFrom = sugarMadeFrom;
    }

    /**
     * Returns cost of sugar per one kg
     * @return Returns cost of sugar per one kg
     */
    public int getCostPerOneKg() {
        return costPerOneKg;
    }

    /**
     * Sets costPerOneKg
     * @param costPerOneKg costPerOneKg
     */
    public void setCostPerOneKg(int costPerOneKg) {
        this.costPerOneKg = costPerOneKg;
    }

    /**
     * Returns boolean value. If sugar is crystallized or not
     * @return Returns boolean value.
     */
    public boolean isCrystallized() {
        return isCrystallized;
    }

    /**
     * Returns boolean value. If sugar is crystallized or not
     * @param crystallized Param that represets wheather sugar is crystallized
     * or not.
     */
    public void setCrystallized(boolean crystallized) {
        isCrystallized = crystallized;
    }

    /**
     * Returns boolean value if sugar is pressed or not
     * @return Returns boolean if pressed or not
     */
    public boolean isPressed() {
        return isPressed;
    }

    /**
     * Sets pressed field for sugar
     * @param pressed pressed param
     */
    public void setPressed(boolean pressed) {
        isPressed = pressed;
    }

    /**
     * Gets sugar weight
     * @return Returns sugar weight value
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets sugar weight
     * @param weight Sugar weight param
     */
    public void setWeight(double weight) {
        this.weight = weight;
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
