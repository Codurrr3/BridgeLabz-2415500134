package vehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("MH01-1234", 2500));
        vehicles.add(new Bike("MH02-5678", 800));
        vehicles.add(new Truck("MH03-9999", 5000));

        int days = 3;
        for (Vehicle v : vehicles) {
            double rental = v.calculateRentalCost(days);
            double insurance = (v instanceof Insurable) ? ((Insurable) v).calculateInsurance() : 0.0;
            System.out.println(v.getDetails());
            System.out.printf("Rental for %d days: %.2f, Insurance: %.2f%n", days, rental, insurance);
            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println(ins.getInsuranceDetails());
            }
            System.out.println("---");
        }
    }
}
