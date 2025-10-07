// Access Modifiers - Problem 1: Student with public/protected/private and CGPA accessors
public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 10) {
            this.CGPA = CGPA;
        }
    }

    @Override
    public String toString() {
        return "Student{rollNumber=" + rollNumber + ", name='" + name + "', CGPA=" + CGPA + "}";
    }
}

class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void showProtectedName() {
        // Accessing protected member 'name' in subclass
        System.out.println("PostgraduateStudent Name: " + name + ", Specialization: " + specialization);
    }
}