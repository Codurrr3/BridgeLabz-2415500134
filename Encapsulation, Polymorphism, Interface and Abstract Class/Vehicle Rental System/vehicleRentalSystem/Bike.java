package vehicleRentalSystem;

public class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        double base = getRentalRate() * days;
        return base; // No extra fees
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5%
    }

    @Override
    public String getInsuranceDetails() {
        return String.format("Bike insurance fee: %.2f", calculateInsurance());
    }
}
