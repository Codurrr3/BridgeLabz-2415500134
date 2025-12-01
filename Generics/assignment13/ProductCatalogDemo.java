package assignment13;

import java.util.ArrayList;
import java.util.List;

interface Category {
    String getName();
}

class BookCategory implements Category {
    private final String name;

    BookCategory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class ClothingCategory implements Category {
    private final String name;

    ClothingCategory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Product<T extends Category> {
    private final String title;
    private double price;
    private final T category;

    Product(String title, double price, T category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return title + "(" + category.getName() + ")=" + price;
    }
}

public class ProductCatalogDemo {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discounted = product.getPrice() - product.getPrice() * (percentage / 100);
        product.setPrice(discounted);
    }

    public static void main(String[] args) {
        List<Product<?>> catalog = new ArrayList<>();
        Product<BookCategory> book = new Product<>("Novel", 300, new BookCategory("Books"));
        Product<ClothingCategory> shirt = new Product<>("Shirt", 500, new ClothingCategory("Clothing"));
        applyDiscount(book, 10);
        applyDiscount(shirt, 5);
        catalog.add(book);
        catalog.add(shirt);
        catalog.forEach(System.out::println);
    }
}
