package libraryAndBooks;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Clean Code", "Robert C. Martin");
        Book b2 = new Book("Effective Java", "Joshua Bloch");

        Library libA = new Library("City Library");
        Library libB = new Library("Campus Library");

        libA.addBook(b1);
        libA.addBook(b2);
        libB.addBook(b2); // same book can be referenced by another library (aggregation)

        System.out.println(libA + " -> " + libA.getBooks());
        System.out.println(libB + " -> " + libB.getBooks());
    }
}
