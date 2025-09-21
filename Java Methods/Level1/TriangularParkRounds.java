/*
An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run
*/
import java.util.Scanner;
public class TriangularParkRounds {
    public static double calculateRounds(double a, double b, double c, double distance) {
        double perimeter = a + b + c;
        return distance / perimeter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 (meters): ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2 (meters): ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3 (meters): ");
        double c = sc.nextDouble();
        double rounds = calculateRounds(a, b, c, 5000);
        System.out.printf("Number of rounds to complete 5km: %.2f\n", rounds);
        sc.close();
    }
}
