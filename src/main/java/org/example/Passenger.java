package org.example;

public class Passenger extends Person {
    private String email;
    private String phoneNumber;

    public Passenger(String name, int age, char gender, String email, String phoneNumber) {
        super(name, age, gender);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}