package eCommercePlatform;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("P100", "Laptop", 85000));
        products.add(new Clothing("P200", "Jacket", 3000));
        products.add(new Groceries("P300", "Rice (10kg)", 700));

        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0.0;
            double finalPrice = p.getPrice() - discount + tax;

            System.out.println(p.getDetails());
            System.out.printf("Discount: %.2f, Tax: %.2f, Final Price: %.2f%n", discount, tax, finalPrice);
            if (p instanceof Taxable) {
                System.out.println(((Taxable) p).getTaxDetails());
            }
            System.out.println("---");
        }
    }
}
