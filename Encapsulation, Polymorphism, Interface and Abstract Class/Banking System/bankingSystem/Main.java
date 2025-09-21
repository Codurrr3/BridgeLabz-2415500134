package bankingSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("S-1001", "Aman", 50000));
        accounts.add(new CurrentAccount("C-1002", "Riya", 200000));

        for (BankAccount acc : accounts) {
            System.out.println(acc.getDetails());
            System.out.printf("Interest: %.2f%n", acc.calculateInterest());
            if (acc instanceof Loanable) {
                Loanable l = (Loanable) acc;
                System.out.println(l.calculateLoanEligibility());
                System.out.println("Loan 1L eligible? " + l.applyForLoan(100000));
            }
            System.out.println("---");
        }
    }
}
