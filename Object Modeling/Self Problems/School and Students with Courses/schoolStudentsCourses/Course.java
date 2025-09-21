package schoolStudentsCourses;

import java.util.*;

public class Course {
    private final String title;
    private final Set<Student> students = new HashSet<>();

    public Course(String title) {
        if (title == null || title.isBlank()) throw new IllegalArgumentException("title required");
        this.title = title;
    }

    void addStudent(Student s) { students.add(s); }

    public Set<Student> getStudents() { return Collections.unmodifiableSet(students); }

    @Override public String toString() { return "Course[" + title + "]"; }
}
