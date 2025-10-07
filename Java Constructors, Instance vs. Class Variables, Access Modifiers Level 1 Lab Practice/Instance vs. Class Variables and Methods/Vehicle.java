// Instance vs. Class Variables - Problem 3: Vehicle with shared registration fee
public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 500.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle{owner='" + ownerName + "', type='" + vehicleType + "', registrationFee=" + registrationFee + "}");
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}