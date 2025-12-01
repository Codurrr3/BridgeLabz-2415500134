import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class LibraryManagementSystem {
    private static class Book {
        private final String title;

        Book(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return title;
        }
    }

    public static void main(String[] args) {
        List<Book> catalog = new ArrayList<>();
        catalog.add(new Book("Clean Code"));
        catalog.add(new Book("Effective Java"));

        Set<String> memberIds = new HashSet<>();
        memberIds.add("M-1");
        memberIds.add("M-2");
        memberIds.contains("M-1");

        Queue<Book> issueQueue = new ArrayBlockingQueue<>(5);
        Stack<Book> returnedBooks = new Stack<>();

        issueQueue.offer(catalog.get(0));
        Book toIssue = issueQueue.poll();
        returnedBooks.push(toIssue);

        if (!returnedBooks.isEmpty()) {
            Book reissue = returnedBooks.pop();
            issueQueue.offer(reissue);
        }

        catalog.size();
    }
}
