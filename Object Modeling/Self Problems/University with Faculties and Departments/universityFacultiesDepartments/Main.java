package universityFacultiesDepartments;

public class Main {
    public static void main(String[] args) {
        University uni = new University("Global University");
        University.Department cs = uni.addDepartment("Computer Science");
        University.Department mech = uni.addDepartment("Mechanical");

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Iyer");

        // Aggregation: Faculty can exist independently of departments/university
        cs.addFaculty(f1);
        mech.addFaculty(f2);

        System.out.println(uni);
        System.out.println(cs + " -> " + cs.getFacultyMembers());
        System.out.println(mech + " -> " + mech.getFacultyMembers());

        // Destroy university (composition over departments)
        uni.destroy();
        System.out.println("University destroyed (departments disposed); faculty still exist: " + f1 + ", " + f2);
    }
}
