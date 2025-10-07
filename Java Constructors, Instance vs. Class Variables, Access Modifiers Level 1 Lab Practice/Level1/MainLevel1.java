public class MainLevel1 {
    public static void main(String[] args) {
        // Book
        Book b1 = new Book();
        Book b2 = new Book("Clean Code", "Robert C. Martin", 450.0);
        System.out.println(b1);
        System.out.println(b2);

        // Circle
        Circle c1 = new Circle();
        Circle c2 = new Circle(3.5);
        System.out.println(c1);
        System.out.println(c2);

        // Person with copy constructor
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person(p1);
        System.out.println(p1);
        System.out.println(p2);

        // HotelBooking
        HotelBooking hb1 = new HotelBooking();
        HotelBooking hb2 = new HotelBooking("John Doe", "Suite", 3);
        HotelBooking hb3 = new HotelBooking(hb2);
        System.out.println(hb1);
        System.out.println(hb2);
        System.out.println(hb3);

        // LibraryBook borrow
        LibraryBook lb = new LibraryBook("Effective Java", "Joshua Bloch", 550.0, true);
        System.out.println(lb);
        System.out.println("Borrowed? " + lb.borrowBook());
        System.out.println("Borrowed again? " + lb.borrowBook());
        System.out.println(lb);

        // CarRental
        CarRental cr1 = new CarRental();
        CarRental cr2 = new CarRental("Emma", "SUV", 4);
        System.out.println(cr1);
        System.out.println(cr2);
    }
}