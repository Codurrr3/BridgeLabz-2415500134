// Level1 - Problem 6: CarRental with constructors and total cost calculation
public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    public CarRental() {
        this("Walk-in", "Hatchback", 1);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateTotalCost(carModel, rentalDays);
    }

    private double calculateTotalCost(String carModel, int days) {
        double rate;
        switch (carModel.toLowerCase()) {
            case "suv": rate = 80; break;
            case "sedan": rate = 60; break;
            default: rate = 40; // hatchback or others
        }
        return rate * Math.max(0, days);
    }

    public double getTotalCost() { return totalCost; }

    @Override
    public String toString() {
        return "CarRental{customerName='" + customerName + "', carModel='" + carModel + "', rentalDays=" + rentalDays + ", totalCost=" + totalCost + "}";
    }
}