package universityFacultiesDepartments;

import java.util.*;

public class University {
    private final String name;
    private final List<Department> departments = new ArrayList<>();
    private boolean disposed = false;

    public University(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name required");
        this.name = name;
    }

    public Department addDepartment(String deptName) {
        ensureNotDisposed();
        Department d = new Department(deptName);
        departments.add(d);
        return d;
    }

    public List<Department> getDepartments() {
        ensureNotDisposed();
        return Collections.unmodifiableList(departments);
    }

    public void destroy() {
        for (Department d : departments) {
            d.destroy();
        }
        departments.clear();
        disposed = true;
    }

    private void ensureNotDisposed() {
        if (disposed) throw new IllegalStateException("University is disposed");
    }

    @Override public String toString() { return "University[" + name + "]"; }

    // Composition: Department cannot exist without University
    public class Department {
        private final String name;
        private final List<Faculty> facultyMembers = new ArrayList<>();
        private boolean disposed = false;

        private Department(String name) { if (name == null || name.isBlank()) throw new IllegalArgumentException("dept name required"); this.name = name; }

        public void addFaculty(Faculty f) { ensureNotDisposed(); if (f == null) throw new IllegalArgumentException("faculty required"); facultyMembers.add(f); }
        public List<Faculty> getFacultyMembers() { ensureNotDisposed(); return Collections.unmodifiableList(facultyMembers); }

        private void destroy() { facultyMembers.clear(); disposed = true; }
        private void ensureNotDisposed() { if (disposed) throw new IllegalStateException("Department is disposed"); }
        @Override public String toString() { return "Department[" + name + "]"; }
    }
}
