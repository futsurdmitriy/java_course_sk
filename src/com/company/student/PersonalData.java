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

import java.time.LocalDate;

/**
 * Class that represents people personal data
 *
 * @author Dmitriy Futsur
 * @version 1.0 14 Jun 2020
 */
public class PersonalData {

    /**
     * Person first name
     */
    private String firstName;

    /**
     * Person middle name
     */
    private String middleName;

    /**
     * Person last name
     */
    private String lastName;

    /**
     * Person date of birth
     */
    private LocalDate dateOfBirth;

    /**
     * Person address
     * that is of Address type
     */
    private Address address;

    /**
     * Person phone number
     */
    private String phone;

    /**
     * Person email
     */
    private String email;

    /**
     * Getter for firstName field
     * @return Returns String firstName field
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for firstName field
     * @param firstName String parameter that is firstName field
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for middleName field
     * @return Returns String middleName field
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Setter for middleName field
     * @param middleName String parameter that is middleName field
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Getter for lastName field
     * @return Returns String lastName field
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for lastName field
     * @param lastName String parameter that is lastName field
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for dateOfBirth field
     * @return Returns LocalDate dateOfBirth field
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Setter for dateOfBirth field
     * @param dateOfBirth LocalDate parameter that is dateOfBirth field
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Getter for address field
     * @return Returns Address type address field
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Setter for address field
     * @param address Address type parameter that is address field
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Getter for phone field
     * @return Returns String type phone field
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Setter for phone field
     * @param phone String type parameter that is phone field
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter for email field
     * @return Returns String type email field
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter for email field
     * @param email String type parameter that is email field
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Constructor for PersonalData object
     * @param firstName String type person first name
     * @param middleName String type person middle name
     * @param lastName String type person last name
     * @param dateOfBirth LocalDate type person date of birth
     * @param address Address type person address data
     * @param phone String type person phone number
     * @param email String type person email
     */
    public PersonalData(String firstName, String middleName, String lastName,
                        LocalDate dateOfBirth, Address address, String phone
            , String email) {
        this.setFirstName(firstName);
        this.setMiddleName(middleName);
        this.setLastName(lastName);
        this.setDateOfBirth(dateOfBirth);
        this.setAddress(address);
        this.setPhone(phone);
        this.setEmail(email);
    }

    /**
     * Overridden toString method to format object to string readable type.
     * @return Returns object string representation
     */
    @Override
    public String toString() {
        return "PersonalData{" +
                "firstName='" + this.getFirstName() + '\'' +
                ", middleName='" + this.getMiddleName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", dateOfBirth=" + this.getDateOfBirth() +
                ", address=" + this.getAddress() +
                ", phone='" + this.getPhone() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                '}';
    }
}
