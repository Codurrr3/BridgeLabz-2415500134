/*
Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define 2D Array to save the salary and years of service.
Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array of the latest salary and bonus amount 
Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format
*/
public class EmployeeBonusStats {
    public static double[][] generateSalaryAndService(int n) {
        double[][] arr = new double[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = 10000 + Math.random() * 90000; // 5-digit salary
            arr[i][1] = 1 + (int)(Math.random() * 20); // 1-20 years
        }
        return arr;
    }
    public static double[][] calculateBonusAndNewSalary(double[][] arr) {
        double[][] result = new double[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            double bonus = arr[i][1] > 5 ? arr[i][0] * 0.05 : arr[i][0] * 0.02;
            result[i][0] = arr[i][0] + bonus;
            result[i][1] = bonus;
        }
        return result;
    }
    public static void displayStats(double[][] arr, double[][] newArr) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("Emp\tOld Salary\tYears\tNew Salary\tBonus");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t%.2f\n", (i+1), arr[i][0], arr[i][1], newArr[i][0], newArr[i][1]);
            totalOld += arr[i][0];
            totalNew += newArr[i][0];
            totalBonus += newArr[i][1];
        }
        System.out.printf("Total\t%.2f\t\t%.2f\t%.2f\n", totalOld, totalNew, totalBonus);
    }
    public static void main(String[] args) {
        double[][] arr = generateSalaryAndService(10);
        double[][] newArr = calculateBonusAndNewSalary(arr);
        displayStats(arr, newArr);
    }
}
