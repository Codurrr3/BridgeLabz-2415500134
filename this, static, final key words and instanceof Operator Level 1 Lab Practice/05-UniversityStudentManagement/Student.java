public class Student {
    private static String universityName = "State University";
    private static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private String grade;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public static String getUniversityName() { return universityName; }
    public static void setUniversityName(String name) { universityName = name; }

    public void displayIfInstance(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("[" + universityName + "] Student{" +
                "rollNumber=" + s.rollNumber +
                ", name='" + s.name + '\'' +
                ", grade='" + s.grade + '\'' +
                "}");
        } else {
            System.out.println("Not a Student instance");
        }
    }
}