// Level1 - Problem 1: Book with default and parameterized constructors
public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this("Unknown Title", "Unknown Author", 0.0);
    }

    public Book(String title, String author, double price) {
        this.title = title; // using this to avoid ambiguity
        this.author = author;
        this.price = price;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', price=" + price + "}";
    }
}