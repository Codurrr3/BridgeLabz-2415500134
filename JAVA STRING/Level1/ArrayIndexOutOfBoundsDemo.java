import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException() {
        String[] names = {"Alice", "Bob", "Charlie"};
        // Accessing an index that is out of bounds
        System.out.println(names[5]);
    }

    // Method to demonstrate ArrayIndexOutOfBoundsException
    public static void demonstrateException() {
        try {
            generateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call the method to demonstrate the exception
        demonstrateException();
    }
}