public class MainInstance {
    public static void main(String[] args) {
        // Product
        Product p1 = new Product("Keyboard", 999.0);
        Product p2 = new Product("Mouse", 499.0);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();

        // Course
        Course c1 = new Course("Java", 8, 5000);
        Course c2 = new Course("Python", 6, 4500);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("XYZ Academy");
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Vehicle
        Vehicle v1 = new Vehicle("Rahul", "Car");
        Vehicle v2 = new Vehicle("Sneha", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(650.0);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}