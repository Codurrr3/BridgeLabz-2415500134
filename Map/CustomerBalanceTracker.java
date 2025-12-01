import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerBalanceTracker {
    public static void main(String[] args) {
        Map<String, Double> balances = new HashMap<>();
        balances.put("ACC100", 1500.0);
        balances.put("ACC101", 5400.0);
        balances.put("ACC102", 9800.0);
        balances.put("ACC103", 200.0);
        balances.put("ACC104", 3200.0);

        deposit(balances, "ACC100", 500.0);
        withdraw(balances, "ACC103", 150.0);
        withdraw(balances, "ACC103", 200.0);

        Map<String, Double> sorted = balances.entrySet().stream()
            .sorted(Map.Entry.<String, Double>comparingByValue(Comparator.reverseOrder()))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
        sorted.forEach((account, balance) -> System.out.println(account + " -> " + balance));

        System.out.println("Top 3:");
        sorted.entrySet().stream().limit(3).forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }

    private static void deposit(Map<String, Double> balances, String account, double amount) {
        balances.merge(account, amount, Double::sum);
    }

    private static void withdraw(Map<String, Double> balances, String account, double amount) {
        balances.computeIfPresent(account, (key, balance) -> {
            if (balance < amount) {
                System.out.println("Insufficient balance for " + account);
                return balance;
            }
            return balance - amount;
        });
    }
}
