import java.util.*;
public class InventoryRestockManagementSystem {
    private static class Product {
        private final String name;
        private final double price;
        private int stock;

        Product(String name, double price, int stock) {
            this.name = name;
            this.price = price;
            this.stock = stock;
        }
 
        boolean isLowStock() {
            return stock < 10;
        }
 
        void restock(int qty) {
            stock += qty;
        }

        @Override
        public String toString() {
            return name + " $" + price + " : " + stock;
        }
    }
 
    public static void main(String[] args) {
        Set<String> productNames = new HashSet<>();
        List<Product> catalog = new ArrayList<>();
        productNames.add("Milk");
        catalog.add(new Product("Milk", 1.5, 5));
        productNames.add("Bread");
        catalog.add(new Product("Bread", 2.0, 20));

        productNames.contains("Milk");
 
        Queue<Product> restockQueue = new ArrayDeque<>();
        Stack<Product> restockedHistory = new Stack<>();
        for (Product product : catalog) {
            if (product.isLowStock()) {
                restockQueue.offer(product);
            }
        }
 
        while (!restockQueue.isEmpty()) {
            Product product = restockQueue.poll();
            product.restock(15);
            restockedHistory.push(product);
        }
 
        if (!restockedHistory.isEmpty()) {
            Product undone = restockedHistory.pop();
            undone.restock(-15);
        }
    }
}
