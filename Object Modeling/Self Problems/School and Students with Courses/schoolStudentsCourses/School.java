package schoolStudentsCourses;

import java.util.*;

public class School {
    private final String name;
    private final List<Student> students = new ArrayList<>();

    public School(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name required");
        this.name = name;
    }

    // Aggregation: School holds references to Student but students can exist independently
    public void admit(Student s) { if (s == null) throw new IllegalArgumentException("student required"); students.add(s); }

    public List<Student> getStudents() { return Collections.unmodifiableList(students); }

    @Override public String toString() { return "School[" + name + "]"; }
}
