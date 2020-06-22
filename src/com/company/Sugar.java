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
     * @param sugarGrade
     * @param sugarColorType
     * @param sugarMadeFrom
     * @param costPerOneKg
     * @param isCrystallized
     * @param isPressed
     * @param popularity
     * @param weight
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
     * @param popularity
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
     * @param sugarGrade
     */
    public void setSugarGrade(String sugarGrade) {
        this.sugarGrade = sugarGrade;
    }

    /**
     *
     * @return
     */
    public String getSugarColorType() {
        return sugarColorType;
    }

    /**
     *
     * @param sugarColorType
     */
    public void setSugarColorType(String sugarColorType) {
        this.sugarColorType = sugarColorType;
    }

    /**
     *
     * @return
     */
    public String getSugarMadeFrom() {
        return sugarMadeFrom;
    }

    /**
     *
     * @param sugarMadeFrom
     */
    public void setSugarMadeFrom(String sugarMadeFrom) {
        this.sugarMadeFrom = sugarMadeFrom;
    }

    /**
     *
     * @return
     */
    public int getCostPerOneKg() {
        return costPerOneKg;
    }

    /**
     *
     * @param costPerOneKg
     */
    public void setCostPerOneKg(int costPerOneKg) {
        this.costPerOneKg = costPerOneKg;
    }

    /**
     *
     * @return
     */
    public boolean isCrystallized() {
        return isCrystallized;
    }

    /**
     *
     * @param crystallized
     */
    public void setCrystallized(boolean crystallized) {
        isCrystallized = crystallized;
    }

    /**
     *
     * @return
     */
    public boolean isPressed() {
        return isPressed;
    }

    /**
     *
     * @param pressed
     */
    public void setPressed(boolean pressed) {
        isPressed = pressed;
    }

    /**
     *
     * @return
     */
    public double getWeight() {
        return weight;
    }

    /**
     *
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     *
     * @return
     */
    @Override
    public int calculateCost() {
        return (int) (this.getCostPerOneKg() * this.getWeight());
    }

}
