/*
Write a Java program that takes a sentence as input and returns the longest word in the sentence.
*/
import java.util.Scanner;
public class FindLongestWord {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        return longest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String longest = findLongestWord(sentence);
        System.out.println("Longest word: " + longest);
        sc.close();
    }
}
