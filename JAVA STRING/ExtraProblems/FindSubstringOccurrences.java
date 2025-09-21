/*
Write a Java program to count how many times a given substring occurs in a string.
*/
import java.util.Scanner;
public class FindSubstringOccurrences {
    public static int countOccurrences(String text, String sub) {
        int count = 0;
        int idx = 0;
        while ((idx = text.indexOf(sub, idx)) != -1) {
            count++;
            idx += sub.length();
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String text = sc.nextLine();
        System.out.print("Enter the substring: ");
        String sub = sc.nextLine();
        int result = countOccurrences(text, sub);
        System.out.println("Occurrences: " + result);
        sc.close();
    }
}
