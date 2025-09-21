package libraryManagementSystem;

public class Book extends LibraryItem implements Reservable {
    private boolean reserved;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (reserved) return false;
        reserved = true;
        return true;
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}
