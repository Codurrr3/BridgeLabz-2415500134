// Access Modifiers - Problem 2: Book Library System
public class BookLib {
    public String ISBN;
    protected String title;
    private String author;

    public BookLib(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends BookLib {
    private double fileSizeMB;

    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void showPublicAndProtected() {
        // Access public ISBN and protected title
        System.out.println("EBook ISBN: " + ISBN + ", Title: " + title + ", File Size: " + fileSizeMB + "MB");
    }
}