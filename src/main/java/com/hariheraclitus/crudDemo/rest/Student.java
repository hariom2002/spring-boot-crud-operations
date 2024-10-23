package com.hariheraclitus.crudDemo.rest;

import jakarta.persistence.*;

//step-1 MAP CLASSES TO DATABASE TABLE
//STEP -2 MAP FIELDS TO DATABSE COLUMN

@Entity
@Table(name="student")
public class Student {

//    CREATING variables and MAPPING THEM TO DATABASE ATTRIBUTES

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;


//    CREATING CONSTRUCTOR FOR ALL ATTRIBUTES

    public Student(){

    }

    public Student(String firstName, String lastName, String email) {
//        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


//    CREATING SETTER AND GETTER METHODS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


//    CREATING TOSTRING() METHOD


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
