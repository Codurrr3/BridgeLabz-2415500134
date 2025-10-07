public class Vehicle {
    private static double registrationFee = 500.0;

    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayIfInstance(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            System.out.println("Vehicle{" +
                "regNo='" + v.registrationNumber + '\'' +
                ", owner='" + v.ownerName + '\'' +
                ", type='" + v.vehicleType + '\'' +
                ", fee=" + registrationFee +
                "}");
        } else {
            System.out.println("Not a Vehicle instance");
        }
    }
}