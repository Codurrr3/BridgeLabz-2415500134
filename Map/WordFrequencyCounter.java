import java.util.*;
public class WordFrequencyCounter {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        Map<String, Integer> counts = new HashMap<>();

        Arrays.stream(sentence.split("\\s+"))
            .map(word -> word.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", ""))
            .filter(word -> !word.isEmpty())
            .forEach(word -> counts.merge(word, 1, Integer::sum));

        counts.forEach((word, count) -> System.out.println(word + " -> " + count));
    }
}
