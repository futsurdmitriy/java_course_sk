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

import sun.util.resources.LocaleData;

/**
 * Class that represents student contact person in emergency cases
 *
 * @author Dmitriy Futsur
 * @version 1.0 14 Jun 2020
 */
public class ContactPerson {
    private PersonalData personalData;

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public ContactPerson(PersonalData personalData) {
        this.personalData = personalData;
    }

    @Override
    public String toString() {
        return "ContactPerson{" +
                "personalData=" + personalData +
                '}';
    }
}
