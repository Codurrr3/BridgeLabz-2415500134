package schoolStudentsCourses;

public class Main {
    public static void main(String[] args) {
        School school = new School("Greenwood High");
        Student john = new Student("John");
        Student sara = new Student("Sara");

        Course math = new Course("Math");
        Course physics = new Course("Physics");

        school.admit(john);
        school.admit(sara);

        john.enroll(math);
        john.enroll(physics);
        sara.enroll(math);

        System.out.println(school + " students: " + school.getStudents());
        System.out.println(john + " courses: " + john.getCourses());
        System.out.println(math + " students: " + math.getStudents());
    }
}
