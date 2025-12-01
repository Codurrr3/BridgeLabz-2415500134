public class ShoppingCartPriceSummary {
    public static void main(String[] args) {
        java.util.LinkedHashMap<String, Double> cart = new java.util.LinkedHashMap<>();
        addProduct(cart, "Laptop", 42000.0);
        addProduct(cart, "Headphones", 2500.0);
        addProduct(cart, "Mouse", 1200.0);

        cart.forEach((product, price) -> System.out.println(product + " -> " + price));

        double total = cart.values().stream().mapToDouble(Double::doubleValue).sum();
        double finalAmount = total > 5000 ? total * 0.9 : total;
        System.out.println("Total: " + total + ", Payable: " + finalAmount);

        simulateRemoval(cart, "Mouse");
        cart.forEach((product, price) -> System.out.println("After removal: " + product + " -> " + price));
    }

    private static void addProduct(java.util.LinkedHashMap<String, Double> cart, String product, double price) {
        cart.put(product, price);
    }

    private static void simulateRemoval(java.util.LinkedHashMap<String, Double> cart, String product) {
        cart.remove(product);
    }
}
