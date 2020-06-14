/*
 * Class name :  ContactPerson
 *
 * Version info 1.0
 *
 * 14 Jun 2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
    Develop for your class
    1. Factory.
    2. Abstract factory.
    3. Create a class Student  - 25 fields.
    4. Create a builder for the class Student

    My geometric figure is Rectangular Box.
 */

package com.company.student;

/**
 * Class that represents student contact person in emergency cases
 *
 * @author Dmitriy Futsur
 * @version 1.0 14 Jun 2020
 */
public class ContactPerson {

    /**
     * Composition for personalData of ContactPerson
     */
    private PersonalData personalData;

    /**
     * Getter for personalData field
     * @return Return object of type PersonalData
     */
    public PersonalData getPersonalData() {
        return personalData;
    }

    /**
     * Setter for personalData field
     * @param personalData PersonalData type object
     */
    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    /**
     * Constructor for ContactPErson object
     * @param personalData object of type PersonalData
     */
    public ContactPerson(PersonalData personalData) {
        this.setPersonalData(personalData);
    }

    /**
     * Overridden toString method to format object to string readable type.
     * @return Returns object string representation
     */
    @Override
    public String toString() {
        return "ContactPerson{" +
                "personalData=" + this.getPersonalData() +
                '}';
    }
}
