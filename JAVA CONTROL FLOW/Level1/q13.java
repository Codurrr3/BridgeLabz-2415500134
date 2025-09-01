import java.util.Scanner;

public class q13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int sumFormula = n * (n + 1) / 2;

            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

            System.out.println("Sum using formula = " + sumFormula);
            System.out.println("Sum using for loop = " + sumLoop);

            if (sumFormula == sumLoop) {
                System.out.println("Both are equal");
            } else {
                System.out.println("Mismatch");
            }
        } else {
            System.out.println("Not a natural number");
        }
    }
}
