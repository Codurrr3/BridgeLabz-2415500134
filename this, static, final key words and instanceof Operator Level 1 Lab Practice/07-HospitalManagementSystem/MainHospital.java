public class MainHospital {
    public static void main(String[] args) {
        System.out.println("Hospital: " + Patient.getHospitalName());
        Patient.setHospitalName("General Hospital");
        System.out.println("Updated Hospital: " + Patient.getHospitalName());

        Patient p1 = new Patient("PT-001", "Rekha", 32, "Flu");
        Patient p2 = new Patient("PT-002", "Vijay", 45, "Fracture");

        p1.displayIfInstance(p1);
        p2.displayIfInstance(new Object());

        System.out.println("Total patients: " + Patient.getTotalPatients());
    }
}