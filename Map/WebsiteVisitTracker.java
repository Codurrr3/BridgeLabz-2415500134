import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class WebsiteVisitTracker {
    public static void main(String[] args) {
        Map<String, Integer> visits = new HashMap<>();
        List<String> pages = List.of("home", "about", "products", "home", "products", "contact", "home", "blog", "products");

        pages.forEach(page -> visits.merge(page, 1, Integer::sum));

        List<Entry<String, Integer>> sorted = new ArrayList<>(visits.entrySet());
        sorted.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        sorted.forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
        Entry<String, Integer> top = sorted.get(0);
        System.out.println("Most visited: " + top.getKey() + " with " + top.getValue());
    }
}
