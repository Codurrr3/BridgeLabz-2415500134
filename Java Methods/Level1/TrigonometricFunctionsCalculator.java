/*
Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint => 
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)
*/
import java.util.Scanner;
public class TrigonometricFunctionsCalculator {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double[] results = new double[3];
        results[0] = Math.sin(radians);
        results[1] = Math.cos(radians);
        results[2] = Math.tan(radians);
        return results;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        double[] trig = calculateTrigonometricFunctions(angle);
        System.out.printf("Sine: %.4f\nCosine: %.4f\nTangent: %.4f\n", trig[0], trig[1], trig[2]);
        sc.close();
    }
}
