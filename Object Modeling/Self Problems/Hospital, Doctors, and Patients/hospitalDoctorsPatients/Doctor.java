package hospitalDoctorsPatients;

import java.util.*;

public class Doctor {
    private final String name;
    private final Set<Patient> patients = new HashSet<>();

    public Doctor(String name) { if (name == null || name.isBlank()) throw new IllegalArgumentException("name required"); this.name = name; }

    public void consult(Patient patient, String note) {
        if (patient == null) throw new IllegalArgumentException("patient required");
        patients.add(patient);
        patient.addDoctor(this);
        patient.addNote(note == null ? "Consultation" : note);
        System.out.println("Consultation: Dr. " + name + " with " + patient + " - Note: " + note);
    }

    public Set<Patient> getPatients() { return Collections.unmodifiableSet(patients); }

    @Override public String toString() { return "Doctor[" + name + "]"; }
}
