public class BankAccount {
    // Static shared across all accounts
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    // final ensures accountNumber is immutable after assignment
    private final String accountNumber;

    // instance fields
    private String accountHolderName;
    private double balance;

    // Constructor using 'this' to avoid ambiguity
    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = Math.max(0, initialBalance);
        totalAccounts++;
    }

    // Static method to show total accounts
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public static String getBankName() { return bankName; }
    public static void setBankName(String name) { bankName = name; }

    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { if (amount > 0) balance += amount; }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) { balance -= amount; return true; }
        return false;
    }

    public void displayDetailsIfInstance(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount acc = (BankAccount) obj;
            System.out.println("[" + bankName + "] Account{" +
                "holder='" + acc.accountHolderName + '\'' +
                ", accountNumber='" + acc.accountNumber + '\'' +
                ", balance=" + acc.balance +
                "}");
        } else {
            System.out.println("Not a BankAccount instance");
        }
    }
}