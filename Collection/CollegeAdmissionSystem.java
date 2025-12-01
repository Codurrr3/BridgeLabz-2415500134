import java.util.*;

public class CollegeAdmissionSystem {
    private static class Student implements Comparable<Student> {
        private final String id;
        private final String name;
        private final int marks;

        Student(String id, String name, int marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        @Override
        public int compareTo(Student other) {
            int cmp = Integer.compare(other.marks, this.marks);
            return cmp != 0 ? cmp : id.compareTo(other.id);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Student)) {
                return false;
            }
            Student other = (Student) obj;
            return id.equals(other.id);
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }

        @Override
        public String toString() {
            return name + "(" + marks + ")";
        }
    }

    public static void main(String[] args) {
        List<Student> applicants = new ArrayList<>();
        applicants.add(new Student("S1", "Aria", 90));
        applicants.add(new Student("S2", "Ben", 82));
        applicants.add(new Student("S3", "Cara", 76));

        Set<Student> shortlisted = new TreeSet<>();
        for (Student student : applicants) {
            if (student.marks >= 80) {
                shortlisted.add(student);
            }
        }

        Queue<Student> interviewQueue = new LinkedList<>(shortlisted);
        TreeSet<Student> meritList = new TreeSet<>();
        while (!interviewQueue.isEmpty()) {
            Student candidate = interviewQueue.poll();
            meritList.add(candidate);
        }

        meritList.descendingSet();
    }
}
