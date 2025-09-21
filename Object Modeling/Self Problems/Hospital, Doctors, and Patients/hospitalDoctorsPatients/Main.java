package hospitalDoctorsPatients;

public class Main {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");
        Doctor d1 = new Doctor("Mehta");
        Doctor d2 = new Doctor("Singh");
        Patient p1 = new Patient("Aarav");
        Patient p2 = new Patient("Isha");

        h.addDoctor(d1); h.addDoctor(d2);
        h.addPatient(p1); h.addPatient(p2);

        d1.consult(p1, "Fever consultation");
        d2.consult(p1, "Follow-up");
        d2.consult(p2, "Allergy consultation");

        System.out.println(h);
        System.out.println("Doctors: " + h.getDoctors());
        System.out.println("Patients: " + h.getPatients());
    }
}
