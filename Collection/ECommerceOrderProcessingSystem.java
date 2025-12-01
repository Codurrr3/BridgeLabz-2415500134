import java.util.*;
public class ECommerceOrderProcessingSystem {
    private static class Order {
        private final String id;
        private final String description;

        Order(String id, String description) {
            this.id = id;
            this.description = description;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Order)) {
                return false;
            }
            Order other = (Order) obj;
            return id.equals(other.id);
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }

        @Override
        public String toString() {
            return id + " - " + description;
        }
    }

    public static void main(String[] args) {
        List<Order> placedOrders = new ArrayList<>();
        placedOrders.add(new Order("O-101", "Phone"));
        placedOrders.add(new Order("O-102", "Laptop"));
        placedOrders.add(new Order("O-101", "Phone Duplicate"));
        placedOrders.add(new Order("O-103", "Headphones"));

        Set<Order> uniqueOrders = new HashSet<>(placedOrders);
        Queue<Order> processingQueue = new LinkedList<>(uniqueOrders);
        Stack<Order> failedOrders = new Stack<>();

        while (!processingQueue.isEmpty()) {
            Order current = processingQueue.poll();
            if (current.id.endsWith("3")) {
                failedOrders.push(current);
            }
        }

        ArrayDeque<Order> retryQueue = new ArrayDeque<>();
        while (!failedOrders.isEmpty()) {
            retryQueue.offer(failedOrders.pop());
        }
    }
}
