package eCommercePlatform;

public abstract class Product {
    private final String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        if (productId == null || productId.isBlank()) throw new IllegalArgumentException("productId required");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name required");
        if (price < 0) throw new IllegalArgumentException("price cannot be negative");
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public void setName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name required");
        this.name = name;
    }
    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("price cannot be negative");
        this.price = price;
    }

    public abstract double calculateDiscount();

    public String getDetails() {
        return String.format("Product[id=%s, name=%s, price=%.2f]", productId, name, price);
    }
}
