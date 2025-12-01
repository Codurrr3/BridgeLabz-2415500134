import java.util.*;

public class OnlineExaminationManagementSystem {
    private static class Question {
        private final int id;
        private final String text;

        Question(int id, String text) {
            this.id = id;
            this.text = text;
        }

        @Override
        public String toString() {
            return "Q" + id + ": " + text;
        }
    }

    private static class Student {
        private final String id;

        Student(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return id;
        }
    }

    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(1, "What is JVM?"));
        questions.add(new Question(2, "Explain JIT."));
        Collections.shuffle(questions);

        Set<String> studentIds = new TreeSet<>();
        studentIds.add("STD-001");
        studentIds.add("STD-001");
        studentIds.add("STD-002");

        Queue<Student> waitingStudents = new LinkedList<>();
        waitingStudents.offer(new Student("STD-001"));
        waitingStudents.offer(new Student("STD-002"));

        Stack<Question> navigationStack = new Stack<>();
        for (Question question : questions) {
            navigationStack.push(question);
        }
    }
}
