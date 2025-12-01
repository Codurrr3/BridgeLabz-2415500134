import java.util.*;
public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new TreeMap<>();
        grades.put("Alice", 88.0);
        grades.put("Brian", 74.5);
        grades.put("Cara", 92.0);

        grades.put("Brian", 80.0);
        grades.remove("Cara");

        grades.forEach((student, grade) -> System.out.println(student + " -> " + grade));
    }
}
