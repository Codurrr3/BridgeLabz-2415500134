package libraryManagementSystem;

public abstract class LibraryItem {
    private final String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        if (itemId == null || itemId.isBlank()) throw new IllegalArgumentException("itemId required");
        if (title == null || title.isBlank()) throw new IllegalArgumentException("title required");
        if (author == null || author.isBlank()) throw new IllegalArgumentException("author required");
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public void setTitle(String title) {
        if (title == null || title.isBlank()) throw new IllegalArgumentException("title required");
        this.title = title;
    }
    public String getAuthor() { return author; }
    public void setAuthor(String author) {
        if (author == null || author.isBlank()) throw new IllegalArgumentException("author required");
        this.author = author;
    }

    public abstract int getLoanDuration(); // days

    public String getItemDetails() {
        return String.format("LibraryItem[id=%s, title=%s, author=%s]", itemId, title, author);
    }
}
