import java.util.Scanner;

public class NumberFormatDemo {
    // Method to generate NumberFormatException
    public static void generateNumberFormatException() {
        String text = "abc"; // This string cannot be parsed to an integer
        int number = Integer.parseInt(text); // This will throw NumberFormatException
    }

    // Method to demonstrate handling of NumberFormatException
    public static void handleNumberFormatException() {
        String text = "abc"; // This string cannot be parsed to an integer
        try {
            int number = Integer.parseInt(text); // This will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call the method to generate the exception
        generateNumberFormatException();
        
        // Call the method to handle the exception
        handleNumberFormatException();
    }
}