// Instance vs. Class Variables - Problem 1: Product inventory with class counter
public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product{name='" + productName + "', price=" + price + "}");
    }

    public static void displayTotalProducts() {
        System.out.println("Total products: " + totalProducts);
    }
}