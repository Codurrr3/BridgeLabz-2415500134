package assignment12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class WarehouseItem {
    private final String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
}

class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }
}

class Storage<T extends WarehouseItem> {
    private final List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

public class WarehouseDemo {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getName());
        }
    }

    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Phone"));
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice"));
        displayItems(electronicsStorage.getItems());
        displayItems(groceriesStorage.getItems());
        displayItems(Arrays.asList(new Furniture("Chair")));
    }
}
