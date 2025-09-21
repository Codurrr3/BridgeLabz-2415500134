package onlineFoodDeliverySystem;

public abstract class FoodItem {
    private final String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        if (itemName == null || itemName.isBlank()) throw new IllegalArgumentException("itemName required");
        if (price < 0) throw new IllegalArgumentException("price cannot be negative");
        if (quantity < 0) throw new IllegalArgumentException("quantity cannot be negative");
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public void setPrice(double price) { if (price < 0) throw new IllegalArgumentException("price cannot be negative"); this.price = price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { if (quantity < 0) throw new IllegalArgumentException("quantity cannot be negative"); this.quantity = quantity; }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return String.format("FoodItem[name=%s, price=%.2f, qty=%d]", itemName, price, quantity);
    }
}
