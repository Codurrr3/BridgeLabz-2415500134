public class MainUniversity {
    public static void main(String[] args) {
        System.out.println("University: " + Student.getUniversityName());
        Student.setUniversityName("National University");
        System.out.println("Updated University: " + Student.getUniversityName());

        Student s1 = new Student(101, "Karan", "A");
        Student s2 = new Student(102, "Neha", "B+");

        s1.displayIfInstance(s1);
        s2.displayIfInstance(3.14);

        Student.displayTotalStudents();
    }
}