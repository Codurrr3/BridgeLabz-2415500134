package rideHailingApplication;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("V001", "Rakesh", 12));
        vehicles.add(new Bike("V002", "Sita", 8));
        vehicles.add(new Auto("V003", "Mohit", 10));

        double distance = 7.5; // km
        for (Vehicle v : vehicles) {
            double fare = v.calculateFare(distance);
            System.out.println(v.getVehicleDetails());
            System.out.printf("Fare for %.1f km: %.2f%n", distance, fare);
            if (v instanceof GPS) {
                GPS gps = (GPS) v;
                gps.updateLocation("Downtown");
                System.out.println("Location: " + gps.getCurrentLocation());
            }
            System.out.println("---");
        }
    }
}
