package eCommercePlatform;

public class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // 2% discount on groceries
        return getPrice() * 0.02;
    }
}
