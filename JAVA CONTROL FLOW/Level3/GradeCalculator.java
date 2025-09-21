package Level3;
/*
Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines.
Hint:
Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks
Refer to the provided grade table for grade and remarks.
*/
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Physics: ");
        double physics = sc.nextDouble();
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = sc.nextDouble();
        System.out.print("Enter marks for Maths: ");
        double maths = sc.nextDouble();
        double percentage = (physics + chemistry + maths) / 3.0;
        String grade, remarks;
        if (percentage >= 80) { grade = "A"; remarks = "Level 4, above agency-normalized standards"; }
        else if (percentage >= 70) { grade = "B"; remarks = "Level 3, at agency-normalized standards"; }
        else if (percentage >= 60) { grade = "C"; remarks = "Level 2, below, but approaching agency-normalized standards"; }
        else if (percentage >= 50) { grade = "D"; remarks = "Level 1, well below agency-normalized standards"; }
        else if (percentage >= 40) { grade = "E"; remarks = "Level 1-, too below agency-normalized standards"; }
        else { grade = "R"; remarks = "Remedial standards"; }
        System.out.println("Average Mark: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        sc.close();
    }
}
