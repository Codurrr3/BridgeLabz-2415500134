public class Product {
    private static double discount = 0.0; // percentage

    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = Math.max(0, Math.min(newDiscount, 100));
    }

    public double totalPrice() {
        double total = price * quantity;
        return total * (1 - discount / 100);
    }

    public void displayIfInstance(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            System.out.println("Product{" +
                "id='" + p.productID + '\'' +
                ", name='" + p.productName + '\'' +
                ", price=" + p.price +
                ", qty=" + p.quantity +
                ", totalAfterDiscount=" + p.totalPrice() +
                "} (discount=" + discount + "%)");
        } else {
            System.out.println("Not a Product instance");
        }
    }
}