public class Waiter extends Person implements Worker {
    private int tableAssigned;

    public Waiter(String name, String id, int tableAssigned) {
        super(name, id);
        this.tableAssigned = tableAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving table " + tableAssigned);
    }
}