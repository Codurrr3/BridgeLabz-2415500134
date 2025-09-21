package onlineFoodDeliverySystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Tikka", 250, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));

        for (FoodItem item : order) {
            double total = item.calculateTotalPrice();
            double discounted = (item instanceof Discountable) ? ((Discountable) item).applyDiscount(total) : total;
            System.out.println(item.getItemDetails());
            System.out.printf("Total: %.2f, After Discount: %.2f%n", total, discounted);
            if (item instanceof Discountable) System.out.println(((Discountable) item).getDiscountDetails());
            System.out.println("---");
        }
    }
}
