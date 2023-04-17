package org.example;

public class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int year, double price, int mileage, int numDoors) {
        super(make, model, year, price, mileage);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
}