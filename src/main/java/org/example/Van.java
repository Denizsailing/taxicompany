package org.example;

public class Van extends Vehicle {
    private boolean isFourWheelDrive;

    public Van(String make, String model, int year, double price, int mileage, boolean isFourWheelDrive) {
        super(make, model, year, price, mileage);
        this.isFourWheelDrive = isFourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return isFourWheelDrive;
    }

    public void setFourWheelDrive(boolean isFourWheelDrive) {
        this.isFourWheelDrive = isFourWheelDrive;
    }
}
