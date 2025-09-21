package vehicleRentalSystem;

public class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        double base = getRentalRate() * days;
        // Car may have a flat cleaning fee
        return base + 200;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10; // 10% of daily rate as insurance per rental
    }

    @Override
    public String getInsuranceDetails() {
        return String.format("Car insurance fee: %.2f", calculateInsurance());
    }
}
