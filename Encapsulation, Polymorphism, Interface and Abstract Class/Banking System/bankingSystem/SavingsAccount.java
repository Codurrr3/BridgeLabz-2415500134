package bankingSystem;

public class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName, initialBalance);
    }

    @Override
    public double calculateInterest() {
        // 4% annual interest (simplified per call)
        return getBalance() * 0.04;
    }

    @Override
    public boolean applyForLoan(double amount) {
        // Simple rule: eligible if balance >= 20% of loan amount
        return getBalance() >= amount * 0.20;
    }

    @Override
    public String calculateLoanEligibility() {
        return "Savings: eligible if balance >= 20% of requested";
    }
}
