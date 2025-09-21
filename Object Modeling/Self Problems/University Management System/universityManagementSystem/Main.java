package universityManagementSystem;

public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Rao");
        Professor prof2 = new Professor("Dr. Banerjee");

        Course ds = new Course("CS201", "Data Structures");
        Course db = new Course("CS301", "Databases");

        prof1.assignToCourse(ds);
        prof2.assignToCourse(db);

        Student s1 = new Student("Nisha");
        Student s2 = new Student("Vikram");

        s1.enrollCourse(ds);
        s1.enrollCourse(db);
        s2.enrollCourse(db);

        System.out.println(ds);
        System.out.println(db);
        System.out.println(s1 + " -> " + s1.getCourses());
        System.out.println(s2 + " -> " + s2.getCourses());
        System.out.println(prof1 + " teaches: " + prof1.getCourses());
        System.out.println(prof2 + " teaches: " + prof2.getCourses());
    }
}
