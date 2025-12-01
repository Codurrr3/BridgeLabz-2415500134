import java.util.*;

public class CustomerFeedbackAnalysis {
    public static void main(String[] args) {
        List<String> feedbackEntries = new ArrayList<>();
        feedbackEntries.add("Great app");
        feedbackEntries.add("Needs dark mode");
        feedbackEntries.add("Great app");

        Set<String> uniqueFeedback = new HashSet<>(feedbackEntries);
        Queue<String> processingQueue = new ArrayDeque<>(uniqueFeedback);
        Deque<String> recentStack = new ArrayDeque<>();

        while (!processingQueue.isEmpty()) {
            String feedback = processingQueue.poll();
            recentStack.push(feedback);
        }

        List<String> lastFew = new ArrayList<>();
        for (int i = 0; i < 2 && !recentStack.isEmpty(); i++) {
            lastFew.add(recentStack.pop());
        }

        lastFew.size();
    }
}
