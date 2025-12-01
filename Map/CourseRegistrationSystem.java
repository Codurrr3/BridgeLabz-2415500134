import java.util.*;
public class CourseRegistrationSystem {
    public static void main(String[] args) {
        Map<String, Integer> registrations = new HashMap<>();
        registrations.put("CS101", 45);
        registrations.put("CS201", 12);
        registrations.put("MA101", 52);
        registrations.put("PH101", 3);
        registrations.put("EE101", 55);

        addStudent(registrations, "CS101", 3);
        dropStudent(registrations, "PH101", 2);
        addStudent(registrations, "PH101", 6);

        System.out.println("Near full:");
        registrations.entrySet().stream()
            .filter(entry -> entry.getValue() >= 50)
            .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

        System.out.println("Under subscribed:");
        registrations.entrySet().stream()
            .filter(entry -> entry.getValue() < 5)
            .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }

    private static void addStudent(Map<String, Integer> registrations, String course, int count) {
        registrations.merge(course, count, Integer::sum);
    }

    private static void dropStudent(Map<String, Integer> registrations, String course, int count) {
        registrations.merge(course, -count, Integer::sum);
        registrations.computeIfPresent(course, (key, value) -> Math.max(value, 0));
    }
}
