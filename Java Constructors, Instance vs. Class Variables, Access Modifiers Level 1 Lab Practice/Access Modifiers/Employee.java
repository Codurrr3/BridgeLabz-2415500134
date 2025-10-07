// Access Modifiers - Problem 4: Employee Records
public class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = Math.max(0, salary);
    }

    public void updateSalary(double newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
        }
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void showAccess() {
        // Access public employeeID and protected department
        System.out.println("Manager ID: " + employeeID + ", Department: " + department + ", Team Size: " + teamSize);
    }
}