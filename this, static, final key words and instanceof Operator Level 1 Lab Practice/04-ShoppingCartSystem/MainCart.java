public class MainCart {
    public static void main(String[] args) {
        Product.updateDiscount(10);
        Product p1 = new Product("P-100", "Keyboard", 999.0, 2);
        Product p2 = new Product("P-200", "Mouse", 499.0, 1);

        p1.displayIfInstance(p1);
        p2.displayIfInstance("hello");

        Product.updateDiscount(25);
        p1.displayIfInstance(p1);
    }
}