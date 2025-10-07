public class MainBank {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Aarav", "ACC1001", 1000);
        BankAccount acc2 = new BankAccount("Isha", "ACC1002", 500);

        acc1.deposit(250);
        acc2.withdraw(100);

        // instanceof before displaying details
        acc1.displayDetailsIfInstance(acc1);
        acc2.displayDetailsIfInstance("not an account");

        BankAccount.getTotalAccounts();
        System.out.println("Bank Name: " + BankAccount.getBankName());
        BankAccount.setBankName("NextGen Bank");
        System.out.println("Updated Bank Name: " + BankAccount.getBankName());
    }
}