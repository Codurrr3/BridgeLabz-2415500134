package assignment9;

import java.util.ArrayList;
import java.util.List;

class Cart<T> {
    private final List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public void displayItems() {
        System.out.println(items);
    }
}

class Electronics {
    private final String name;

    Electronics(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Clothing {
    private final String name;

    Clothing(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class CartDemo {
    public static void main(String[] args) {
        Cart<Electronics> electronicsCart = new Cart<>();
        electronicsCart.addItem(new Electronics("Laptop"));
        electronicsCart.displayItems();
        Cart<Clothing> clothingCart = new Cart<>();
        clothingCart.addItem(new Clothing("Shirt"));
        clothingCart.displayItems();
    }
}
