import java.util.*;

public class ExamSubjectTopperReport {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> subjectScores = new HashMap<>();
        addScore(subjectScores, "Math", "Ava", 95);
        addScore(subjectScores, "Math", "Ben", 88);
        addScore(subjectScores, "Math", "Cara", 91);
        addScore(subjectScores, "Science", "Ava", 76);
        addScore(subjectScores, "Science", "Ben", 89);
        addScore(subjectScores, "Science", "Cara", 94);
        addScore(subjectScores, "History", "Ava", 82);
        addScore(subjectScores, "History", "Ben", 90);

        for (Map.Entry<String, Map<String, Integer>> entry : subjectScores.entrySet()) {
            String subject = entry.getKey();
            Map<String, Integer> scores = entry.getValue();
            Optional<Map.Entry<String, Integer>> topper = scores.entrySet().stream()
                .max(Map.Entry.comparingByValue());
            topper.ifPresent(top -> System.out.println(subject + " topper -> " + top.getKey() + " (" + top.getValue() + ")"));

            double avg = scores.values().stream().mapToInt(Integer::intValue).average().orElse(0);
            System.out.println(subject + " avg -> " + avg);
        }

        subjectScores.entrySet().stream()
            .filter(entry -> entry.getValue().values().stream().anyMatch(mark -> mark > 90))
            .forEach(entry -> System.out.println("Subject with 90+: " + entry.getKey()));
    }

    private static void addScore(Map<String, Map<String, Integer>> subjectScores, String subject, String student, int mark) {
        subjectScores.computeIfAbsent(subject, key -> new HashMap<>()).put(student, mark);
    }
}
