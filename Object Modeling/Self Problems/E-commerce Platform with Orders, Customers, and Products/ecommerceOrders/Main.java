package ecommerceOrders;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Kavya");
        Customer c2 = new Customer("Rohan");

        Product p1 = new Product("P101", "Notebook", 80);
        Product p2 = new Product("P102", "Pen", 20);
        Product p3 = new Product("P103", "Water Bottle", 200);

        Order o1 = c1.createOrder("O-1");
        o1.addProduct(p1); o1.addProduct(p2);

    Order o2 = c2.createOrder("O-2");
        o2.addProduct(p3);
        o2.addProduct(p2);

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(c1 + " orders: " + c1.getOrders());
        System.out.println(c2 + " orders: " + c2.getOrders());
    }
}
