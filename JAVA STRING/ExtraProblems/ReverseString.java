/*
Write a Java program to reverse a given string without using any built-in reverse functions.
*/
import java.util.Scanner;
public class ReverseString {
    public static String reverse(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String reversed = reverse(text);
        System.out.println("Reversed string: " + reversed);
        sc.close();
    }
}
