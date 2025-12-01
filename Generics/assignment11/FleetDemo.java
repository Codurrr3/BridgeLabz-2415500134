package assignment11;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
    private final String name;

    Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Truck extends Vehicle {
    Truck(String name) {
        super(name);
    }
}

class Bike extends Vehicle {
    Bike(String name) {
        super(name);
    }
}

class FleetManager<T extends Vehicle> {
    private final List<T> fleet = new ArrayList<>();

    public void addVehicle(T vehicle) {
        fleet.add(vehicle);
    }

    public void showFleet() {
        for (Vehicle vehicle : fleet) {
            System.out.println(vehicle.getName());
        }
    }
}

public class FleetDemo {
    public static void main(String[] args) {
        FleetManager<Truck> trucks = new FleetManager<>();
        trucks.addVehicle(new Truck("Truck1"));
        trucks.showFleet();
        FleetManager<Bike> bikes = new FleetManager<>();
        bikes.addVehicle(new Bike("Bike1"));
        bikes.showFleet();
    }
}
