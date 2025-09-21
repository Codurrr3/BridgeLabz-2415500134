package employeeManagementSystem;

public class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        // Full-time: base salary, could add allowances
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String departmentName) {
        if (departmentName == null || departmentName.isBlank()) throw new IllegalArgumentException("department required");
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department == null ? "No department assigned" : "Department: " + department;
    }
}
