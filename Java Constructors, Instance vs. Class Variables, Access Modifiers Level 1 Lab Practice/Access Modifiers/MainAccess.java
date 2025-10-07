public class MainAccess {
    public static void main(String[] args) {
        // Student & PostgraduateStudent
        Student s = new Student(101, "Aarav", 8.5);
        System.out.println(s);
        s.setCGPA(9.1);
        System.out.println("Updated CGPA: " + s.getCGPA());
        PostgraduateStudent ps = new PostgraduateStudent(102, "Isha", 9.0, "AI");
        ps.showProtectedName();

        // BookLib & EBook
        BookLib bl = new BookLib("978-0134685991", "Effective Java", "Joshua Bloch");
        System.out.println("Author: " + bl.getAuthor());
        bl.setAuthor("J. Bloch");
        EBook eb = new EBook(bl.ISBN, bl.title, bl.getAuthor(), 5.4);
        eb.showPublicAndProtected();

        // BankAccount & SavingsAccount
        BankAccount ba = new BankAccount("001234", "Rohit", 1000);
        ba.deposit(500);
        System.out.println("Balance after deposit: " + ba.getBalance());
        System.out.println("Withdraw 1200? " + ba.withdraw(1200));
        System.out.println("Withdraw 600? " + ba.withdraw(600));
        SavingsAccount sa = new SavingsAccount("009876", "Sneha", 5000, 4.5);
        sa.showAccess();

        // Employee & Manager
        Employee e = new Employee("E-100", "IT", 75000);
        e.updateSalary(80000);
        System.out.println("Employee salary: " + e.getSalary());
        Manager m = new Manager("M-200", "Sales", 120000, 10);
        m.showAccess();
    }
}