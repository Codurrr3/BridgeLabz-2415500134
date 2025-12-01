import java.util.*;

public class OnlineStreamingWatchHistory {
    private static class Movie {
        private final String title;
        private final String genre;

        Movie(String title, String genre) {
            this.title = title;
            this.genre = genre;
        }

        @Override
        public String toString() {
            return title + " - " + genre;
        }
    }

    public static void main(String[] args) {
        List<Movie> availableMovies = new ArrayList<>();
        availableMovies.add(new Movie("Inception", "Sci-Fi"));
        availableMovies.add(new Movie("Soul", "Animation"));

        Queue<Movie> upNext = new ArrayDeque<>();
        upNext.offer(availableMovies.get(0));
        upNext.offer(availableMovies.get(1));

        Stack<Movie> watchHistory = new Stack<>();
        Set<String> watchedGenres = new HashSet<>();

        while (!upNext.isEmpty()) {
            Movie current = upNext.poll();
            watchHistory.push(current);
            watchedGenres.add(current.genre);
        }

        watchedGenres.contains("Sci-Fi");
        watchHistory.forEach(Movie::toString);
    }
}
