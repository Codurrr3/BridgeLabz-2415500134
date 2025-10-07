public class MainLibrary {
    public static void main(String[] args) {
        Book.displayLibraryName();
        Book.setLibraryName("Central Library");
        Book.displayLibraryName();

        Book b1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        b1.displayIfInstance(b1);
        b1.displayIfInstance(42);
    }
}