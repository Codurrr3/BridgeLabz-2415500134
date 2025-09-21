package rideHailingApplication;

public abstract class Vehicle {
    private final String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        if (vehicleId == null || vehicleId.isBlank()) throw new IllegalArgumentException("vehicleId required");
        if (driverName == null || driverName.isBlank()) throw new IllegalArgumentException("driverName required");
        if (ratePerKm < 0) throw new IllegalArgumentException("ratePerKm cannot be negative");
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public void setDriverName(String driverName) { if (driverName == null || driverName.isBlank()) throw new IllegalArgumentException("driverName required"); this.driverName = driverName; }
    public double getRatePerKm() { return ratePerKm; }
    public void setRatePerKm(double ratePerKm) { if (ratePerKm < 0) throw new IllegalArgumentException("ratePerKm cannot be negative"); this.ratePerKm = ratePerKm; }

    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return String.format("Vehicle[id=%s, driver=%s, rate=%.2f/km]", vehicleId, driverName, ratePerKm);
    }
}
