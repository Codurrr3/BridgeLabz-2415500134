/*
Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less
Hint => 
Write a Method to Check whether the number is positive or negative
Write a Method to check whether the number is even or odd
Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2 
In the main program, Loop through the array using the length call the method isPositive() and if positive call method isEven() and print accordingly 
If the number is negative, print negative. 
Finally compare the first and last element of the array by calling the method compare() and display if they are equal, greater, or less
*/
import java.util.Scanner;
public class ArrayPosNegEvenOddCompareMethods {
    public static boolean isPositive(int n) { return n > 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        else if (n1 == n2) return 0;
        else return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int n : arr) {
            if (isPositive(n)) {
                if (isEven(n)) System.out.println(n + " is positive and even");
                else System.out.println(n + " is positive and odd");
            } else if (n < 0) {
                System.out.println(n + " is negative");
            } else {
                System.out.println(n + " is zero");
            }
        }
        int cmp = compare(arr[0], arr[4]);
        if (cmp == 0) System.out.println("First and last elements are equal");
        else if (cmp == 1) System.out.println("First element is greater than last");
        else System.out.println("First element is less than last");
        sc.close();
    }
}
