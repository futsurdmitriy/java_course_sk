/*
 * Class name :  PersonalData
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

import java.time.LocalDate;

/**
 * Class that represents people personal data
 *
 * @author Dmitriy Futsur
 * @version 1.0 14 Jun 2020
 */
public class PersonalData {
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Address address;
    private String phone;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PersonalData(String firstName, String middleName, String lastName,
                        LocalDate dateOfBirth, Address address, String phone
            , String email) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "PersonalData{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
