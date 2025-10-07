// Instance vs. Class Variables - Problem 2: Course with shared instituteName
public class Course {
    private String courseName;
    private int duration; // in weeks
    private double fee;
    private static String instituteName = "ABC Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course{name='" + courseName + "', duration=" + duration + " weeks, fee=" + fee + ", institute='" + instituteName + "'}");
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}