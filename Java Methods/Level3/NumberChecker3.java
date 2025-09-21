/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to reverse the digits array 
Method to compare two arrays and check if they are equal
Method to check if a number is a palindrome using the Digits. A palindrome number is a number that remains the same when its digits are reversed. 
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
*/
import java.util.Scanner;
import java.util.Arrays;
public class NumberChecker3 {
    public static int countDigits(int n) {
        int count = 0, temp = n;
        while (temp != 0) { count++; temp /= 10; }
        return count;
    }
    public static int[] getDigits(int n) {
        int len = countDigits(n);
        int[] digits = new int[len];
        int temp = n;
        for (int i = len - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }
    public static int[] reverse(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }
    public static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }
    public static boolean isPalindrome(int[] digits) {
        return arraysEqual(digits, reverse(digits));
    }
    public static boolean isDuck(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] digits = getDigits(n);
        System.out.println("Is Palindrome: " + isPalindrome(digits));
        System.out.println("Is Duck Number: " + isDuck(digits));
        sc.close();
    }
}
