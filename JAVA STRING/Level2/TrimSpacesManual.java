/*
Write a program to trim the leading and trailing spaces from a string using the charAt() method 
Hint => 
Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result
*/
import java.util.Scanner;
public class TrimSpacesManual {
    public static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;
        while (start < text.length() && text.charAt(start) == ' ') start++;
        while (end >= 0 && text.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }
    public static String substringCharAt(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < text.length(); i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }
    public static boolean compareStringsCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();
        int[] idx = findTrimIndexes(text);
        String trimmedManual = substringCharAt(text, idx[0], idx[1]);
        String trimmedBuiltIn = text.trim();
        boolean isEqual = compareStringsCharAt(trimmedManual, trimmedBuiltIn);
        System.out.println("Manual trim: '" + trimmedManual + "'");
        System.out.println("Built-in trim: '" + trimmedBuiltIn + "'");
        System.out.println("Are both trims equal? " + isEqual);
        sc.close();
    }
}
