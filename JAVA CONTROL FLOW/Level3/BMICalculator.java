package Level3;
/*
Create a program to find the BMI of a person
Hint:
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Use the table to determine the weight status of the person
*/
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi <= 18.4) status = "Underweight";
        else if (bmi <= 24.9) status = "Normal";
        else if (bmi <= 39.9) status = "Overweight";
        else status = "Obese";
        System.out.printf("BMI: %.2f\nStatus: %s\n", bmi, status);
        sc.close();
    }
}
