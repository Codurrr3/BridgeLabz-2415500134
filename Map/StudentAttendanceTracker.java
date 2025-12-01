import java.util.*;

public class StudentAttendanceTracker {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new HashMap<>();
        List<String> students = List.of("Ava", "Ben", "Cara", "Dion", "Ella");
        for (String student : students) {
            attendance.put(student, 0);
        }

        List<Set<String>> dailyPresence = List.of(
            Set.of("Ava", "Ben", "Cara"),
            Set.of("Ben", "Dion"),
            Set.of("Ava", "Ella"),
            Set.of("Ava", "Ben", "Cara", "Dion"),
            Set.of("Ella"),
            Set.of("Ava", "Ben"),
            Set.of("Cara", "Dion"),
            Set.of("Ben", "Ella"),
            Set.of("Ava", "Cara", "Ella"),
            Set.of("Dion"),
            Set.of("Ben", "Cara"),
            Set.of("Ava", "Ben", "Ella"),
            Set.of("Ava"),
            Set.of("Cara", "Dion", "Ella"),
            Set.of("Ben", "Dion")
        );

        for (Set<String> present : dailyPresence) {
            present.forEach(name -> attendance.merge(name, 1, Integer::sum));
        }

        System.out.println("Under 10 days:");
        attendance.entrySet().stream()
            .filter(entry -> entry.getValue() < 10)
            .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
