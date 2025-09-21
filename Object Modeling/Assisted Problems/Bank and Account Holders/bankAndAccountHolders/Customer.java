package bankAndAccountHolders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {
    private final String name;
    private final List<Account> accounts = new ArrayList<>();

    public Customer(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name required");
        this.name = name;
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    public double viewBalance() {
        return accounts.stream().mapToDouble(Account::getBalance).sum();
    }

    public List<Account> getAccounts() {
        return Collections.unmodifiableList(accounts);
    }

    @Override
    public String toString() {
        return "Customer[" + name + "]";
    }
}
