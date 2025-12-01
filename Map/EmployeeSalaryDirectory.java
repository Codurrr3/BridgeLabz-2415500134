import java.util.*;
public class EmployeeSalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> salaries = new HashMap<>();
        salaries.put("Ava", 70000.0);
        salaries.put("Ben", 65000.0);
        salaries.put("Cara", 72000.0);
        salaries.put("Dion", 68000.0);
        salaries.put("Ella", 90000.0);
        salaries.put("Finn", 75000.0);

        giveRaise(salaries, "Ben", 0.05);
        giveRaise(salaries, "Cara", 0.08);
        giveRaise(salaries, "Zoe", 0.10);

        double average = salaries.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println("Average salary: " + average);

        double max = salaries.values().stream().mapToDouble(Double::doubleValue).max().orElse(0.0);
        salaries.entrySet().stream()
            .filter(entry -> entry.getValue() == max)
            .forEach(entry -> System.out.println("Top earner: " + entry.getKey() + " -> " + entry.getValue()));
    }

    private static void giveRaise(Map<String, Double> salaries, String name, double percent) {
        if (salaries.containsKey(name)) {
            salaries.computeIfPresent(name, (key, value) -> value + value * percent);
        } else {
            System.out.println("Employee not found: " + name);
        }
    }
}
