package libraryAndBooks;

public class Book {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        if (title == null || title.isBlank()) throw new IllegalArgumentException("title required");
        if (author == null || author.isBlank()) throw new IllegalArgumentException("author required");
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return String.format("Book[title=%s, author=%s]", title, author);
    }
}
