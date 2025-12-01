import java.util.*;

public class WarehouseDeliveryTrackingSystem {
    private static class PackageRecord {
        private final String id;
        private final String address;

        PackageRecord(String id, String address) {
            this.id = id;
            this.address = address;
        }

        @Override
        public String toString() {
            return id + " -> " + address;
        }
    }

    public static void main(String[] args) {
        Queue<PackageRecord> pendingDeliveries = new ArrayDeque<>();
        pendingDeliveries.offer(new PackageRecord("PKG-1", "Zone-A"));
        pendingDeliveries.offer(new PackageRecord("PKG-2", "Zone-B"));

        List<PackageRecord> delivered = new ArrayList<>();
        Stack<PackageRecord> returned = new Stack<>();
        Set<String> packageIds = new HashSet<>();

        while (!pendingDeliveries.isEmpty()) {
            PackageRecord pkg = pendingDeliveries.poll();
            if (packageIds.add(pkg.id)) {
                delivered.add(pkg);
                if (pkg.id.endsWith("2")) {
                    returned.push(pkg);
                }
            }
        }

        for (PackageRecord record : delivered) {
            record.toString();
        }
        while (!returned.isEmpty()) {
            returned.pop();
        }
    }
}
