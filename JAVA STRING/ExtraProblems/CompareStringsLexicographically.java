/*
Write a Java program to compare two strings lexicographically (dictionary order) without using built-in compare methods.
*/
import java.util.Scanner;
public class CompareStringsLexicographically {
    public static int compareLex(String s1, String s2) {
        int len = Math.min(s1.length(), s2.length());
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        int cmp = compareLex(s1, s2);
        if (cmp < 0) System.out.println('"' + s1 + '"' + " comes before " + '"' + s2 + '"');
        else if (cmp > 0) System.out.println('"' + s1 + '"' + " comes after " + '"' + s2 + '"');
        else System.out.println("Both strings are equal");
        sc.close();
    }
}
