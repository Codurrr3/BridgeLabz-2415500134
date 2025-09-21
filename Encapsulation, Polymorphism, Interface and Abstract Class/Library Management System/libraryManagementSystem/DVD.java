package libraryManagementSystem;

public class DVD extends LibraryItem implements Reservable {
    private boolean reserved;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // shortest loan
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
