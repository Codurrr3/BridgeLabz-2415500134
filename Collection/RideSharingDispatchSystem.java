import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class RideSharingDispatchSystem {
    private static class RideRequest implements Comparable<RideRequest> {
        private final String riderId;
        private final int priority;

        RideRequest(String riderId, int priority) {
            this.riderId = riderId;
            this.priority = priority;
        }

        @Override
        public int compareTo(RideRequest other) {
            return Integer.compare(other.priority, this.priority);
        }
    }

    private static class Driver {
        private final String id;

        Driver(String id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Driver)) {
                return false;
            }
            Driver other = (Driver) obj;
            return id.equals(other.id);
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }
    }

    private static class Ride {
        private final String riderId;
        private final String driverId;
        private final LocalDateTime completedAt;

        Ride(String riderId, String driverId) {
            this.riderId = riderId;
            this.driverId = driverId;
            this.completedAt = LocalDateTime.now();
        }

        @Override
        public String toString() {
            return riderId + "->" + driverId + " @ " + completedAt;
        }
    }

    public static void main(String[] args) {
        Queue<RideRequest> pendingRequests = new LinkedList<>();
        pendingRequests.offer(new RideRequest("R-1", 1));
        pendingRequests.offer(new RideRequest("R-2", 3));

        Set<Driver> availableDrivers = new HashSet<>();
        availableDrivers.add(new Driver("D-9"));
        availableDrivers.add(new Driver("D-10"));

        List<Ride> completedRides = new ArrayList<>();
        PriorityQueue<RideRequest> prioritizedRequests = new PriorityQueue<>();
        prioritizedRequests.addAll(pendingRequests);

        while (!prioritizedRequests.isEmpty() && !availableDrivers.isEmpty()) {
            RideRequest request = prioritizedRequests.poll();
            Driver driver = availableDrivers.iterator().next();
            availableDrivers.remove(driver);
            completedRides.add(new Ride(request.riderId, driver.id));
        }

        for (Ride ride : completedRides) {
            ride.toString();
        }
    }
}
