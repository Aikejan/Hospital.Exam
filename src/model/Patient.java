package model;

import enums.Gender;

public class Patient {
    private  Long id;
    private  String firstName;
    private  String lastName;
    private  int phoneNumber;
    private Gender  gender;
    private int age;

    public Patient(Long id, String firstName, String lastName, int phoneNumber, Gender gender, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return " id: " + id +
                " firstName: " + firstName + '\n' +
                " lastName: " + lastName + '\n' +
                " phoneNumber: " + phoneNumber + "\n" +
                " gender: " + gender + '\n' +
                " age: " + age;
    }
}
