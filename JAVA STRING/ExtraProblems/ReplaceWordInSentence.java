/*
Write a replace method in Java that replaces a given word with another word in a sentence.
*/
import java.util.Scanner;
public class ReplaceWordInSentence {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < sentence.length()) {
            int j = i;
            while (j < sentence.length() && sentence.charAt(j) != ' ') j++;
            String word = sentence.substring(i, j);
            if (word.equals(oldWord)) sb.append(newWord);
            else sb.append(word);
            if (j < sentence.length()) sb.append(' ');
            i = j + 1;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();
        System.out.print("Enter new word: ");
        String newWord = sc.next();
        String result = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified sentence: " + result);
        sc.close();
    }
}
