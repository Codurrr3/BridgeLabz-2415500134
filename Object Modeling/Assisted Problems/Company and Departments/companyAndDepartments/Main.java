package companyAndDepartments;

public class Main {
    public static void main(String[] args) {
        Company c = new Company("TechCorp");
        Company.Department dev = c.createDepartment("Development");
        Company.Department hr = c.createDepartment("HR");

        Company.Department.Employee e1 = dev.hire("Alice");
        Company.Department.Employee e2 = dev.hire("Bob");
        Company.Department.Employee e3 = hr.hire("Riya");

        System.out.println(c);
        System.out.println(dev + " -> " + dev.getEmployees());
        System.out.println(hr + " -> " + hr.getEmployees());

        // Destroy company (composition)
        c.destroy();
        System.out.println("Company destroyed (departments and employees disposed)");
    }
}
