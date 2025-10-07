public class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static int getTotalPatients() { return totalPatients; }
    public static void setHospitalName(String name) { hospitalName = name; }
    public static String getHospitalName() { return hospitalName; }

    public void displayIfInstance(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println("[" + hospitalName + "] Patient{" +
                "id='" + p.patientID + '\'' +
                ", name='" + p.name + '\'' +
                ", age=" + p.age +
                ", ailment='" + p.ailment + '\'' +
                "}");
        } else {
            System.out.println("Not a Patient instance");
        }
    }
}