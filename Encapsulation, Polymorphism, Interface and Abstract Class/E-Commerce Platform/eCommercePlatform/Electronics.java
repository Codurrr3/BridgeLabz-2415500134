package eCommercePlatform;

public class Electronics extends Product implements Taxable {
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // 10% discount on electronics
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        // 18% GST for electronics
        return (getPrice() - calculateDiscount()) * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return String.format("Electronics tax: %.2f", calculateTax());
    }
}
