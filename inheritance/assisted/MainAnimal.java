public class MainAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
            new Dog("Rex", 4),
            new Cat("Luna", 2),
            new Bird("Tweety", 1)
        };

        for (Animal a : animals) {
            a.displayInfo();
            a.makeSound();
            System.out.println();
        }

        // Demonstrate subclass-specific behavior using instanceof
        Animal maybeDog = animals[0];
        if (maybeDog instanceof Dog) {
            ((Dog) maybeDog).wagTail();
        }
    }
}