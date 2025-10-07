// Level1 - Problem 5: LibraryBook with borrow method
public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public boolean borrowBook() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "LibraryBook{title='" + title + "', author='" + author + "', price=" + price + ", available=" + available + "}";
    }
}