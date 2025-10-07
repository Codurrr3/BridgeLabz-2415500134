public class MainVehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Arjun", "Car", "MH12-AB-1234");
        Vehicle v2 = new Vehicle("Neeta", "Bike", "MH14-XY-9876");
        v1.displayIfInstance(v1);
        v2.displayIfInstance(10);
        Vehicle.updateRegistrationFee(650.0);
        v1.displayIfInstance(v1);
    }
}