import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException() {
        String text = "Hello, World!";
        // Accessing an index beyond the length of the string
        char character = text.charAt(text.length()); // This will throw the exception
    }

    // Method to demonstrate StringIndexOutOfBoundsException
    public static void demonstrateException() {
        try {
            generateException();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught an unexpected exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call the method to demonstrate the exception
        demonstrateException();
    }
}