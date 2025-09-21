import java.util.Scanner;

public class ToLowerCaseDemo {
    // Method to convert a string to lowercase using charAt()
    public static String convertToLowerCase(String text) {
        StringBuilder lowerCaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if the character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adjusting ASCII value
                lowerCaseText.append((char) (ch + 32));
            } else {
                lowerCaseText.append(ch);
            }
        }
        return lowerCaseText.toString();
    }

    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        // Take user input for the complete text
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a complete text: ");
        String originalText = sc.nextLine();

        // Convert the text to lowercase using user-defined method
        String lowerCaseText = convertToLowerCase(originalText);

        // Convert the text to lowercase using built-in method
        String builtInLowerCaseText = originalText.toLowerCase();

        // Compare the two results
        boolean isEqual = compareStrings(lowerCaseText, builtInLowerCaseText);

        // Display the results
        System.out.println("Lowercase using charAt(): " + lowerCaseText);
        System.out.println("Lowercase using built-in method: " + builtInLowerCaseText);
        System.out.println("Are both methods equal? " + isEqual);
    }
}