public class HybridDemo {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon", "C01", "Italian");
        Waiter waiter = new Waiter("Sam", "W01", 7);

        Person[] staff = new Person[] { chef, waiter };
        for (Person p : staff) {
            p.display();
            if (p instanceof Worker) {
                ((Worker) p).performDuties();
            }
            System.out.println();
        }
    }
}