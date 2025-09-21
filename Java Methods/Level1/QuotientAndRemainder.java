/*
Write a program to take 2 numbers and print their quotient and reminder
Hint => 
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number 
public static int[] findRemainderAndQuotient(int number, int divisor) 
*/
import java.util.Scanner;
public class QuotientAndRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Remainder: " + result[0] + ", Quotient: " + result[1]);
        sc.close();
    }
}
