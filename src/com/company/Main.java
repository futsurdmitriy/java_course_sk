/*
 * Class name :  Main
 *
 * Version info 1.0
 *
 * 13-Jun-2020
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

package com.company;

import com.company.figures.*;
import com.company.student.*;

import java.time.LocalDate;

/**
 * Main program class.
 *
 * @author Dmitriy Futsur
 * @version 1.0 13-Jun-2020
 */
public class Main {

    /**
     * Method that is default entry point of a program.
     *
     * @param args Default argument for main method.
     */
    public static void main(String[] args) {

        // Creating RectangularBox object via "create" method of
        // RectangularBoxFactory class
        RectangularBox rectangularBox1 =
                RectangularBoxFactory.create(3, 4, 5);
        System.out.println(rectangularBox1);

        // Creating objects of IGeometry type via "create" method of
        // AbstractFactory class
        IGeometry cylinder1 =
                AbstractFactory.create(3, 4, 5, Figure.CYLINDER);
        System.out.println("\n"+cylinder1);

        IGeometry rectangularBox2 =
                AbstractFactory.create(3, 4, 5, Figure.RECTANGULAR_BOX);
        System.out.println("\n"+rectangularBox2);

        IGeometry prism1 =
                AbstractFactory.create(3,4,5, Figure.REGULAR_TRIANGLE_PRISM);
        System.out.println("\n"+prism1);

        IGeometry emptyRectBox =
                AbstractFactory.create(0,0,0, Figure.RECTANGULAR_BOX);
        System.out.println("\n"+emptyRectBox);

        // Builder task
        // Create a single student via simple constructor
        Student simpleStudent = new Student(
                new PersonalData(
                        "my_first_name",
                        "my_middle_name",
                        "my_last_name",
                        LocalDate.of(1980, 1, 13),
                        new Address(
                                Continent.AFRICA,
                                "Egypt",
                                "District 1",
                                "Keir",
                                "Ramzes",
                                "8",
                                "10"
                        ),
                        "+3800000005",
                        "my.email3@email.com"
                ),
                "Cash",
                "5133 1233 1111 0000",
                20000,
                WayOfStudy.CONTRACT,
                LocalDate.of(2014, 9, 1),
                LocalDate.of(2018, 12, 31),
                new ContactPerson(new PersonalData(
                        "Anton",
                        "Andreevich",
                        "Unknown",
                        LocalDate.of(1997, 1, 13),
                        new Address(
                                Continent.EUROPE,
                                "Ukraine",
                                "Lvivska",
                                "Lviv",
                                "Kozaka",
                                "321",
                                "2"
                        ),
                        "+3800000000",
                        "my.email@email.com"
                )),
                4,
                0,
                false,
                123,
                "First Group",
                "IT Faculty",
                "Software Engineering",
                true,
                0,
                565,
                false,
                Gender.MALE,
                false,
                Scholarship.NONE,
                "English",
                false
        );
        System.out.println("\n"+simpleStudent);

        // Create a student via Builder methods
        Student dmitriyFutsur = new Student.Builder()
                .setPersonalData(new PersonalData(
                        "Dmitriy",
                        "Andreevich",
                        "Futsur",
                        LocalDate.of(1997, 1, 13),
                        new Address(
                                Continent.EUROPE,
                                "Ukraine",
                                "Lvivska",
                                "Lviv",
                                "Kozaka",
                                "123",
                                "1"
                        ),
                        "+3800000000",
                        "my.email@email.com"
                ))
                .setWayOfPayment("Cash")
                .setCreditCardNumber("5133 1233 1111 1111")
                .setMoneyBalance(0)
                .setWayOfStudy(WayOfStudy.CONTRACT)
                .setDateOfEntrance(LocalDate.of(2014, 9, 1))
                .setDateOfGraduation(LocalDate.of(2018, 12, 31))
                .setContactPerson(new ContactPerson(new PersonalData(
                        "Anton",
                        "Andreevich",
                        "Unknown",
                        LocalDate.of(1997, 1, 13),
                        new Address(
                                Continent.EUROPE,
                                "Ukraine",
                                "Lvivska",
                                "Lviv",
                                "Kozaka",
                                "321",
                                "2"
                        ),
                        "+3800000000",
                        "my.email@email.com"
                )))
                .setAverageMark(4)
                .setMonthsToGraduateLeft(0)
                .setPassedMilitaryCourse(false)
                .setGroupNumber(123)
                .setGroupName("First Group")
                .setFaculty("IT Faculty")
                .setFieldOfStudy("Software Engineering")
                .setParticipatedInOlympiad(true)
                .setNumberOfCampus(0)
                .setEntranceMark(565)
                .setMarried(false)
                .setGender(Gender.MALE)
                .setHasChildren(false)
                .setScholarshipType(Scholarship.NONE)
                .setForeignLanguage("English")
                .setCaptain(false)
                .build();
        System.out.println("\n"+dmitriyFutsur);

        // Create a student via Builder similar to method
        // from Student that is passed as a parameter to method
        Student antonStrashko =
                new Student.Builder().setSimilarTo(dmitriyFutsur)
                .setPersonalData(new PersonalData(
                        "Anton",
                        "Antonovich",
                        "Strashko",
                        LocalDate.of(1995, 10, 14),
                        new Address(
                                Continent.EUROPE,
                                "Ukraine",
                                "Lvivska",
                                "Lviv",
                                "Svobody",
                                "444",
                                "2"
                        ),
                        "+3800000001",
                        "my.email2@email.com"

                )).build();
        System.out.println("\n"+antonStrashko);

    }
}
