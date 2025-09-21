package vehicleRentalSystem;

public class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        double base = getRentalRate() * days;
        // Truck: add per-day heavy duty fee
        return base + (days * 500);
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; // 15%
    }

    @Override
    public String getInsuranceDetails() {
        return String.format("Truck insurance fee: %.2f", calculateInsurance());
    }
}
