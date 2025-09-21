/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to Check if a number is prime number. A prime number is a number greater than 1 that has no positive divisors other than 1 and itself. 
Method to Check if a number is a neon number. A neon number is a number where the sum of digits of the square of the number is equal to the number itself 
Method to Check if a number is a spy number. A number is called a spy number if the sum of its digits is equal to the product of its digits
Method to Check if a number is an automorphic number. An automorphic number is a number whose square ends with the number itself. E.g. 5 is an automorphic number
Method to Check if a number is a buzz number. A buzz number is a number that is either divisible by 7 or ends with 7
*/
import java.util.Scanner;
public class NumberChecker4 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }
    public static boolean isNeon(int n) {
        int sq = n * n, sum = 0;
        while (sq != 0) { sum += sq % 10; sq /= 10; }
        return sum == n;
    }
    public static boolean isSpy(int n) {
        int sum = 0, prod = 1, temp = n;
        while (temp != 0) { int d = temp % 10; sum += d; prod *= d; temp /= 10; }
        return sum == prod;
    }
    public static boolean isAutomorphic(int n) {
        int sq = n * n;
        String nStr = Integer.toString(n), sqStr = Integer.toString(sq);
        return sqStr.endsWith(nStr);
    }
    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Is Prime: " + isPrime(n));
        System.out.println("Is Neon: " + isNeon(n));
        System.out.println("Is Spy: " + isSpy(n));
        System.out.println("Is Automorphic: " + isAutomorphic(n));
        System.out.println("Is Buzz: " + isBuzz(n));
        sc.close();
    }
}
