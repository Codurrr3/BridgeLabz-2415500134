package universityManagementSystem;

import java.util.*;

public class Professor {
    private final String name;
    private final Set<Course> courses = new LinkedHashSet<>();

    public Professor(String name) { if (name == null || name.isBlank()) throw new IllegalArgumentException("name required"); this.name = name; }

    void addCourse(Course c) { courses.add(c); }
    void removeCourse(Course c) { courses.remove(c); }
    public String getName() { return name; }
    public Set<Course> getCourses() { return Collections.unmodifiableSet(courses); }

    public void assignToCourse(Course c) { if (c == null) throw new IllegalArgumentException("course required"); c.assignProfessor(this); }

    @Override public String toString() { return "Professor[" + name + "]"; }
}
