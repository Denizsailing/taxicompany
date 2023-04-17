package org.example;

public class SUV extends Car {
    private boolean isFourWheelDrive;

    public SUV(String make, String model, int year, double price, int mileage, int numDoors, boolean isFourWheelDrive) {
        super(make, model, year, price, mileage, numDoors);
        this.isFourWheelDrive = isFourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return isFourWheelDrive;
    }

    public void setFourWheelDrive(boolean isFourWheelDrive) {
        this.isFourWheelDrive = isFourWheelDrive;
    }
}