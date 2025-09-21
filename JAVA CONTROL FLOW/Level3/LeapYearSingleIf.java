package Level3;
/*
Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators
*/
import java.util.Scanner;
public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year");
        } else if (year < 1582) {
            System.out.println("Year must be >= 1582 (Gregorian calendar)");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
        sc.close();
    }
}
