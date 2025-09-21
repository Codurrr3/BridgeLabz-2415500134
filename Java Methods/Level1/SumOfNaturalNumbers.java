/*
Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop 
*/
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = sumNaturalNumbers(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        sc.close();
    }
}
