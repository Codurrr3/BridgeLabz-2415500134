/*
Write a Java program to check if a given string is a palindrome (a string that reads the same forward and backward).
*/
import java.util.Scanner;
public class PalindromeStringCheck {
    public static boolean isPalindrome(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        boolean result = isPalindrome(text);
        System.out.println(result ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
