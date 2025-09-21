package bankingSystem;

public abstract class BankAccount {
    private final String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        if (accountNumber == null || accountNumber.isBlank()) throw new IllegalArgumentException("accountNumber required");
        if (holderName == null || holderName.isBlank()) throw new IllegalArgumentException("holderName required");
        if (initialBalance < 0) throw new IllegalArgumentException("initial balance cannot be negative");
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) {
        if (holderName == null || holderName.isBlank()) throw new IllegalArgumentException("holderName required");
        this.holderName = holderName;
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

    public abstract double calculateInterest();

    public String getDetails() {
        return String.format("Account[%s] Holder=%s Balance=%.2f", accountNumber, holderName, balance);
    }
}
