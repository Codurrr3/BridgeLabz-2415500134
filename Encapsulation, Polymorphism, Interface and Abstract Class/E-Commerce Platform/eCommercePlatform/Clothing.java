package eCommercePlatform;

public class Clothing extends Product implements Taxable {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // 15% discount on clothing
        return getPrice() * 0.15;
    }

    @Override
    public double calculateTax() {
        // 5% tax for clothing (example)
        return (getPrice() - calculateDiscount()) * 0.05;
    }

    @Override
    public String getTaxDetails() {
        return String.format("Clothing tax: %.2f", calculateTax());
    }
}
