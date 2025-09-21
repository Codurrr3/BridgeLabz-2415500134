package bankAndAccountHolders;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String name;
    private final List<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name required");
        this.name = name;
    }

    public String getName() { return name; }

    public Account openAccount(Customer customer, double initialDeposit) {
        if (customer == null) throw new IllegalArgumentException("customer required");
        Account account = new Account(this, customer, initialDeposit);
        customer.addAccount(account);
        if (!customers.contains(customer)) customers.add(customer);
        return account;
    }
}
