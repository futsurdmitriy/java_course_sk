/*
 * Class name :  Company
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0 23 Jun 2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 */

package com.company;

/**
 * Class that represents companies
 * @author Dmitriy Futsur
 * @version 1.0 23 Jun 2020
 */
public class Company {

    // parent for this company nullable, when there is no parent for this company
    private Company parent;

    private int employeesCount;

    private int id;

    /**
     * Constructor
     * @param parent parent company
     * @param employeesCount how many employees company has
     * @param id Id of a company
     */
    public Company(Company parent, int employeesCount, int id) {
        this.parent = parent;
        this.employeesCount = employeesCount;
        this.id = id;
    }

    /**
     * @return Returns company parent
     */
    public Company getParent() {
        return parent;
    }

    /**
     * Setter for company parent
     * @param parent parent company of current company
     */
    public void setParent(Company parent) {
        this.parent = parent;
    }

    /**
     * Getter for number of employees that company has
     * @return Returns number of employees
     */
    public int getEmployeesCount() {
        return employeesCount;
    }

    /**
     * Sets number of company employees
     * @param employeesCount number of employees to set
     */
    public void setEmployeesCount(int employeesCount) {
        this.employeesCount = employeesCount;
    }

    /**
     * Getter for id
     * @return Returns company id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for id
     * @param id Sets id for company
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * String representation of an object
     * @return Retirns company as a string
     */
    @Override
    public String toString() {
        return "Company{" +
                "parent=" + parent +
                ", employeesCount=" + employeesCount +
                ", id=" + id +
                '}';
    }
}