/*
Write a program to to check if a text is palindrome and display the result
Hint => 
A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
Logic 1: Write a method to compare the characters from the start and end of the string to determine whether the text is palindrome. The logic used here is as follows:
Set the start and end indexes of the text
Loop through the text and compare the characters from the start and the end of the string. If the characters are not equal, return false
Logic 2: Write a recursive method to compare the characters from the start and end of the text passed as parameters using recursion. The logic used here is as follows:
First, check if the start index is greater than or equal to the end index, then return true.
If the characters at the start and end indexes are not equal, return false.
Otherwise, call the method recursively with the start index incremented by 1 and the end index
Logic 3: Write a Method to compare the characters from the start and end of the text using character arrays. The logic used here is as follows:
Firstly Write a Method to reverse a string using the charAt() method and return the reversal array.
Create a character array using the String method toCharArray() and also create a reverse array. Compare the characters in the original and reverse arrays to do a Palindrome check 
Finally, in the main method do palindrome check using the three logic and display result
*/
import java.util.Scanner;
public class PalindromeCheck {
    public static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
    public static boolean isPalindromeArray(String text) {
        char[] arr = text.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = text.charAt(arr.length - 1 - i);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != rev[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        System.out.println("Iterative: " + (isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Recursive: " + (isPalindromeRecursive(text, 0, text.length() - 1) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Array: " + (isPalindromeArray(text) ? "Palindrome" : "Not Palindrome"));
        sc.close();
    }
}
