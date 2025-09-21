/*
Write a Java program to find the most frequent character in a string.
*/
import java.util.Scanner;
public class MostFrequentCharacter {
    public static char mostFrequentChar(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        int max = 0;
        char result = '\0';
        for (int i = 0; i < 256; i++) {
            if (freq[i] > max) {
                max = freq[i];
                result = (char)i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        char result = mostFrequentChar(text);
        System.out.println("Most Frequent Character: '" + result + "'");
        sc.close();
    }
}
