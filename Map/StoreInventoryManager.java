import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StoreInventoryManager {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();
        stock.put("Notebook", 40);
        stock.put("Pen", 100);
        stock.put("Marker", 10);

        sell(stock, "Pen", 35);
        sell(stock, "Marker", 12);
        restock(stock, "Notebook", 20);
        restock(stock, "Marker", 30);

        String queryItem = "Stapler";
        if (stock.containsKey(queryItem)) {
            System.out.println(queryItem + " remaining: " + stock.get(queryItem));
        } else {
            System.out.println(queryItem + " not stocked");
        }

        List<String> outOfStock = stock.entrySet()
            .stream()
            .filter(entry -> entry.getValue() <= 0)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
        System.out.println("Out of stock: " + outOfStock);
    }

    private static void sell(Map<String, Integer> stock, String item, int qty) {
        stock.merge(item, -qty, Integer::sum);
        if (stock.getOrDefault(item, 0) <= 0) {
            stock.put(item, 0);
        }
    }

    private static void restock(Map<String, Integer> stock, String item, int qty) {
        stock.merge(item, qty, Integer::sum);
    }
}
