package employeeManagementSystem;

public class PartTimeEmployee extends Employee implements Department {
    private String department;
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0);
        if (hourlyRate < 0) throw new IllegalArgumentException("hourlyRate cannot be negative");
        if (hoursWorked < 0) throw new IllegalArgumentException("hoursWorked cannot be negative");
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) throw new IllegalArgumentException("hourlyRate cannot be negative");
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked < 0) throw new IllegalArgumentException("hoursWorked cannot be negative");
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
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
