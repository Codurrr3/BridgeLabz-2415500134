import java.util.Scanner;

public class NullPointerDemo {
    // Method to generate a NullPointerException
    public static void generateNullPointerException() {
        String text = null; // Initialize text to null
        // This will throw a NullPointerException
        System.out.println(text.length());
    }

    // Method to demonstrate handling of NullPointerException
    public static void handleNullPointerException() {
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("A NullPointerException was caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call the method to handle the NullPointerException
        handleNullPointerException();
    }
}