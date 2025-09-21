/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to Find the count of digits in the number
Method to Store the digits of the number in a digits array
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
Method to check if the number is a armstrong number using the digits array. ​​Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE to initialize the variable.
Method to find the the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE to initialize the variable.
*/
import java.util.Scanner;
public class NumberChecker1 {
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
    public static boolean isDuck(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }
    public static boolean isArmstrong(int n, int[] digits) {
        int sum = 0, len = digits.length;
        for (int d : digits) sum += Math.pow(d, len);
        return sum == n;
    }
    public static int[] largestSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }
        return new int[]{largest, second};
    }
    public static int[] smallestSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                second = smallest;
                smallest = d;
            } else if (d < second && d != smallest) {
                second = d;
            }
        }
        return new int[]{smallest, second};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] digits = getDigits(n);
        System.out.println("Count of digits: " + countDigits(n));
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();
        System.out.println("Is Duck Number: " + isDuck(digits));
        System.out.println("Is Armstrong Number: " + isArmstrong(n, digits));
        int[] lsl = largestSecondLargest(digits);
        System.out.println("Largest: " + lsl[0] + ", Second Largest: " + lsl[1]);
        int[] sss = smallestSecondSmallest(digits);
        System.out.println("Smallest: " + sss[0] + ", Second Smallest: " + sss[1]);
        sc.close();
    }
}
