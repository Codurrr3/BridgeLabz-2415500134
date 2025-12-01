import java.util.*;

public class OnlineGamingTournamentTracker {
    private static class Player {
        private final String name;

        Player(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Player)) {
                return false;
            }
            Player other = (Player) obj;
            return name.equals(other.name);
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private static class Match {
        private final String id;

        Match(String id) {
            this.id = id;
        }
    }

    private static class Result {
        private final String winner;

        Result(String winner) {
            this.winner = winner;
        }

        @Override
        public String toString() {
            return winner;
        }
    }

    private static class Score implements Comparable<Score> {
        private final String player;
        private final int points;

        Score(String player, int points) {
            this.player = player;
            this.points = points;
        }

        @Override
        public int compareTo(Score other) {
            int cmp = Integer.compare(other.points, this.points);
            return cmp != 0 ? cmp : player.compareTo(other.player);
        }

        @Override
        public String toString() {
            return player + "=" + points;
        }
    }

    public static void main(String[] args) {
        Set<Player> registeredPlayers = new TreeSet<>((a, b) -> a.name.compareTo(b.name));
        registeredPlayers.add(new Player("Lara"));
        registeredPlayers.add(new Player("Lara"));
        registeredPlayers.add(new Player("Noah"));

        Queue<Match> upcomingMatches = new LinkedList<>();
        upcomingMatches.offer(new Match("M-1"));
        upcomingMatches.offer(new Match("M-2"));

        List<Result> results = new ArrayList<>();
        while (!upcomingMatches.isEmpty()) {
            Match match = upcomingMatches.poll();
            results.add(new Result(match.id + "-Winner"));
        }

        TreeSet<Score> leaderboard = new TreeSet<>();
        leaderboard.add(new Score("Lara", 10));
        leaderboard.add(new Score("Noah", 8));
        leaderboard.add(new Score("Mia", 12));

        for (Result result : results) {
            result.toString();
        }
        for (Score score : leaderboard) {
            score.toString();
        }
    }
}
