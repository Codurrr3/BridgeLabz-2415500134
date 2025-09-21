package libraryManagementSystem;

public class Magazine extends LibraryItem implements Reservable {
    private boolean reserved;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // shorter loan
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
