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
    private Continent continent;
    private String country;
    private String region;
    private String city;
    private String street;
    private String buildingNumber;
    private String apartmentsNumbers;

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getApartmentsNumbers() {
        return apartmentsNumbers;
    }

    public void setApartmentsNumbers(String apartmentsNumbers) {
        this.apartmentsNumbers = apartmentsNumbers;
    }

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
