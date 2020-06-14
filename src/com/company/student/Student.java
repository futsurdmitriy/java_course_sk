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

import sun.util.resources.LocaleData;

import java.time.LocalDate;

/**
 * Class that represents student
 *
 * @author Dmitriy Futsur
 * @version 1.0 14 Jun 2020
 */
public class Student {
    private PersonalData personalData;
    private String wayOfPayment;
    private String creditCardNumber;
    private int moneyBalance;
    private WayOfStudy wayOfStudy;
    private LocalDate dateOfEntrance;
    private LocalDate dateOfGraduation;
    private ContactPerson contactPerson;
    private int averageMark;
    private int monthsToGraduateLeft;
    private boolean passedMilitaryCourse;
    private int groupNumber;
    private String groupName;
    private String faculty;
    private String fieldOfStudy;
    private boolean participatedInOlympiad;
    private int numberOfCampus;
    private int entranceMark;
    private boolean isMarried;
    private Gender gender;
    private boolean hasChildren;
    private Scholarship scholarshipType;
    private String foreignLanguage;
    private boolean isCaptain;

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public String getWayOfPayment() {
        return wayOfPayment;
    }

    public void setWayOfPayment(String wayOfPayment) {
        this.wayOfPayment = wayOfPayment;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getMoneyBalance() {
        return moneyBalance;
    }

    public void setMoneyBalance(int moneyBalance) {
        this.moneyBalance = moneyBalance;
    }

    public WayOfStudy getWayOfStudy() {
        return wayOfStudy;
    }

    public void setWayOfStudy(WayOfStudy wayOfStudy) {
        this.wayOfStudy = wayOfStudy;
    }

    public LocalDate getDateOfEntrance() {
        return dateOfEntrance;
    }

    public void setDateOfEntrance(LocalDate dateOfEntrance) {
        this.dateOfEntrance = dateOfEntrance;
    }

    public LocalDate getDateOfGraduation() {
        return dateOfGraduation;
    }

    public void setDateOfGraduation(LocalDate dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
    }

    public ContactPerson getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(ContactPerson contactPerson) {
        this.contactPerson = contactPerson;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    public int getMonthsToGraduateLeft() {
        return monthsToGraduateLeft;
    }

    public void setMonthsToGraduateLeft(int monthsToGraduateLeft) {
        this.monthsToGraduateLeft = monthsToGraduateLeft;
    }

    public boolean isPassedMilitaryCourse() {
        return passedMilitaryCourse;
    }

    public void setPassedMilitaryCourse(boolean passedMilitaryCourse) {
        this.passedMilitaryCourse = passedMilitaryCourse;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public boolean isParticipatedInOlympiad() {
        return participatedInOlympiad;
    }

    public void setParticipatedInOlympiad(boolean participatedInOlympiad) {
        this.participatedInOlympiad = participatedInOlympiad;
    }

    public int getNumberOfCampus() {
        return numberOfCampus;
    }

    public void setNumberOfCampus(int numberOfCampus) {
        this.numberOfCampus = numberOfCampus;
    }

    public int getEntranceMark() {
        return entranceMark;
    }

    public void setEntranceMark(int entranceMark) {
        this.entranceMark = entranceMark;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public Scholarship getScholarshipType() {
        return scholarshipType;
    }

    public void setScholarshipType(Scholarship scholarshipType) {
        this.scholarshipType = scholarshipType;
    }

    public String getForeignLanguage() {
        return foreignLanguage;
    }

    public void setForeignLanguage(String foreignLanguage) {
        this.foreignLanguage = foreignLanguage;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }

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

    public Student() {}

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

    public static class Builder {

        private Student studentToBuild;

        public Builder()
        {
            this.studentToBuild = new Student();
        }

        public Builder setSimilarTo(Student student)
        {
            this.studentToBuild.setPersonalData(student.getPersonalData());
            this.studentToBuild.setWayOfPayment(student.getWayOfPayment());
            this.studentToBuild.setCreditCardNumber(student.getCreditCardNumber());
            this.studentToBuild.setMoneyBalance(student.getMoneyBalance());
            this.studentToBuild.setWayOfStudy(student.getWayOfStudy());
            this.studentToBuild.setDateOfEntrance(student.getDateOfEntrance());
            this.studentToBuild.setDateOfGraduation(student.getDateOfGraduation());
            this.studentToBuild.setContactPerson(student.getContactPerson());
            this.studentToBuild.setAverageMark(student.getAverageMark());
            this.studentToBuild.setMonthsToGraduateLeft(student.getMonthsToGraduateLeft());
            this.studentToBuild.setPassedMilitaryCourse(student.passedMilitaryCourse);
            this.studentToBuild.setGroupNumber(student.getGroupNumber());
            this.studentToBuild.setGroupName(student.getGroupName());
            this.studentToBuild.setFaculty(student.getFaculty());
            this.studentToBuild.setFieldOfStudy(student.getFieldOfStudy());
            this.studentToBuild.setParticipatedInOlympiad(student.participatedInOlympiad);
            this.studentToBuild.setNumberOfCampus(student.getNumberOfCampus());
            this.studentToBuild.setEntranceMark(student.getEntranceMark());
            this.studentToBuild.isMarried = student.isMarried();
            this.studentToBuild.setGender(student.getGender());
            this.studentToBuild.setHasChildren(student.hasChildren);
            this.studentToBuild.setScholarshipType(student.getScholarshipType());
            this.studentToBuild.setForeignLanguage(student.getForeignLanguage());
            this.studentToBuild.isCaptain = student.isCaptain;
            return this;
        }



        public Builder setPersonalData(PersonalData personalData) {
            studentToBuild.personalData = personalData;
            return this;
        }



        public Builder setWayOfPayment(String wayOfPayment) {
            studentToBuild.wayOfPayment = wayOfPayment;
            return this;
        }



        public Builder setCreditCardNumber(String creditCardNumber) {
            studentToBuild.creditCardNumber = creditCardNumber;
            return this;
        }



        public Builder setMoneyBalance(int moneyBalance) {
            studentToBuild.moneyBalance = moneyBalance;
            return this;
        }


        public Builder setWayOfStudy(WayOfStudy wayOfStudy) {
            studentToBuild.wayOfStudy = wayOfStudy;
            return this;
        }



        public Builder setDateOfEntrance(LocalDate dateOfEntrance) {
            studentToBuild.dateOfEntrance = dateOfEntrance;
            return this;
        }



        public Builder setDateOfGraduation(LocalDate dateOfGraduation) {
            studentToBuild.dateOfGraduation = dateOfGraduation;
            return this;
        }



        public Builder setContactPerson(ContactPerson contactPerson) {
            studentToBuild.contactPerson = contactPerson;
            return this;
        }



        public Builder setAverageMark(int averageMark) {
            studentToBuild.averageMark = averageMark;
            return this;
        }



        public Builder setMonthsToGraduateLeft(int monthsToGraduateLeft) {
            studentToBuild.monthsToGraduateLeft = monthsToGraduateLeft;
            return this;
        }



        public Builder setPassedMilitaryCourse(boolean passedMilitaryCourse) {
            studentToBuild.passedMilitaryCourse = passedMilitaryCourse;
            return this;
        }



        public Builder setGroupNumber(int groupNumber) {
            studentToBuild.groupNumber = groupNumber;
            return this;
        }



        public Builder setGroupName(String groupName) {
            studentToBuild.groupName = groupName;
            return this;
        }



        public Builder setFaculty(String faculty) {
            studentToBuild.faculty = faculty;
            return this;
        }



        public Builder setFieldOfStudy(String fieldOfStudy) {
            studentToBuild.fieldOfStudy = fieldOfStudy;
            return this;
        }



        public Builder setParticipatedInOlympiad(boolean participatedInOlympiad) {
            studentToBuild.participatedInOlympiad = participatedInOlympiad;
            return this;
        }



        public Builder setNumberOfCampus(int numberOfCampus) {
            studentToBuild.numberOfCampus = numberOfCampus;
            return this;
        }



        public Builder setEntranceMark(int entranceMark) {
            studentToBuild.entranceMark = entranceMark;
            return this;
        }



        public Builder setMarried(boolean married) {
            studentToBuild.isMarried = married;
            return this;
        }



        public Builder setGender(Gender gender) {
            studentToBuild.gender = gender;
            return this;
        }



        public Builder setHasChildren(boolean hasChildren) {
            studentToBuild.hasChildren = hasChildren;
            return this;
        }



        public Builder setScholarshipType(Scholarship scholarshipType) {
            studentToBuild.scholarshipType = scholarshipType;
            return this;
        }



        public Builder setForeignLanguage(String foreignLanguage) {
            studentToBuild.foreignLanguage = foreignLanguage;
            return this;
        }



        public Builder setCaptain(boolean captain) {
            studentToBuild.isCaptain = captain;
            return this;
        }

        public Student build(){
            return studentToBuild;
        }
    }
}
