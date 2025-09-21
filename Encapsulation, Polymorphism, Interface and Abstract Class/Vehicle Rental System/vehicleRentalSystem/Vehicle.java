package vehicleRentalSystem;

public abstract class Vehicle {
    private final String vehicleNumber;
    private String type;
    private double rentalRate; // per day

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        if (vehicleNumber == null || vehicleNumber.isBlank()) throw new IllegalArgumentException("vehicleNumber required");
        if (type == null || type.isBlank()) throw new IllegalArgumentException("type required");
        if (rentalRate < 0) throw new IllegalArgumentException("rentalRate cannot be negative");
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public void setType(String type) {
        if (type == null || type.isBlank()) throw new IllegalArgumentException("type required");
        this.type = type;
    }
    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rentalRate) {
        if (rentalRate < 0) throw new IllegalArgumentException("rentalRate cannot be negative");
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public String getDetails() {
        return String.format("Vehicle[number=%s, type=%s, rate=%.2f/day]", vehicleNumber, type, rentalRate);
    }
}
