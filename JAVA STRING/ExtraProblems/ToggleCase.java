/*
Write a Java program to toggle the case of each character in a given string. Convert uppercase letters to lowercase and vice versa.
*/
import java.util.Scanner;
public class ToggleCase {
    public static String toggleCase(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') sb.append((char)(c + 32));
            else if (c >= 'a' && c <= 'z') sb.append((char)(c - 32));
            else sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String toggled = toggleCase(text);
        System.out.println("Toggled case: " + toggled);
        sc.close();
    }
}
