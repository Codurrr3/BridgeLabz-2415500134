package hospitalDoctorsPatients;

import java.util.*;

public class Patient {
    private final String name;
    private final Set<Doctor> doctors = new HashSet<>();
    private final List<String> notes = new ArrayList<>();

    public Patient(String name) { if (name == null || name.isBlank()) throw new IllegalArgumentException("name required"); this.name = name; }

    void addDoctor(Doctor d) { doctors.add(d); }
    void addNote(String note) { if (note != null && !note.isBlank()) notes.add(note); }

    public Set<Doctor> getDoctors() { return Collections.unmodifiableSet(doctors); }
    public List<String> getNotes() { return Collections.unmodifiableList(notes); }

    @Override public String toString() { return "Patient[" + name + "]"; }
}
