import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDepartmentMapping {
    public static void main(String[] args) {
        Map<Integer, String> departments = new HashMap<>();
        departments.put(101, "HR");
        departments.put(102, "Finance");
        departments.put(103, "Engineering");
        departments.put(104, "Engineering");
        departments.put(105, "Marketing");

        departments.put(105, "Finance");

        String searchDepartment = "Engineering";
        List<Integer> employees = departments.entrySet().stream()
            .filter(entry -> entry.getValue().equals(searchDepartment))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
        System.out.println("Employees in " + searchDepartment + ": " + employees);

        Map<String, Long> counts = departments.values().stream()
            .collect(Collectors.groupingBy(value -> value, Collectors.counting()));
        counts.forEach((dept, total) -> System.out.println(dept + " -> " + total));
    }
}
