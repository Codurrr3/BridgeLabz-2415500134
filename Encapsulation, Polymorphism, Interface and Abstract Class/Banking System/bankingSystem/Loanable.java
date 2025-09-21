package bankingSystem;

public interface Loanable {
    boolean applyForLoan(double amount);
    String calculateLoanEligibility();
}
