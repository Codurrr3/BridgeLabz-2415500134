package employeeManagementSystem;

public abstract class Employee {
    private final String employeeId;
    private String name;
    private double baseSalary;

    public Employee(String employeeId, String name, double baseSalary) {
        if (employeeId == null || employeeId.isBlank()) throw new IllegalArgumentException("employeeId required");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name required");
        if (baseSalary < 0) throw new IllegalArgumentException("baseSalary cannot be negative");
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public void setName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name required");
        this.name = name;
    }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) throw new IllegalArgumentException("baseSalary cannot be negative");
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public String displayDetails() {
        return String.format("Employee[id=%s, name=%s, baseSalary=%.2f]", employeeId, name, baseSalary);
    }
}
