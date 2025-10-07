public class Employee {
    private static String companyName = "Tech Corp";
    private static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static String getCompanyName() { return companyName; }
    public static void setCompanyName(String name) { companyName = name; }

    public void displayIfInstance(Object obj) {
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            System.out.println("[" + companyName + "] Employee{" +
                "id=" + e.id +
                ", name='" + e.name + '\'' +
                ", designation='" + e.designation + '\'' +
                "}");
        } else {
            System.out.println("Not an Employee instance");
        }
    }
}