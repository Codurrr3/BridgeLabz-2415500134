public class FixedDepositAccount extends BankAccount {
    private int tenureMonths;

    public FixedDepositAccount(String accountNumber, double balance, int tenureMonths) {
        super(accountNumber, balance);
        this.tenureMonths = tenureMonths;
    }

    @Override
    public void displayAccountType() {
        System.out.println("FixedDepositAccount: " + accountNumber + ", balance=" + balance + ", tenure=" + tenureMonths + " months");
    }
}