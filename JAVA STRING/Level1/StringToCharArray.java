import java.util.Scanner;

public class StringToCharArray {
    // Method to return characters in a string without using toCharArray()
    public static String[] convertStringToCharArray(String text) {
        String[] charArray = new String[text.length()];
        for (int i = 0; i < text.length(); i++) {
            charArray[i] = String.valueOf(text.charAt(i));
        }
        return charArray;
    }

    public static void main(String[] args) {
        // Take user input for the string
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        // Convert string to character array using user-defined method
        String[] userDefinedCharArray = convertStringToCharArray(inputText);

        // Convert string to character array using built-in method
        char[] builtInCharArray = inputText.toCharArray();

        // Display the results
        System.out.println("Characters using user-defined method:");
        for (String ch : userDefinedCharArray) {
            System.out.print(ch + " ");
        }

        System.out.println("\nCharacters using built-in method:");
        for (char ch : builtInCharArray) {
            System.out.print(ch + " ");
        }

        // Compare the two arrays
        boolean areArraysEqual = (userDefinedCharArray.length == builtInCharArray.length);
        for (int i = 0; i < userDefinedCharArray.length && areArraysEqual; i++) {
            if (userDefinedCharArray[i].charAt(0) != builtInCharArray[i]) {
                areArraysEqual = false;
            }
        }

        // Display comparison result
        System.out.println("\nAre both methods producing the same result? " + areArraysEqual);
    }
}