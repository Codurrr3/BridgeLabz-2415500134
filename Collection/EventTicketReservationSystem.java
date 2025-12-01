import java.util.*;

public class EventTicketReservationSystem {
    private static class Booking implements Comparable<Booking> {
        private final String userId;
        private final boolean vip;

        Booking(String userId, boolean vip) {
            this.userId = userId;
            this.vip = vip;
        }

        @Override
        public int compareTo(Booking other) {
            if (this.vip == other.vip) {
                return userId.compareTo(other.userId);
            }
            return Boolean.compare(other.vip, this.vip);
        }
    }

    public static void main(String[] args) {
        Set<String> registeredUsers = new HashSet<>();
        registeredUsers.add("USR-1");
        registeredUsers.add("USR-1");
        registeredUsers.add("USR-2");
        registeredUsers.contains("USR-2");

        Queue<Booking> bookingQueue = new ArrayDeque<>();
        bookingQueue.offer(new Booking("USR-1", false));
        bookingQueue.offer(new Booking("USR-2", true));

        PriorityQueue<Booking> vipPriority = new PriorityQueue<>();
        vipPriority.addAll(bookingQueue);
        List<Booking> confirmed = new ArrayList<>();

        while (!vipPriority.isEmpty()) {
            confirmed.add(vipPriority.poll());
        }

        confirmed.size();
    }
}
