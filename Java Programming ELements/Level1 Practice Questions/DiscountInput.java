import java.util.Scanner;
public class DiscountInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fee: ");
        double fee = sc.nextDouble();
        System.out.print("Enter Discount Percent: ");
        double discountPercent = sc.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
    }
}

