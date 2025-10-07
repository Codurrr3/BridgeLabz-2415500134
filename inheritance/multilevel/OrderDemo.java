public class OrderDemo {
    public static void main(String[] args) {
        Order o1 = new Order("ORD1001", "2025-09-23");
        ShippedOrder s1 = new ShippedOrder("ORD1002", "2025-09-24", "TRK123");
        DeliveredOrder d1 = new DeliveredOrder("ORD1003", "2025-09-25", "TRK456", "2025-09-27");

        System.out.println(o1.getOrderStatus());
        System.out.println(s1.getOrderStatus());
        System.out.println(d1.getOrderStatus());
    }
}