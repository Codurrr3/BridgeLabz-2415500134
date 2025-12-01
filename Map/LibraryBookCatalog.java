import java.util.*;

public class LibraryBookCatalog {
    public static void main(String[] args) {
        Map<String, String> catalog = new TreeMap<>();
        catalog.put("978-0134685991", "Effective Java");
        catalog.put("978-1492078005", "Learning Java");
        catalog.put("978-0596009205", "Head First Java");

        String lookupIsbn = "978-0134685991";
        System.out.println(catalog.getOrDefault(lookupIsbn, "Book not found"));

        catalog.remove("978-0596009205");

        catalog.forEach((isbn, title) -> System.out.println(isbn + " -> " + title));

        String titleQuery = "Effective Java";
        Optional<String> isbn = catalog.entrySet()
            .stream()
            .filter(entry -> entry.getValue().equalsIgnoreCase(titleQuery))
            .map(Map.Entry::getKey)
            .findFirst();
        System.out.println("Search by title: " + isbn.orElse("Book not found"));
    }
}
