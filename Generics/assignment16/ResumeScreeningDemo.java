package assignment16;

import java.util.Arrays;
import java.util.List;

abstract class JobRole {
    private final String candidate;

    JobRole(String candidate) {
        this.candidate = candidate;
    }

    public String getCandidate() {
        return candidate;
    }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer(String candidate) {
        super(candidate);
    }
}

class DataScientist extends JobRole {
    DataScientist(String candidate) {
        super(candidate);
    }
}

class ProductManager extends JobRole {
    ProductManager(String candidate) {
        super(candidate);
    }
}

class Resume<T extends JobRole> {
    private final T role;

    Resume(T role) {
        this.role = role;
    }

    public T getRole() {
        return role;
    }
}

public class ResumeScreeningDemo {
    public static void screen(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println(role.getCandidate());
        }
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Alice"));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bob"));
        screen(Arrays.asList(seResume.getRole(), dsResume.getRole(), new ProductManager("Cara")));
    }
}
