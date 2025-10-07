public class Person {
    protected String name;
    protected String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Person{name='" + name + "', id='" + id + "'}");
    }
}