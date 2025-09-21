package ecommerceOrders;

import java.util.*;

public class Order {
    private final String orderId;
    private final Customer customer; // association to Customer
    private final List<Product> items = new ArrayList<>();

    public Order(String orderId, Customer customer) {
        if (orderId == null || orderId.isBlank()) throw new IllegalArgumentException("orderId required");
        if (customer == null) throw new IllegalArgumentException("customer required");
        this.orderId = orderId;
        this.customer = customer;
    }

    public void addProduct(Product p) { if (p == null) throw new IllegalArgumentException("product required"); items.add(p); }
    public List<Product> getItems() { return Collections.unmodifiableList(items); }

    public double totalAmount() { return items.stream().mapToDouble(Product::getPrice).sum(); }

    @Override public String toString() {
        return "Order{" + orderId + ", customer=" + customer + ", items=" + items + ", total=Rs." + totalAmount() + '}';
    }
}
