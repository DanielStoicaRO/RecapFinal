package com.sda.recapVehicle;

import java.util.Scanner;


public class Person {

    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public Person() {
        this.createPerson();
    }

    public Person(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    private void createPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Name: ");
        firstName = scanner.next();
        System.out.println("Last Name: ");
        lastName = scanner.next();
        System.out.println("Date Of Birth: ");
        dateOfBirth = scanner.next();
        System.out.println("The Person is ready to be added in list");
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Person setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }
}
