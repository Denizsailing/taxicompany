package org.example;

public class Boat extends Car {
    private String color;

    public Boat(String make, String model, int year, double price, int mileage, int numDoors, String color) {
        super(make, model, year, price, mileage, numDoors);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}