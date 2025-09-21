/*
Write a program to find the 3 points that are collinear using the slope formulae and area of triangle formulae. check  A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling. 
Hint => 
Take inputs for 3 points x1, y1, x2, y2, and x3, y3
Write a Method to find the 3 points that are collinear using the slope formula. The 3 points A(x1,y1), b(x2,y2), and c(x3,y3) are collinear if the slopes formed by 3 points ab, bc, and cd are equal. 
slope AB = (y2 - y1)/(x2 - x1), slope BC = (y3 - y2)/(x3 - x3)
slope AC = (y3 - y1)/(x3 - x1) Points are collinear if
slope AB = slope BC = slope Ac
The method to find the three points is collinear using the area of the triangle formula. The Three points are collinear if the area of the triangle formed by three points is 0. The area of a triangle is 
area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))
*/
import java.util.Scanner;
public class CollinearPointsChecker {
    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double ab = (double)(y2 - y1) / (x2 - x1);
        double bc = (double)(y3 - y2) / (x3 - x2);
        double ac = (double)(y3 - y1) / (x3 - x1);
        return ab == bc && bc == ac;
    }
    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt(), y3 = sc.nextInt();
        System.out.println("Collinear by slope: " + areCollinearSlope(x1, y1, x2, y2, x3, y3));
        System.out.println("Collinear by area: " + areCollinearArea(x1, y1, x2, y2, x3, y3));
        sc.close();
    }
}
