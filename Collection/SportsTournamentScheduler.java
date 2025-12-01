import java.util.*;
public class SportsTournamentScheduler {
    private static class Team implements Comparable<Team> {
        private final String name;
        private final int points;

        Team(String name, int points) {
            this.name = name;
            this.points = points;
        }

        @Override
        public int compareTo(Team other) {
            int cmp = Integer.compare(other.points, this.points);
            return cmp != 0 ? cmp : name.compareTo(other.name);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Team)) {
                return false;
            }
            Team other = (Team) obj;
            return name.equals(other.name);
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }

        @Override
        public String toString() {
            return name + "(" + points + ")";
        }
    }

    private static class Match {
        private final String id;

        Match(String id) {
            this.id = id;
        }
    }

    private static class Result {
        private final String summary;

        Result(String summary) {
            this.summary = summary;
        }

        @Override
        public String toString() {
            return summary;
        }
    }

    public static void main(String[] args) {
        Set<Team> teams = new TreeSet<>();
        teams.add(new Team("Sharks", 0));
        teams.add(new Team("Falcons", 0));

        Queue<Match> schedule = new ArrayDeque<>();
        schedule.offer(new Match("Match-1"));
        schedule.offer(new Match("Match-2"));

        List<Result> results = new ArrayList<>();
        while (!schedule.isEmpty()) {
            Match match = schedule.poll();
            results.add(new Result(match.id + " done"));
        }

        TreeSet<Team> leaderboard = new TreeSet<>();
        leaderboard.add(new Team("Sharks", 6));
        leaderboard.add(new Team("Falcons", 3));

        results.forEach(Result::toString);
        leaderboard.forEach(Team::toString);
    }
}
