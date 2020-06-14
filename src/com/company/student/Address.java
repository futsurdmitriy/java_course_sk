/*
 * Class name :  Address
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
 * Class that represents address data
 *
 * @author Dmitriy Futsur
 * @version 1.0 14 Jun 2020
 */
public class Address {

    /**
     * Enum type address field that represents
     * continent
     */
    private Continent continent;

    /**
     * Country address field
     */
    private String country;

    /**
     * Region address field
     */
    private String region;

    /**
     * City address field
     */
    private String city;

    /**
     * Street address field
     */
    private String street;

    /**
     * Building number address field
     */
    private String buildingNumber;

    /**
     * Apartments number address field
     */
    private String apartmentsNumbers;

    /**
     * Getter for enum type continent address field
     * @return Returns continent address field that is enum type object.
     */
    public Continent getContinent() {
        return continent;
    }

    /**
     * Setter for enum type continent address field.
     * @param continent Continent address field that is "Continent" enum type
     */
    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    /**
     * Getter for country address field
     * @return Returns String country address field
     */
    public String getCountry() {
        return country;
    }

    /**
     * Setter for country address field
     * @param country String parameter that is country address field
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Getter for region address field
     * @return Returns String region address field
     */
    public String getRegion() {
        return region;
    }

    /**
     * Setter for region address field
     * @param region String parameter that is region address field
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Getter for city address field
     * @return Returns String city address field
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter for city address field
     * @param city String parameter that is city address field
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for street address field
     * @return Returns String street address field
     */
    public String getStreet() {
        return street;
    }

    /**
     * Setter for street address field
     * @param street String parameter that is street address field
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Getter for buildingNumber address field
     * @return Returns String buildingNumber address field
     */
    public String getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Setter for buildingNumber address field
     * @param buildingNumber String parameter that is buildingNumber address
     * field
     */
    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    /**
     * Getter for apartmentsNumbers address field
     * @return Returns String apartmentsNumbers address field
     */
    public String getApartmentsNumbers() {
        return apartmentsNumbers;
    }

    /**
     * Setter for apartmentsNumbers address field
     * @param apartmentsNumbers String parameter that is apartmentsNumbers
     * address field
     */
    public void setApartmentsNumbers(String apartmentsNumbers) {
        this.apartmentsNumbers = apartmentsNumbers;
    }

    /**
     * Constructor for Address object
     * @param continent Continent address field of "Continent" enum type.
     * @param country Country address field of String type.
     * @param region Region address field of String type.
     * @param city City address field of String type.
     * @param street Street address field of String type.
     * @param buildingNumber BuildingNumber address field of String type.
     * @param apartmentsNumbers apartmentsNumbers address field of String type.
     */
    public Address(Continent continent, String country, String region,
                   String city, String street, String buildingNumber,
                   String apartmentsNumbers) {
        this.continent = continent;
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.apartmentsNumbers = apartmentsNumbers;
    }

    /**
     * Overridden toString method to format object to string readable type.
     * @return Returns object string representation
     */
    @Override
    public String toString() {
        return "Address{" +
                "continent=" + continent +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", apartmentsNumbers='" + apartmentsNumbers + '\'' +
                '}';
    }
}
