package assignment10;

import java.util.Arrays;
import java.util.List;

abstract class Product {
    private final double price;

    Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Mobile extends Product {
    Mobile(double price) {
        super(price);
    }
}

class Laptop extends Product {
    Laptop(double price) {
        super(price);
    }
}

public class PriceCalculator {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0.0;
        for (Product product : items) {
            total += product.getPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(calculateTotal(Arrays.asList(new Mobile(500), new Mobile(700))));
        System.out.println(calculateTotal(Arrays.asList(new Laptop(1000), new Laptop(1200))));
    }
}
