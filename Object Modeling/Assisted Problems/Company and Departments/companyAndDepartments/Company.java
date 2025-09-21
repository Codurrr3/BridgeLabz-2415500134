package companyAndDepartments;

import java.util.*;

public class Company {
    private final String name;
    private final List<Department> departments = new ArrayList<>();
    private boolean disposed = false;

    public Company(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name required");
        this.name = name;
    }

    public Department createDepartment(String deptName) {
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
        // Composition: destroying the Company destroys its parts
        for (Department d : departments) {
            d.destroy();
        }
        departments.clear();
        disposed = true;
    }

    private void ensureNotDisposed() {
        if (disposed) throw new IllegalStateException("Company is disposed");
    }

    @Override
    public String toString() { return "Company[" + name + "]"; }

    // Composition: Department cannot exist without Company
    public class Department {
        private final String name;
        private final List<Employee> employees = new ArrayList<>();
        private boolean disposed = false;

        private Department(String name) {
            if (name == null || name.isBlank()) throw new IllegalArgumentException("dept name required");
            this.name = name;
        }

        public Employee hire(String empName) {
            ensureNotDisposed();
            Employee e = new Employee(empName);
            employees.add(e);
            return e;
        }

        public List<Employee> getEmployees() {
            ensureNotDisposed();
            return Collections.unmodifiableList(employees);
        }

        private void destroy() {
            employees.clear();
            disposed = true;
        }

        private void ensureNotDisposed() {
            if (disposed) throw new IllegalStateException("Department is disposed");
        }

        @Override
        public String toString() { return "Department[" + name + "]"; }

        // Composition: Employee cannot exist without Department
        public class Employee {
            private final String name;
            private Employee(String name) {
                if (name == null || name.isBlank()) throw new IllegalArgumentException("employee name required");
                this.name = name;
            }
            @Override
            public String toString() { return "Employee[" + name + "]"; }
        }
    }
}
