/*
 * Class name :  Student
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
 * Class that represents student
 *
 * @author Dmitriy Futsur
 * @version 1.0 14 Jun 2020
 */
public class Student {

    /**
     * Student personal data that is provided by composition
     */
    private PersonalData personalData;

    /**
     * Student way of payment (cash / credit card)
     */
    private String wayOfPayment;

    /**
     *  Student credit card number
     */
    private String creditCardNumber;

    /**
     * Amount of money that student has
     */
    private int moneyBalance;

    /**
     * Enum type field that specifies student way of study
     */
    private WayOfStudy wayOfStudy;

    /**
     * Date when student entered the university
     */
    private LocalDate dateOfEntrance;

    /**
     * Date when student graduated
     */
    private LocalDate dateOfGraduation;

    /**
     * ContactPerson object type field that specifies person to
     * contact with in emergency case
     */
    private ContactPerson contactPerson;

    /**
     * Student average mark
     */
    private int averageMark;

    /**
     * Amount of months that left to graduate
     */
    private int monthsToGraduateLeft;

    /**
     * Specifies whether student passed the military course
     */
    private boolean passedMilitaryCourse;

    /**
     * Students group number
     */
    private int groupNumber;

    /**
     * Student group name
     */
    private String groupName;

    /**
     * Student faculty
     */
    private String faculty;

    /**
     * Student field of study
     */
    private String fieldOfStudy;

    /**
     * Specifies whether student participated in some
     * olympiads challenges or not
     */
    private boolean participatedInOlympiad;

    /**
     * Student number of campus where he lives
     */
    private int numberOfCampus;

    /**
     * Student mark when he passed entrance exams
     */
    private int entranceMark;

    /**
     * Specifies whether student is married or not
     */
    private boolean isMarried;

    /**
     * Student gender
     */
    private Gender gender;

    /**
     * Specifies whether student has children or not
     */
    private boolean hasChildren;

    /**
     * Enum type of scholarship
     */
    private Scholarship scholarshipType;

    /**
     * Base student foreign language
     */
    private String foreignLanguage;

    /**
     * Specifies whether student is captain or not
     */
    private boolean isCaptain;

    /**
     * Getter for personal data field
     * @return Returns PersonalData type object
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
     * Getter for wayOfPayment field
     * @return Returns String type wayOfPayment
     */
    public String getWayOfPayment() {
        return wayOfPayment;
    }

    /**
     * Setter for wayOfPayment field
     * @param wayOfPayment String type wayOfPayment
     */
    public void setWayOfPayment(String wayOfPayment) {
        this.wayOfPayment = wayOfPayment;
    }

    /**
     * Getter for creditCardNumber field
     * @return Returns String type creditCardNumber
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Setter for creditCardNumber field
     * @param creditCardNumber String type creditCardNumber
     */
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    /**
     * Getter for moneyBalance field
     * @return Returns int type moneyBalance
     */
    public int getMoneyBalance() {
        return moneyBalance;
    }

    /**
     * Setter for moneyBalance field
     * @param moneyBalance int type moneyBalance
     */
    public void setMoneyBalance(int moneyBalance) {
        this.moneyBalance = moneyBalance;
    }

    /**
     * Getter for wayOfStudy field
     * @return Returns WayOfStudy enum type wayOfStudy
     */
    public WayOfStudy getWayOfStudy() {
        return wayOfStudy;
    }

    /**
     * Setter for wayOfStudy field
     * @param wayOfStudy WayOfStudy enum type object
     */
    public void setWayOfStudy(WayOfStudy wayOfStudy) {
        this.wayOfStudy = wayOfStudy;
    }

    /**
     * Getter for dateOfEntrance field
     * @return Returns LocalDate type dateOfEntrance
     */
    public LocalDate getDateOfEntrance() {
        return dateOfEntrance;
    }

    /**
     * Setter for dateOfEntrance field
     * @param dateOfEntrance LocalDate type object
     */
    public void setDateOfEntrance(LocalDate dateOfEntrance) {
        this.dateOfEntrance = dateOfEntrance;
    }

    /**
     * Getter for dateOfGraduation field
     * @return Returns LocalDate type dateOfGraduation
     */
    public LocalDate getDateOfGraduation() {
        return dateOfGraduation;
    }

    /**
     * Setter for dateOfGraduation field
     * @param dateOfGraduation LocalDate type object
     */
    public void setDateOfGraduation(LocalDate dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
    }

    /**
     * Getter for contact person field
     * @return Returns ContactPerson type object
     */
    public ContactPerson getContactPerson() {
        return contactPerson;
    }

    /**
     * Setter for contactPerson field
     * @param contactPerson ContactPerson type object
     */
    public void setContactPerson(ContactPerson contactPerson) {
        this.contactPerson = contactPerson;
    }

    /**
     * Getter for averageMark field
     * @return Returns int type averageMark
     */
    public int getAverageMark() {
        return averageMark;
    }

    /**
     * Setter for averageMark field
     * @param averageMark int type averageMark
     */
    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    /**
     * Getter for monthsToGraduateLeft field
     * @return Returns int type monthsToGraduateLeft
     */
    public int getMonthsToGraduateLeft() {
        return monthsToGraduateLeft;
    }

    /**
     * Setter for monthsToGraduateLeft field
     * @param monthsToGraduateLeft int type monthsToGraduateLeft
     */
    public void setMonthsToGraduateLeft(int monthsToGraduateLeft) {
        this.monthsToGraduateLeft = monthsToGraduateLeft;
    }

    /**
     * Getter for passedMilitaryCourse field
     * @return Returns boolean type passedMilitaryCourse
     */
    public boolean isPassedMilitaryCourse() {
        return passedMilitaryCourse;
    }

    /**
     * Setter for passedMilitaryCourse field
     * @param passedMilitaryCourse boolean type passedMilitaryCourse
     */
    public void setPassedMilitaryCourse(boolean passedMilitaryCourse) {
        this.passedMilitaryCourse = passedMilitaryCourse;
    }

    /**
     * Getter for groupNumber field
     * @return Returns int type groupNumber
     */
    public int getGroupNumber() {
        return groupNumber;
    }

    /**
     * Setter for groupNumber field
     * @param groupNumber int type groupNumber
     */
    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    /**
     * Getter for groupName field
     * @return Returns String type groupName
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Setter for groupName field
     * @param groupName String type groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * Getter for faculty field
     * @return Returns String type faculty
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     * Setter for faculty field
     * @param faculty String type faculty
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    /**
     * Getter for fieldOfStudy field
     * @return Returns String type fieldOfStudy
     */
    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    /**
     * Setter for fieldOfStudy field
     * @param fieldOfStudy String type fieldOfStudy
     */
    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    /**
     * Getter for participatedInOlympiad field
     * @return Returns boolean type participatedInOlympiad
     */
    public boolean isParticipatedInOlympiad() {
        return participatedInOlympiad;
    }

    /**
     * Setter for participatedInOlympiad field
     * @param participatedInOlympiad boolean type participatedInOlympiad
     */
    public void setParticipatedInOlympiad(boolean participatedInOlympiad) {
        this.participatedInOlympiad = participatedInOlympiad;
    }

    /**
     * Getter for numberOfCampus field
     * @return Returns int type numberOfCampus
     */
    public int getNumberOfCampus() {
        return numberOfCampus;
    }

    /**
     * Setter for numberOfCampus field
     * @param numberOfCampus int type numberOfCampus
     */
    public void setNumberOfCampus(int numberOfCampus) {
        this.numberOfCampus = numberOfCampus;
    }

    /**
     * Getter for entranceMark field
     * @return Returns int type entranceMark
     */
    public int getEntranceMark() {
        return entranceMark;
    }

    /**
     * Setter for entranceMark field
     * @param entranceMark int type entranceMark
     */
    public void setEntranceMark(int entranceMark) {
        this.entranceMark = entranceMark;
    }

    /**
     * Getter for isMarried field
     * @return Returns boolean type isMarried
     */
    public boolean isMarried() {
        return isMarried;
    }

    /**
     * Setter for isMarried field
     * @param married boolean type isMarried
     */
    public void setMarried(boolean married) {
        isMarried = married;
    }

    /**
     * Getter for gender field
     * @return Returns Gender enum type object
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Setter for gender field
     * @param gender Gender type object
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * Getter for hasChildren field
     * @return Returns boolean type hasChildren
     */
    public boolean isHasChildren() {
        return hasChildren;
    }

    /**
     * Setter for hasChildren field
     * @param hasChildren boolean type hasChildren
     */
    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    /**
     * Getter for scholarshipType field
     * @return Returns Scholarship enum type object
     */
    public Scholarship getScholarshipType() {
        return scholarshipType;
    }

    /**
     * Setter for scholarshipType field
     * @param scholarshipType Scholarship type scholarshipType
     */
    public void setScholarshipType(Scholarship scholarshipType) {
        this.scholarshipType = scholarshipType;
    }

    /**
     * Getter for foreignLanguage field
     * @return Returns String type foreignLanguage
     */
    public String getForeignLanguage() {
        return foreignLanguage;
    }

    /**
     * Setter for foreignLanguage field
     * @param foreignLanguage String type foreignLanguage
     */
    public void setForeignLanguage(String foreignLanguage) {
        this.foreignLanguage = foreignLanguage;
    }

    /**
     * Getter for isCaptain field
     * @return Returns boolean type isCaptain
     */
    public boolean isCaptain() {
        return isCaptain;
    }

    /**
     * Setter for captain field
     * @param captain boolean type captain
     */
    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }

    /**
     * Constructor for Student object
     * @param personalData PersonalData object. Personal data (email,
     * phone ...)
     * @param wayOfPayment String type. Way of payment (credit card/cash)
     * @param creditCardNumber String type. Student credit card number
     * @param moneyBalance int type. Student money current money balance
     * @param wayOfStudy WayOfStudy enum object type. Way of study (budget,
     * contract...)
     * @param dateOfEntrance LocalDate type object. Date when student entered
     * university
     * @param dateOfGraduation LocalDate type object. Date when student
     * graduated
     * @param contactPerson ContactPerson type object. Contact person to
     * contact with in emergency
     * @param averageMark int type. Student average mark
     * @param monthsToGraduateLeft int type. Months left to graduation
     * @param passedMilitaryCourse boolean type. Student passed mil-ry course
     * @param groupNumber int type. Student group num
     * @param groupName String type. Student group name
     * @param faculty String type. Student study faculty
     * @param fieldOfStudy String type. Field of study
     * @param participatedInOlympiad boolean type. Student participated
     * in any olympiad
     * @param numberOfCampus int type. Student campus number
     * @param entranceMark int type. Student entrance mark
     * @param isMarried boolean type. Student is married
     * @param gender Gender enum type object. Student gender
     * @param hasChildren boolean type. Student has any children
     * @param scholarshipType Scholarship enum object type. Student
     * scholarship type
     * @param foreignLanguage String type. Student base foreign language
     * @param isCaptain boolean type. Student is captain
     */
    public Student(PersonalData personalData, String wayOfPayment,
                   String creditCardNumber, int moneyBalance,
                   WayOfStudy wayOfStudy, LocalDate dateOfEntrance,
                   LocalDate dateOfGraduation, ContactPerson contactPerson,
                   int averageMark, int monthsToGraduateLeft,
                   boolean passedMilitaryCourse, int groupNumber,
                   String groupName, String faculty, String fieldOfStudy,
                   boolean participatedInOlympiad, int numberOfCampus,
                   int entranceMark, boolean isMarried, Gender gender,
                   boolean hasChildren, Scholarship scholarshipType,
                   String foreignLanguage, boolean isCaptain) {
        this.personalData = personalData;
        this.wayOfPayment = wayOfPayment;
        this.creditCardNumber = creditCardNumber;
        this.moneyBalance = moneyBalance;
        this.wayOfStudy = wayOfStudy;
        this.dateOfEntrance = dateOfEntrance;
        this.dateOfGraduation = dateOfGraduation;
        this.contactPerson = contactPerson;
        this.averageMark = averageMark;
        this.monthsToGraduateLeft = monthsToGraduateLeft;
        this.passedMilitaryCourse = passedMilitaryCourse;
        this.groupNumber = groupNumber;
        this.groupName = groupName;
        this.faculty = faculty;
        this.fieldOfStudy = fieldOfStudy;
        this.participatedInOlympiad = participatedInOlympiad;
        this.numberOfCampus = numberOfCampus;
        this.entranceMark = entranceMark;
        this.isMarried = isMarried;
        this.gender = gender;
        this.hasChildren = hasChildren;
        this.scholarshipType = scholarshipType;
        this.foreignLanguage = foreignLanguage;
        this.isCaptain = isCaptain;
    }

    /**
     * Empty Student object constructor
     */
    public Student() {
    }

    /**
     * Overridden toString method to format object to string readable type.
     * @return Returns object string representation
     */
    @Override
    public String toString() {
        return "Student{" +
                "personalData=" + personalData +
                ", wayOfPayment='" + wayOfPayment + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", moneyBalance=" + moneyBalance +
                ", wayOfStudy=" + wayOfStudy +
                ", dateOfEntrance=" + dateOfEntrance +
                ", dateOfGraduation=" + dateOfGraduation +
                ", contactPerson=" + contactPerson +
                ", averageMark=" + averageMark +
                ", monthsToGraduateLeft=" + monthsToGraduateLeft +
                ", passedMilitaryCourse=" + passedMilitaryCourse +
                ", groupNumber=" + groupNumber +
                ", groupName='" + groupName + '\'' +
                ", faculty='" + faculty + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", participatedInOlympiad=" + participatedInOlympiad +
                ", numberOfCampus='" + numberOfCampus + '\'' +
                ", entranceMark=" + entranceMark +
                ", isMarried=" + isMarried +
                ", gender=" + gender +
                ", hasChildren=" + hasChildren +
                ", scholarshipType=" + scholarshipType +
                ", foreignLanguage='" + foreignLanguage + '\'' +
                ", isCaptain=" + isCaptain +
                '}';
    }

    /**
     * Class that implements students builder
     *
     * @author Dmitriy Futsur
     * @version 1.0 14 Jun 2020
     */
    public static class Builder {

        /**
         * Composition Student type object studentToBuild
         */
        private final Student studentToBuild;

        /**
         * Builder constructor to create Student type object
         * and assign it to studentToBuild field
         */
        public Builder() {
            this.studentToBuild = new Student();
        }

        /**
         * Method that returns an object of type Student
         * that has completely same field values
         *
         * @param student Student type object to build from
         * @return Returns new Student object with same fields as a
         * parameter object has
         */
        public Builder setSimilarTo(Student student) {
            this.studentToBuild
                    .setPersonalData(student.getPersonalData());
            this.studentToBuild
                    .setWayOfPayment(student.getWayOfPayment());
            this.studentToBuild
                    .setCreditCardNumber(student.getCreditCardNumber());
            this.studentToBuild
                    .setMoneyBalance(student.getMoneyBalance());
            this.studentToBuild
                    .setWayOfStudy(student.getWayOfStudy());
            this.studentToBuild
                    .setDateOfEntrance(student.getDateOfEntrance());
            this.studentToBuild
                    .setDateOfGraduation(student.getDateOfGraduation());
            this.studentToBuild
                    .setContactPerson(student.getContactPerson());
            this.studentToBuild
                    .setAverageMark(student.getAverageMark());
            this.studentToBuild
                    .setMonthsToGraduateLeft(student.getMonthsToGraduateLeft());
            this.studentToBuild
                    .setPassedMilitaryCourse(student.isPassedMilitaryCourse());
            this.studentToBuild
                    .setGroupNumber(student.getGroupNumber());
            this.studentToBuild
                    .setGroupName(student.getGroupName());
            this.studentToBuild
                    .setFaculty(student.getFaculty());
            this.studentToBuild
                    .setFieldOfStudy(student.getFieldOfStudy());
            this.studentToBuild
                    .setParticipatedInOlympiad(student.isParticipatedInOlympiad());
            this.studentToBuild
                    .setNumberOfCampus(student.getNumberOfCampus());
            this.studentToBuild
                    .setEntranceMark(student.getEntranceMark());
            this.studentToBuild
                    .setMarried(student.isMarried());
            this.studentToBuild
                    .setGender(student.getGender());
            this.studentToBuild
                    .setHasChildren(student.isHasChildren());
            this.studentToBuild
                    .setScholarshipType(student.getScholarshipType());
            this.studentToBuild
                    .setForeignLanguage(student.getForeignLanguage());
            this.studentToBuild
                    .setCaptain(student.isCaptain());
            return this;
        }

        /**
         * Method that assigns to studentToBuild personalData of a student
         * to build from
         * @param personalData PersonalData type object
         * @return Returns current object of Builder class
         */
        public Builder setPersonalData(PersonalData personalData) {
            studentToBuild.personalData = personalData;
            return this;
        }

        /**
         * Method that assigns to studentToBuild wayOfPayment of a student
         * to build from
         * @param wayOfPayment Student wayOfPayment
         * @return Returns current object of Builder class
         */
        public Builder setWayOfPayment(String wayOfPayment) {
            studentToBuild.wayOfPayment = wayOfPayment;
            return this;
        }

        /**
         * Method that assigns to studentToBuild creditCardNumber of a student
         * to build from
         * @param creditCardNumber Student creditCardNumber
         * @return Returns current object of Builder class
         */
        public Builder setCreditCardNumber(String creditCardNumber) {
            studentToBuild.creditCardNumber = creditCardNumber;
            return this;
        }

        /**
         * Method that assigns to studentToBuild moneyBalance of a student
         * to build from
         * @param moneyBalance Student moneyBalance
         * @return Returns current object of Builder class
         */
        public Builder setMoneyBalance(int moneyBalance) {
            studentToBuild.moneyBalance = moneyBalance;
            return this;
        }

        /**
         * Method that assigns to studentToBuild wayOfStudy of a student
         * to build from
         * @param wayOfStudy Student wayOfStudy
         * @return Returns current object of Builder class
         */
        public Builder setWayOfStudy(WayOfStudy wayOfStudy) {
            studentToBuild.wayOfStudy = wayOfStudy;
            return this;
        }

        /**
         * Method that assigns to studentToBuild dateOfEntrance of a student
         * to build from
         * @param dateOfEntrance Student dateOfEntrance
         * @return Returns current object of Builder class
         */
        public Builder setDateOfEntrance(LocalDate dateOfEntrance) {
            studentToBuild.dateOfEntrance = dateOfEntrance;
            return this;
        }

        /**
         * Method that assigns to studentToBuild dateOfGraduation of a student
         * to build from
         * @param dateOfGraduation Student dateOfGraduation
         * @return Returns current object of Builder class
         */
        public Builder setDateOfGraduation(LocalDate dateOfGraduation) {
            studentToBuild.dateOfGraduation = dateOfGraduation;
            return this;
        }

        /**
         * Method that assigns to studentToBuild contactPerson of a student
         * to build from
         * @param contactPerson Student contactPerson
         * @return Returns current object of Builder class
         */
        public Builder setContactPerson(ContactPerson contactPerson) {
            studentToBuild.contactPerson = contactPerson;
            return this;
        }

        /**
         * Method that assigns to studentToBuild averageMark of a student
         * to build from
         * @param averageMark Student averageMark
         * @return Returns current object of Builder class
         */
        public Builder setAverageMark(int averageMark) {
            studentToBuild.averageMark = averageMark;
            return this;
        }

        /**
         * Method that assigns to studentToBuild monthsToGraduateLeft of a student
         * to build from
         * @param monthsToGraduateLeft Student monthsToGraduateLeft
         * @return Returns current object of Builder class
         */
        public Builder setMonthsToGraduateLeft(int monthsToGraduateLeft) {
            studentToBuild.monthsToGraduateLeft = monthsToGraduateLeft;
            return this;
        }

        /**
         * Method that assigns to studentToBuild passedMilitaryCourse of a student
         * to build from
         * @param passedMilitaryCourse Student passedMilitaryCourse
         * @return Returns current object of Builder class
         */
        public Builder setPassedMilitaryCourse(boolean passedMilitaryCourse) {
            studentToBuild.passedMilitaryCourse = passedMilitaryCourse;
            return this;
        }

        /**
         * Method that assigns to studentToBuild groupNumber of a student
         * to build from
         * @param groupNumber Student groupNumber
         * @return Returns current object of Builder class
         */
        public Builder setGroupNumber(int groupNumber) {
            studentToBuild.groupNumber = groupNumber;
            return this;
        }

        /**
         * Method that assigns to studentToBuild groupName of a student
         * to build from
         * @param groupName Student groupName
         * @return Returns current object of Builder class
         */
        public Builder setGroupName(String groupName) {
            studentToBuild.groupName = groupName;
            return this;
        }

        /**
         * Method that assigns to studentToBuild faculty of a student
         * to build from
         * @param faculty Student faculty
         * @return Returns current object of Builder class
         */
        public Builder setFaculty(String faculty) {
            studentToBuild.faculty = faculty;
            return this;
        }

        /**
         * Method that assigns to studentToBuild fieldOfStudy of a student
         * to build from
         * @param fieldOfStudy Student fieldOfStudy
         * @return Returns current object of Builder class
         */
        public Builder setFieldOfStudy(String fieldOfStudy) {
            studentToBuild.fieldOfStudy = fieldOfStudy;
            return this;
        }

        /**
         * Method that assigns to studentToBuild participatedInOlympiad of a student
         * to build from
         * @param participatedInOlympiad Student participatedInOlympiad
         * @return Returns current object of Builder class
         */
        public Builder setParticipatedInOlympiad(boolean participatedInOlympiad)
        {
            studentToBuild.participatedInOlympiad = participatedInOlympiad;
            return this;
        }

        /**
         * Method that assigns to studentToBuild numberOfCampus of a student
         * to build from
         * @param numberOfCampus Student numberOfCampus
         * @return Returns current object of Builder class
         */
        public Builder setNumberOfCampus(int numberOfCampus) {
            studentToBuild.numberOfCampus = numberOfCampus;
            return this;
        }

        /**
         * Method that assigns to studentToBuild entranceMark of a student
         * to build from
         * @param entranceMark Student entranceMark
         * @return Returns current object of Builder class
         */
        public Builder setEntranceMark(int entranceMark) {
            studentToBuild.entranceMark = entranceMark;
            return this;
        }

        /**
         * Method that assigns to studentToBuild married of a student
         * to build from
         * @param married Student married
         * @return Returns current object of Builder class
         */
        public Builder setMarried(boolean married) {
            studentToBuild.isMarried = married;
            return this;
        }

        /**
         * Method that assigns to studentToBuild gender of a student
         * to build from
         * @param gender Student gender
         * @return Returns current object of Builder class
         */
        public Builder setGender(Gender gender) {
            studentToBuild.gender = gender;
            return this;
        }

        /**
         * Method that assigns to studentToBuild hasChildren of a student
         * to build from
         * @param hasChildren Student hasChildren
         * @return Returns current object of Builder class
         */
        public Builder setHasChildren(boolean hasChildren) {
            studentToBuild.hasChildren = hasChildren;
            return this;
        }

        /**
         * Method that assigns to studentToBuild scholarshipType of a student
         * to build from
         * @param scholarshipType Student scholarshipType
         * @return Returns current object of Builder class
         */
        public Builder setScholarshipType(Scholarship scholarshipType) {
            studentToBuild.scholarshipType = scholarshipType;
            return this;
        }

        /**
         * Method that assigns to studentToBuild foreignLanguage of a student
         * to build from
         * @param foreignLanguage Student foreignLanguage
         * @return Returns current object of Builder class
         */
        public Builder setForeignLanguage(String foreignLanguage) {
            studentToBuild.foreignLanguage = foreignLanguage;
            return this;
        }

        /**
         * Method that assigns to studentToBuild captain of a student
         * to build from
         * @param captain Student captain
         * @return Returns current object of Builder class
         */
        public Builder setCaptain(boolean captain) {
            studentToBuild.isCaptain = captain;
            return this;
        }

        /**
         * Method to return built student
         * @return Returns studentToBuild that is Student object
         */
        public Student build() {
            return studentToBuild;
        }
    }
}
