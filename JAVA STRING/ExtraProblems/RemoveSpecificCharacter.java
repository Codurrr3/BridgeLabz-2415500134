/*
Write a Java program to remove all occurrences of a specific character from a string.
*/
import java.util.Scanner;
public class RemoveSpecificCharacter {
    public static String removeChar(String text, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ch) sb.append(text.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);
        String result = removeChar(text, ch);
        System.out.println("Modified String: " + result);
        sc.close();
    }
}
