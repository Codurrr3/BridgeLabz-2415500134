package universityManagementSystem;

import java.util.*;

public class Student {
    private final String name;
    private final Set<Course> courses = new LinkedHashSet<>();

    public Student(String name) { if (name == null || name.isBlank()) throw new IllegalArgumentException("name required"); this.name = name; }

    public void enrollCourse(Course c) { if (c == null) throw new IllegalArgumentException("course required"); courses.add(c); c.enroll(this); }

    public Set<Course> getCourses() { return Collections.unmodifiableSet(courses); }

    @Override public String toString() { return "Student[" + name + "]"; }
}
