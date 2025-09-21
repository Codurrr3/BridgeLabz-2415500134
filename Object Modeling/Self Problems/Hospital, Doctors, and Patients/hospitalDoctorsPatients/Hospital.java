package hospitalDoctorsPatients;

import java.util.*;

public class Hospital {
    private final String name;
    private final List<Doctor> doctors = new ArrayList<>();
    private final List<Patient> patients = new ArrayList<>();

    public Hospital(String name) { if (name == null || name.isBlank()) throw new IllegalArgumentException("name required"); this.name = name; }
    public void addDoctor(Doctor d) { if (d == null) throw new IllegalArgumentException("doctor required"); doctors.add(d); }
    public void addPatient(Patient p) { if (p == null) throw new IllegalArgumentException("patient required"); patients.add(p); }

    public List<Doctor> getDoctors() { return Collections.unmodifiableList(doctors); }
    public List<Patient> getPatients() { return Collections.unmodifiableList(patients); }

    @Override public String toString() { return "Hospital[" + name + "]"; }
}
