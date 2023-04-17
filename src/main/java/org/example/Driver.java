package org.example;

public class Driver extends Person {
    private String licenseNumber;
    private double salary;
    private int experienceYears;
    private double rating;

    public Driver(String name, int age, char gender, String licenseNumber, double salary, int experienceYears, double rating) {
        super(name, age, gender);
        this.licenseNumber = licenseNumber;
        this.salary = salary;
        this.experienceYears = experienceYears;
        this.rating = rating;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
