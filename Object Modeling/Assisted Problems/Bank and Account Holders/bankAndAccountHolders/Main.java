package bankAndAccountHolders;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        Account a1 = bank.openAccount(alice, 1000);
        Account a2 = bank.openAccount(alice, 500);
        Account b1 = bank.openAccount(bob, 200);

        a1.deposit(250);
        b1.withdraw(50);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(b1);
        System.out.println("Alice total balance: " + alice.viewBalance());
        System.out.println("Bob total balance: " + bob.viewBalance());
    }
}
