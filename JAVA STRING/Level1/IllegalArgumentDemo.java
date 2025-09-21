import java.util.Scanner;

public class IllegalArgumentDemo {
    
    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException() {
        String text = "Sample Text";
        // This will throw IllegalArgumentException as start index is greater than end index
        String substring = text.substring(5, 3);
    }

    // Method to demonstrate IllegalArgumentException
    public static void demonstrateIllegalArgumentException() {
        try {
            generateIllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call the method to demonstrate IllegalArgumentException
        demonstrateIllegalArgumentException();
    }
}