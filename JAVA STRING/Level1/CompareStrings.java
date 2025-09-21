import java.util.Scanner;

public class CompareStrings {
    // Method to compare two strings using charAt() method
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Take user input for two strings
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = sc.next();
        System.out.print("Enter the second string: ");
        String secondString = sc.next();

        // Compare using charAt() method
        boolean areEqualUsingCharAt = compareStringsUsingCharAt(firstString, secondString);
        
        // Compare using built-in equals() method
        boolean areEqualUsingEquals = firstString.equals(secondString);

        // Display results
        System.out.println("Comparison using charAt(): " + areEqualUsingCharAt);
        System.out.println("Comparison using equals(): " + areEqualUsingEquals);
    }
}