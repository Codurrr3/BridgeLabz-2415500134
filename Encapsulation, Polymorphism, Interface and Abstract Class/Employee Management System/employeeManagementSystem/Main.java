package employeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee fte = new FullTimeEmployee("E001", "Alice", 60000);
        fte.assignDepartment("Engineering");
        PartTimeEmployee pte = new PartTimeEmployee("E002", "Bob", 400, 80);
        pte.assignDepartment("Support");

        employees.add(fte);
        employees.add(pte);

        for (Employee e : employees) {
            System.out.println(e.displayDetails());
            System.out.printf("Calculated Salary: %.2f%n", e.calculateSalary());
            if (e instanceof Department) {
                Department d = (Department) e;
                System.out.println(d.getDepartmentDetails());
            }
            System.out.println("---");
        }
    }
}
