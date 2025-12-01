import java.util.*;

public class CountryCapitalLookup {
    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();
        countries.put("Australia", "Canberra");
        countries.put("Brazil", "Brasilia");
        countries.put("Canada", "Ottawa");
        countries.put("Denmark", "Copenhagen");
        countries.put("Egypt", "Cairo");
        countries.put("France", "Paris");
        countries.put("Germany", "Berlin");
        countries.put("Hungary", "Budapest");

        String input = "Brazil";
        System.out.println(input + " -> " + countries.getOrDefault(input, "Unknown country"));

        countries.forEach((country, capital) -> System.out.println(country + ": " + capital));

    }
}
