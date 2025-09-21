package hospitalPatientManagement;

public class OutPatient extends Patient {
    private int consultationCount;
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, int consultationCount, double consultationFee) {
        super(patientId, name, age);
        if (consultationCount < 0) throw new IllegalArgumentException("consultationCount cannot be negative");
        if (consultationFee < 0) throw new IllegalArgumentException("consultationFee cannot be negative");
        this.consultationCount = consultationCount;
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationCount * consultationFee;
    }
}
