package org.example;

public class Truck extends Vehicle {
    private int cargoCapacity;

    public Truck(String make, String model, int year, double price, int mileage, int cargoCapacity) {
        super(make, model, year, price, mileage);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
