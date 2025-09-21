package libraryManagementSystem;

public interface Reservable {
    boolean reserveItem(String borrowerName);
    boolean checkAvailability();
}
