import java.util.*;

public class CourierDeliveryRoutingSystem {
    private static class Parcel implements Comparable<Parcel> {
        private final String id;
        private final int priority;

        Parcel(String id, int priority) {
            this.id = id;
            this.priority = priority;
        }

        @Override
        public int compareTo(Parcel other) {
            return Integer.compare(other.priority, this.priority);
        }

        @Override
        public String toString() {
            return id + "(" + priority + ")";
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Parcel> expressQueue = new PriorityQueue<>();
        Queue<Parcel> normalQueue = new ArrayDeque<>();
        Set<String> assignedIds = new HashSet<>();
        List<Parcel> completed = new ArrayList<>();

        Parcel parcelA = new Parcel("PX-1", 3);
        Parcel parcelB = new Parcel("PX-2", 1);
        expressQueue.offer(parcelA);
        normalQueue.offer(parcelB);

        while (!expressQueue.isEmpty()) {
            Parcel parcel = expressQueue.poll();
            if (assignedIds.add(parcel.id)) {
                completed.add(parcel);
            }
        }

        while (!normalQueue.isEmpty()) {
            Parcel parcel = normalQueue.poll();
            if (assignedIds.add(parcel.id)) {
                completed.add(parcel);
            }
        }

        completed.forEach(Parcel::toString);
    }
}
