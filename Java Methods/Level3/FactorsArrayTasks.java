/*
Write a program to find the factors of a number and perform various tasks using the factors array
Hint => 
Method to find factors of a number and return them as an array. Note there are 2 for loops: one for the count and another for finding the factor and storing in the array
Method to find the greatest factor of a Number using the factors array
Method to find the sum of the factors using factors array and return the sum
Method to find the product of the factors using factors array and return the product
Method to find the product of the cube of the factors using the factors array. Use Math.pow() 
*/
import java.util.Scanner;
public class FactorsArrayTasks {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[idx++] = i;
        return factors;
    }
    public static int greatestFactor(int[] arr) {
        int max = arr[0];
        for (int v : arr) if (v > max && v != arr[arr.length-1]) max = v;
        return max;
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
    public static double productOfCubes(int[] arr) {
        double p = 1;
        for (int v : arr) p *= Math.pow(v, 3);
        return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] factors = findFactors(n);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();
        System.out.println("Greatest factor (besides itself): " + greatestFactor(factors));
        System.out.println("Sum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Product of cubes: " + productOfCubes(factors));
        sc.close();
    }
}
