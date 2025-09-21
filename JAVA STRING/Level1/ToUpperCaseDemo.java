import java.util.Scanner;

public class ToUpperCaseDemo {
    // Method to convert text to uppercase using charAt()
    public static String convertToUpperCase(String text) {
        StringBuilder upperCaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Convert to uppercase if it's a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                upperCaseText.append((char) (ch - 32));
            } else {
                upperCaseText.append(ch);
            }
        }
        return upperCaseText.toString();
    }

    public static void main(String[] args) {
        // Take user input for the complete text
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the complete text: ");
        String text = sc.nextLine();

        // Convert using user-defined method
        String customUpperCase = convertToUpperCase(text);
        // Convert using built-in method
        String builtInUpperCase = text.toUpperCase();

        // Compare the results
        boolean isEqual = customUpperCase.equals(builtInUpperCase);

        // Display the results
        System.out.println("Custom Uppercase: " + customUpperCase);
        System.out.println("Built-in Uppercase: " + builtInUpperCase);
        System.out.println("Are both methods equal? " + isEqual);
    }
}