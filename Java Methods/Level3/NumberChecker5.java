/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum of their proper divisors
Method to find the number is an abundant number. A number is called an abundant number if the sum of its proper divisors is greater than the number itself
Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper divisors is less than the number itself
Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself
*/
import java.util.Scanner;
public class NumberChecker5 {
    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum;
    }
    public static boolean isPerfect(int n) {
        return sumOfDivisors(n) == n;
    }
    public static boolean isAbundant(int n) {
        return sumOfDivisors(n) > n;
    }
    public static boolean isDeficient(int n) {
        return sumOfDivisors(n) < n;
    }
    public static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }
    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp != 0) { sum += factorial(temp % 10); temp /= 10; }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Is Perfect: " + isPerfect(n));
        System.out.println("Is Abundant: " + isAbundant(n));
        System.out.println("Is Deficient: " + isDeficient(n));
        System.out.println("Is Strong: " + isStrong(n));
        sc.close();
    }
}
