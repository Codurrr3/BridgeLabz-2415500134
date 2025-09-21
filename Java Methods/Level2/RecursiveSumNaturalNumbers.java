/*
Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 
Hint => 
Take the user input number and check whether it's a Natural number
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
Compare the two results and print the result
*/
import java.util.Scanner;
public class RecursiveSumNaturalNumbers {
    public static int sumRecursive(int n) {
        if (n <= 1) return n;
        return n + sumRecursive(n - 1);
    }
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Not a natural number");
            return;
        }
        int sumRec = sumRecursive(n);
        int sumFor = sumFormula(n);
        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumFor);
        System.out.println("Results match: " + (sumRec == sumFor));
        sc.close();
    }
}
