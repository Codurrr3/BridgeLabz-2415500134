/*
Write a Java program to remove all duplicate characters from a given string and return the modified string.
*/
import java.util.Scanner;
public class RemoveDuplicatesFromString {
    public static String removeDuplicates(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == c) {
                    found = true;
                    break;
                }
            }
            if (!found) sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String result = removeDuplicates(text);
        System.out.println("String after removing duplicates: " + result);
        sc.close();
    }
}
