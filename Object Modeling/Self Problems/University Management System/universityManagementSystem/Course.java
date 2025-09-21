package universityManagementSystem;

import java.util.*;

public class Course {
    private final String code;
    private final String title;
    private Professor professor; // association
    private final Set<Student> students = new LinkedHashSet<>();

    public Course(String code, String title) {
        if (code == null || code.isBlank()) throw new IllegalArgumentException("code required");
        if (title == null || title.isBlank()) throw new IllegalArgumentException("title required");
        this.code = code; this.title = title;
    }

    public void assignProfessor(Professor p) {
        if (p == null) throw new IllegalArgumentException("professor required");
        if (this.professor != p) {
            if (this.professor != null) this.professor.removeCourse(this);
            this.professor = p;
            p.addCourse(this);
        }
    }

    public void enroll(Student s) { if (s == null) throw new IllegalArgumentException("student required"); students.add(s); }

    public Professor getProfessor() { return professor; }
    public Set<Student> getStudents() { return Collections.unmodifiableSet(students); }

    @Override public String toString() { return "Course[" + code + " - " + title + (professor != null ? ", Prof=" + professor.getName() : "") + "]"; }
}
