/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to find the sum of the digits of a number using the digits array
Method to find the sum of the squares of the digits of a number using the digits array. Use Math.pow() method
Method to Check if a number is a harshad number using a digits array. A number is called a Harshad number if it is divisible by the sum of its digits. For e.g. 21
Method to find the frequency of each digit in the number. Create a 2D array to store the frequency with digit in the first column and frequency in the second column.
*/
import java.util.Scanner;
public class NumberChecker2 {
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
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }
    public static int sumSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }
    public static boolean isHarshad(int n, int[] digits) {
        return n % sumDigits(digits) == 0;
    }
    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;
        int count = 0;
        for (int f : freq) if (f > 0) count++;
        int[][] result = new int[count][2];
        int idx = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[idx][0] = i;
                result[idx][1] = freq[i];
                idx++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] digits = getDigits(n);
        System.out.println("Count of digits: " + countDigits(n));
        System.out.println("Sum of digits: " + sumDigits(digits));
        System.out.println("Sum of squares: " + sumSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshad(n, digits));
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit : Frequency");
        for (int[] row : freq) System.out.println(row[0] + " : " + row[1]);
        sc.close();
    }
}
