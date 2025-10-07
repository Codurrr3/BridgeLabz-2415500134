public class Book {
    // Static shared variable
    private static String libraryName = "City Library";

    // final ISBN cannot change
    private final String isbn;

    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public static void setLibraryName(String name) { libraryName = name; }

    public void displayIfInstance(Object obj) {
        if (obj instanceof Book) {
            Book b = (Book) obj;
            System.out.println("[" + libraryName + "] Book{" +
                "title='" + b.title + '\'' +
                ", author='" + b.author + '\'' +
                ", isbn='" + b.isbn + '\'' +
                "}");
        } else {
            System.out.println("Not a Book instance");
        }
    }
}