package universityFacultiesDepartments;

public class Faculty {
    private final String name;

    public Faculty(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name required");
        this.name = name;
    }

    @Override public String toString() { return "Faculty[" + name + "]"; }
}
