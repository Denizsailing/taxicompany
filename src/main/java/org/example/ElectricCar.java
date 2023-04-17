package org.example;

public class ElectricCar extends Car {
    private String color;

    public ElectricCar(String make, String model, int year, double price, int mileage, int numDoors, String color) {
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
