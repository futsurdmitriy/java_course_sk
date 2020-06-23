/*
 * Class name :  Company
 *
 * Version info 1.0
 *
 * 23 Jun 2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 */

package com.company;

public class Company {

    // parent for this company nullable, when there is no parent for this company
    private Company parent;
    private int employeesCount;
    private int id;

    public Company(Company parent, int employeesCount, int id) {
        this.parent = parent;
        this.employeesCount = employeesCount;
        this.id = id;
    }

    public Company getParent() {
        return parent;
    }

    public void setParent(Company parent) {
        this.parent = parent;
    }

    public int getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(int employeesCount) {
        this.employeesCount = employeesCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Company{" +
                "parent=" + parent +
                ", employeesCount=" + employeesCount +
                ", id=" + id +
                '}';
    }
}