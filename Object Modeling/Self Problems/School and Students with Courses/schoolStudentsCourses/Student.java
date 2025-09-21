package schoolStudentsCourses;

import java.util.*;

public class Student {
    private final String name;
    private final Set<Course> courses = new HashSet<>();

    public Student(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name required");
        this.name = name;
    }

    public void enroll(Course course) {
        if (course == null) throw new IllegalArgumentException("course required");
        courses.add(course);
        course.addStudent(this);
    }

    public Set<Course> getCourses() { return Collections.unmodifiableSet(courses); }

    @Override public String toString() { return "Student[" + name + "]"; }
}
