package assignment5;

import java.util.ArrayList;
import java.util.List;

class Fruit {
    private final String name;

    Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple");
    }
}

class Mango extends Fruit {
    Mango() {
        super("Mango");
    }
}

class FruitBox<T extends Fruit> {
    private final List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void displayFruits() {
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getName());
        }
    }
}

public class FruitDemo {
    public static void main(String[] args) {
        FruitBox<Fruit> box = new FruitBox<>();
        box.addFruit(new Apple());
        box.addFruit(new Mango());
        box.displayFruits();
    }
}
