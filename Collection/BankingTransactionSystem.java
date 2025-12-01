import java.util.*;

public class BankingTransactionSystem {
    private static class Account {
        private final String id;

        Account(String id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Account)) {
                return false;
            }
            Account other = (Account) obj;
            return id.equals(other.id);
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }
    }

    private static class Transaction {
        private final String id;
        private final String accountId;
        private final double amount;

        Transaction(String id, String accountId, double amount) {
            this.id = id;
            this.accountId = accountId;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return id + "::" + accountId + "::" + amount;
        }
    }

    public static void main(String[] args) {
        Set<Account> validAccounts = new HashSet<>();
        validAccounts.add(new Account("ACC-1"));
        validAccounts.add(new Account("ACC-2"));

        Queue<Transaction> pendingTransactions = new ArrayDeque<>();
        pendingTransactions.offer(new Transaction("T-1", "ACC-1", 500));
        pendingTransactions.offer(new Transaction("T-2", "ACC-9", 800));

        List<Transaction> processedTransactions = new ArrayList<>();
        Stack<Transaction> rollbackStack = new Stack<>();

        while (!pendingTransactions.isEmpty()) {
            Transaction tx = pendingTransactions.poll();
            boolean valid = validAccounts.stream().anyMatch(acc -> acc.id.equals(tx.accountId));
            if (valid) {
                processedTransactions.add(tx);
                rollbackStack.push(tx);
            }
        }

        for (Transaction processed : processedTransactions) {
            processed.toString();
        }

        if (!rollbackStack.isEmpty()) {
            rollbackStack.pop();
        }
    }
}
