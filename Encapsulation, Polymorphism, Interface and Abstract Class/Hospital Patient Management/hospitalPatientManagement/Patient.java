package hospitalPatientManagement;

import java.util.ArrayList;
import java.util.List;

public abstract class Patient implements MedicalRecord {
    private final String patientId;
    private String name;
    private int age;

    // sensitive
    private final List<String> medicalHistory = new ArrayList<>();

    public Patient(String patientId, String name, int age) {
        if (patientId == null || patientId.isBlank()) throw new IllegalArgumentException("patientId required");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name required");
        if (age < 0) throw new IllegalArgumentException("age cannot be negative");
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public void setName(String name) { if (name == null || name.isBlank()) throw new IllegalArgumentException("name required"); this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { if (age < 0) throw new IllegalArgumentException("age cannot be negative"); this.age = age; }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return String.format("Patient[id=%s, name=%s, age=%d]", patientId, name, age);
    }

    @Override
    public void addRecord(String record) {
        if (record == null || record.isBlank()) throw new IllegalArgumentException("record required");
        medicalHistory.add(record);
    }

    @Override
    public String viewRecords() {
        return String.join("; ", medicalHistory);
    }
}
