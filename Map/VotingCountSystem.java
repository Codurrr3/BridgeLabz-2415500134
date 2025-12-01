import java.util.*;

public class VotingCountSystem {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();
        List<String> ballots = List.of(
            "Ava",
            "Ben",
            "Cara",
            "Ava",
            "Ava",
            "Ben",
            "Dana",
            "Cara",
            "Ava",
            "Dana"
        );

        for (String candidate : ballots) {
            votes.merge(candidate, 1, Integer::sum);
        }

        String winner = null;
        int maxVotes = 0;
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("Winner: " + winner + " with " + maxVotes + " votes");
    }
}
