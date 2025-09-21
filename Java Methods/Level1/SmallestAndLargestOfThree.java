/*
Write a program to find the smallest and the largest of the 3 numbers.
Hint => 
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
public static int[] findSmallestAndLargest(int number1, int number2, int number3)
*/
import java.util.Scanner;
public class SmallestAndLargestOfThree {
    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        int smallest = n1, largest = n1;
        if (n2 < smallest) smallest = n2;
        if (n3 < smallest) smallest = n3;
        if (n2 > largest) largest = n2;
        if (n3 > largest) largest = n3;
        return new int[]{smallest, largest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();
        int[] result = findSmallestAndLargest(n1, n2, n3);
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
        sc.close();
    }
}
