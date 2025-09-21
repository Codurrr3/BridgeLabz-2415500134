package onlineFoodDeliverySystem;

public class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        // Non-veg: 10% additional charge
        double base = getPrice() * getQuantity();
        return base + (base * 0.10);
    }

    @Override
    public double applyDiscount(double total) {
        // 3% discount for non-veg items
        return total - (total * 0.03);
    }

    @Override
    public String getDiscountDetails() {
        return "Non-veg discount: 3% (after 10% add-on)";
    }
}
