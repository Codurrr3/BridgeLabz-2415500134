package hospitalPatientManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        InPatient ip = new InPatient("P001", "Neha", 30, 4, 2500);
        ip.addRecord("Admitted for observation");
        OutPatient op = new OutPatient("P002", "Rahul", 25, 2, 500);
        op.addRecord("Routine checkup");

        patients.add(ip);
        patients.add(op);

        for (Patient p : patients) {
            System.out.println(p.getPatientDetails());
            System.out.printf("Bill: %.2f%n", p.calculateBill());
            System.out.println("Records: " + p.viewRecords());
            System.out.println("---");
        }
    }
}
