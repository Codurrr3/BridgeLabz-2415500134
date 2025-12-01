import java.util.*;

public class HospitalPatientManagementSystem {
    private static class Patient {
        private final String id;

        Patient(String id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Patient)) {
                return false;
            }
            Patient other = (Patient) obj;
            return id.equals(other.id);
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }

        @Override
        public String toString() {
            return id;
        }
    }

    public static void main(String[] args) {
        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> treatmentQueue = new ArrayDeque<>();
        Stack<Patient> discharged = new Stack<>();
        List<Patient> history = new ArrayList<>();

        Patient a = new Patient("P-1");
        Patient b = new Patient("P-2");
        admitted.add(a);
        admitted.add(b);
        treatmentQueue.offer(a);
        treatmentQueue.offer(b);

        while (!treatmentQueue.isEmpty()) {
            Patient current = treatmentQueue.poll();
            history.add(current);
            discharged.push(current);
        }

        if (!discharged.isEmpty()) {
            Patient readmit = discharged.pop();
            treatmentQueue.offer(readmit);
        }

        history.forEach(Patient::toString);
    }
}
