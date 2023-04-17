package org.example;


public class Trip {
    private String pickupAddress;
    private String destinationAddress;
    private int passengerCount;

    public Trip(String pickupAddress, String destinationAddress, int passengerCount) {
        this.pickupAddress = pickupAddress;
        this.destinationAddress = destinationAddress;
        this.passengerCount = passengerCount;
    }

    public String getPickupAddress() {
        return pickupAddress;
    }

    public void setPickupAddress(String pickupAddress) {
        this.pickupAddress = pickupAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }
}