package bankingSystem;

public class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName, initialBalance);
    }

    @Override
    public double calculateInterest() {
        // 1% interest (simplified)
        return getBalance() * 0.01;
    }

    @Override
    public boolean applyForLoan(double amount) {
        // Simple rule: eligible if balance >= 10% of loan amount
        return getBalance() >= amount * 0.10;
    }

    @Override
    public String calculateLoanEligibility() {
        return "Current: eligible if balance >= 10% of requested";
    }
}
