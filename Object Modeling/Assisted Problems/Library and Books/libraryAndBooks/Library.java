package libraryAndBooks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private final String name;
    private final List<Book> books = new ArrayList<>();

    public Library(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name required");
        this.name = name;
    }

    public String getName() { return name; }

    // Aggregation: library holds references to books it doesn't own
    public void addBook(Book book) {
        if (book == null) throw new IllegalArgumentException("book required");
        books.add(book);
    }

    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }

    @Override
    public String toString() {
        return "Library[" + name + "]";
    }
}
