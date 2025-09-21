package onlineFoodDeliverySystem;

public class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double total) {
        // 5% discount for veg items
        return total - (total * 0.05);
    }

    @Override
    public String getDiscountDetails() {
        return "Veg discount: 5%";
    }
}
