/*
Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Write a Method to find the youngest of the 3 friends
Write a Method to find the tallest of the 3 friends
*/
import java.util.Scanner;
public class YoungestTallestFriendMethods {
    public static int findYoungest(int[] ages) {
        int idx = 0;
        for (int i = 1; i < ages.length; i++) if (ages[i] < ages[idx]) idx = i;
        return idx;
    }
    public static int findTallest(double[] heights) {
        int idx = 0;
        for (int i = 1; i < heights.length; i++) if (heights[i] > heights[idx]) idx = i;
        return idx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }
        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);
        System.out.println("Youngest: " + names[youngest]);
        System.out.println("Tallest: " + names[tallest]);
        sc.close();
    }
}
