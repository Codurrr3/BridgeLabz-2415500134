package hospitalPatientManagement;

public class InPatient extends Patient {
    private int daysAdmitted;
    private double roomRate;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double roomRate) {
        super(patientId, name, age);
        if (daysAdmitted < 0) throw new IllegalArgumentException("daysAdmitted cannot be negative");
        if (roomRate < 0) throw new IllegalArgumentException("roomRate cannot be negative");
        this.daysAdmitted = daysAdmitted;
        this.roomRate = roomRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * roomRate;
    }
}
