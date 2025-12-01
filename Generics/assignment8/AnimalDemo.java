package assignment8;

import java.util.Arrays;
import java.util.List;

class Animal {
    public void speak() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Cat");
    }
}

public class AnimalDemo {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.speak();
        }
    }

    public static void main(String[] args) {
        printAnimals(Arrays.asList(new Dog(), new Dog()));
        printAnimals(Arrays.asList(new Cat(), new Cat()));
    }
}
