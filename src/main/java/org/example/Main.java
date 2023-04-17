package org.example;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("deniz", 25, 'M', "123", 3000.0, 1, 3.5);
        Passenger passenger = new Passenger("deniz", 25, 'm', "deniz@gmail.com", "12344532");
        Location location = new Location("izmir, Turkey", 23.12313, 21.123123);
        Trip trip = new Trip("123 izmir konak", "123 karsiyaka", 3);
        Person person = new Person("deniz", 25, 'M');
        Car myCar = new Car("ww", "passat", 2022, 355000, 0, 4);
        Truck myTruck = new Truck("Ford", "raptor", 2017, 432000, 12000, 12200);
        Motorcycle myMotorcycle = new Motorcycle("yamaha", "ybr", 2022, 7000, 0, 2);
        SUV mySUV = new SUV("mercedes", "G", 2022, 12340000, 0, 4, true);
        LuxuryCar luxuryCar = new LuxuryCar("Mercedes-Benz", "S-600", 2022, 120000.0, 0, 4, "Black");
        Van van = new Van("Mercedes", "Sprinter", 2012, 100000.0, 0, true);
        ElectricCar electricCar = new ElectricCar("tesla", "x", 2022, 130000.0, 0, 4, "Black");
        Boat boat = new Boat("mercury", "abc", 2022, 5000.0, 0, 0, "Black");





        System.out.println("person name: " + person.getName());
        System.out.println("person age: " + person.getAge());
        System.out.println("gender: " + person.getGender());

        // update
        person.setName("gunduz");
        person.setAge(30);
        person.setGender('m');

        // updated
        System.out.println("upadated person name : " + person.getName());
        System.out.println("updated person age: " + person.getAge());
        System.out.println("updated person gender " + person.getGender());

        System.out.println("Trip Information:");
        System.out.println("Pickup Address: " + trip.getPickupAddress());
        System.out.println("Destination Address: " + trip.getDestinationAddress());
        System.out.println("Passenger Count: " + trip.getPassengerCount());

        System.out.println("Passenger name: " + passenger.getName());
        System.out.println("Passenger age: " + passenger.getAge());
        System.out.println("Passenger gender: " + passenger.getGender());
        System.out.println("Passenger email: " + passenger.getEmail());
        System.out.println("Passenger phone number: " + passenger.getPhoneNumber());

        driver.setSalary(4500.0);
        System.out.println("Driver new salary: " + driver.getSalary());

        // Update
        trip.setPickupAddress("123 izmir bornova ");
        trip.setDestinationAddress("123 izmir alsancak");
        trip.setPassengerCount(5);

        // Print  updated
        System.out.println("\nUpdated Trip Information:");
        System.out.println("Pickup Address: " + trip.getPickupAddress());
        System.out.println("Destination Address: " + trip.getDestinationAddress());
        System.out.println("Passenger Count: " + trip.getPassengerCount());

        location.setAddress("canakkale, Turkey");
        location.setLatitude(123.1231);
        location.setLongitude(123.123113);

        System.out.println("New address: " + location.getAddress());
        System.out.println("New latitude: " + location.getLatitude());
        System.out.println("New longitude: " + location.getLongitude());

        System.out.println("Address: " + location.getAddress());
        System.out.println("Latitude: " + location.getLatitude());
        System.out.println("Longitude: " + location.getLongitude());

        System.out.println("Driver name: " + driver.getName());
        System.out.println("Driver age: " + driver.getAge());
        System.out.println("Driver gender: " + driver.getGender());
        System.out.println("Driver license number: " + driver.getLicenseNumber());
        System.out.println("Driver salary: " + driver.getSalary());
        System.out.println("Driver experience years: " + driver.getExperienceYears());
        System.out.println("Driver rating: " + driver.getRating());



        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Price: $" + myCar.getPrice());

        // update  doors
        myCar.setNumDoors(2);
        System.out.println("Number of doors after update: " + myCar.getNumDoors());

        System.out.println("Make: " + myTruck.getMake());
        System.out.println("Model: " + myTruck.getModel());
        System.out.println("Year: " + myTruck.getYear());
        System.out.println("Price: $" + myTruck.getPrice());

        System.out.println("Make: " + myMotorcycle.getMake());
        System.out.println("Model: " + myMotorcycle.getModel());
        System.out.println("Year: " + myMotorcycle.getYear());
        System.out.println("Price: $" + myMotorcycle.getPrice());
        System.out.println("Mileage: " + myMotorcycle.getMileage());
        System.out.println("Number of wheels: " + myMotorcycle.getNumWheels());
        myMotorcycle.setNumWheels(3);
        System.out.println("Number of wheels after update: " + myMotorcycle.getNumWheels());

        System.out.println("Make: " + mySUV.getMake());
        System.out.println("Model: " + mySUV.getModel());
        System.out.println("Year: " + mySUV.getYear());
        System.out.println("Price: $" + mySUV.getPrice());
        // update
        mySUV.setNumDoors(2);
        mySUV.setFourWheelDrive(false);
        System.out.println("Number of doors after update: " + mySUV.getNumDoors());
        System.out.println("Four-wheel drive after update: " + mySUV.isFourWheelDrive());
        System.out.println("Make: " + luxuryCar.getMake());
        System.out.println("Model: " + luxuryCar.getModel());
        System.out.println("Year: " + luxuryCar.getYear());
        System.out.println("Price: $" + luxuryCar.getPrice());
        System.out.println("Mileage: " + luxuryCar.getMileage());
        System.out.println("Number of Doors: " + luxuryCar.getNumDoors());
        System.out.println("Color: " + luxuryCar.getColor());

        luxuryCar.setPrice(170000.0);
        luxuryCar.setMileage(5222);
        luxuryCar.setColor("blue");

        System.out.println("Make: " + van.getMake());
        System.out.println("Model: " + van.getModel());
        System.out.println("Year: " + van.getYear());
        System.out.println("Price: " + van.getPrice());
        System.out.println("Mileage: " + van.getMileage());
        System.out.println("Four Wheel Drive: " + van.isFourWheelDrive());

        // update price
        van.setPrice(2500000.0);
        van.setMileage(20000);


        System.out.println("Make: " + electricCar.getMake());
        System.out.println("Model: " + electricCar.getModel());
        System.out.println("Year: " + electricCar.getYear());
        System.out.println("Price: $" + electricCar.getPrice());
        System.out.println("Mileage: " + electricCar.getMileage());
        System.out.println("Number of Doors: " + electricCar.getNumDoors());
        System.out.println("Color: " + electricCar.getColor());

        electricCar.setPrice(170000.0);
        electricCar.setMileage(5000);
        electricCar.setColor("White");

        System.out.println("Make: " + electricCar.getMake());
        System.out.println("Model: " + electricCar.getModel());
        System.out.println("Year: " + electricCar.getYear());
        System.out.println("Price: $" + electricCar.getPrice());
        System.out.println("Color: " + electricCar.getColor());





















    }
}
