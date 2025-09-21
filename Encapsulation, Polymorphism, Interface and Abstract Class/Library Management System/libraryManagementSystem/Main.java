package libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B001", "Effective Java", "Joshua Bloch"));
        items.add(new Magazine("M010", "Tech Monthly", "Various"));
        items.add(new DVD("D100", "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
                System.out.println("Reserve: " + r.reserveItem("John Doe"));
                System.out.println("Available after reserve: " + r.checkAvailability());
            }
            System.out.println("---");
        }
    }
}
