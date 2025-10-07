public class MainEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Riya", "Developer");
        Employee emp2 = new Employee(2, "Aman", "Tester");

        emp1.displayIfInstance(emp1);
        emp1.displayIfInstance("string");

        Employee.displayTotalEmployees();
        System.out.println("Company: " + Employee.getCompanyName());
        Employee.setCompanyName("Innovate Labs");
        System.out.println("Updated Company: " + Employee.getCompanyName());
    }
}