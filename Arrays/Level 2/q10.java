import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        long number = sc.nextLong();
        if (number < 0) {
            System.out.println("Invalid input. Please enter a positive number.");
        }
        int[] digits = new int[20]; 
        int index = 0;
        long temp = number;
        while (temp != 0) {
            digits[index++] = (int)(temp % 10);
            temp /= 10;
        }
        int[] frequency = new int[10];
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
        }
    }
}

