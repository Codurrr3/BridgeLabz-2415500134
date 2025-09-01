// 
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("The addition = " + (num1 + num2));
        System.out.println("The subtraction = " + (num1 - num2));
        System.out.println("The multiplication = " + (num1 * num2));
        System.out.println("The division = " + (num1 / num2));
    }
}
