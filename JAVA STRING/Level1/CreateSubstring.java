import java.util.Scanner;

public class CreateSubstring {
    // Method to create a substring using charAt() method
    public static String createSubstring(String text, int startIndex, int endIndex) {
        StringBuilder substring = new StringBuilder();
        for (int i = startIndex; i < endIndex; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for the string and indices
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        System.out.print("Enter start index: ");
        int startIndex = sc.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = sc.nextInt();

        // Create substring using user-defined method
        String customSubstring = createSubstring(text, startIndex, endIndex);
        
        // Create substring using built-in method
        String builtInSubstring = text.substring(startIndex, endIndex);
        
        // Display the results
        System.out.println("Custom substring: " + customSubstring);
        System.out.println("Built-in substring: " + builtInSubstring);
        System.out.println("Are both substrings equal? " + customSubstring.equals(builtInSubstring));
    }
}