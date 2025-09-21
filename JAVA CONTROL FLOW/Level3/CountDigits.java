package Level3;
/*
Create a program to count the number of digits in an integer.
Hint:
Get an integer input for the number variable.
Create an integer variable count with value 0.
Use a loop to iterate until number is not equal to 0.
Remove the last digit from number in each iteration
Increase count by 1 in each iteration.
Finally display the count to show the number of digits
*/
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int count = 0;
        int temp = Math.abs(number);
        if (temp == 0) count = 1;
        else {
            while (temp != 0) {
                temp /= 10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}
