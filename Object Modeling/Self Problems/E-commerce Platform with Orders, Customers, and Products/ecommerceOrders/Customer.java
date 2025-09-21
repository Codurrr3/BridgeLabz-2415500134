package ecommerceOrders;

import java.util.*;

public class Customer {
    private final String name;
    private final List<Order> orders = new ArrayList<>();

    public Customer(String name) { if (name == null || name.isBlank()) throw new IllegalArgumentException("name required"); this.name = name; }

    public Order createOrder(String orderId) {
        Order o = new Order(orderId, this);
        orders.add(o);
        return o;
    }

    void addOrder(Order o) { if (!orders.contains(o)) orders.add(o); }

    public List<Order> getOrders() { return Collections.unmodifiableList(orders); }

    @Override public String toString() { return "Customer[" + name + "]"; }
}
