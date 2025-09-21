package ecommerceOrders;

public class Product {
    private final String id;
    private final String name;
    private final double price;

    public Product(String id, String name, double price) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("id required");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name required");
        if (price < 0) throw new IllegalArgumentException("price must be >= 0");
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }

    @Override public String toString() { return "Product{" + id + ": " + name + ", Rs." + price + '}'; }
}
