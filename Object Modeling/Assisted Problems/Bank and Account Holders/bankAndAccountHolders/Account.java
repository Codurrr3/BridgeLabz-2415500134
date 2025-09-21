package bankAndAccountHolders;

public class Account {
    private final Bank bank; // association
    private final Customer customer; // association
    private double balance;

    public Account(Bank bank, Customer customer, double initialDeposit) {
        if (bank == null || customer == null) throw new IllegalArgumentException("bank and customer required");
        if (initialDeposit < 0) throw new IllegalArgumentException("initial deposit cannot be negative");
        this.bank = bank;
        this.customer = customer;
        this.balance = initialDeposit;
    }

    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("deposit must be positive");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("withdraw must be positive");
        if (amount > balance) throw new IllegalArgumentException("insufficient funds");
        balance -= amount;
    }

    @Override
    public String toString() {
        return String.format("Account[bank=%s, customer=%s, balance=%.2f]", bank.getName(), customer.toString(), balance);
    }
}
