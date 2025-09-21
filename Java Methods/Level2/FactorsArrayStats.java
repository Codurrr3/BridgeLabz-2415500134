/*
Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results
Hint => 
Take the input for a number
Write a static Method to find the factors of the number and save them in an array and return the array. 
To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count. And the second loop save the factors into the array
Write a method to find the sum of the factors using factors array
Write a method to find the product of the factors using factors array
Write a method to find the sum of square of the factors using Math.pow() method
*/
import java.util.Scanner;
public class FactorsArrayStats {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[idx++] = i;
        return factors;
    }
    public static int sum(int[] arr) {
        int s = 0;
        for (int v : arr) s += v;
        return s;
    }
    public static int product(int[] arr) {
        int p = 1;
        for (int v : arr) p *= v;
        return p;
    }
    public static int sumOfSquares(int[] arr) {
        int s = 0;
        for (int v : arr) s += Math.pow(v, 2);
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] factors = findFactors(n);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();
        System.out.println("Sum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of squares: " + sumOfSquares(factors));
        sc.close();
    }
}
