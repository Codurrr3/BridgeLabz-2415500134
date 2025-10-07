// Level1 - Problem 4: HotelBooking with default, parameterized and copy constructors
public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;
    private double totalPrice;

    public HotelBooking() {
        this("Walk-in", "Standard", 1);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
        this.totalPrice = calculatePrice(roomType, nights); // encapsulated logic
    }

    public HotelBooking(HotelBooking other) {
        this(other.guestName, other.roomType, other.nights);
    }

    private double calculatePrice(String roomType, int nights) {
        double rate;
        switch (roomType.toLowerCase()) {
            case "deluxe": rate = 150; break;
            case "suite": rate = 250; break;
            default: rate = 100;
        }
        return rate * Math.max(0, nights);
    }

    public double getTotalPrice() { return totalPrice; }

    @Override
    public String toString() {
        return "HotelBooking{guestName='" + guestName + "', roomType='" + roomType + "', nights=" + nights + ", totalPrice=" + totalPrice + "}";
    }
}