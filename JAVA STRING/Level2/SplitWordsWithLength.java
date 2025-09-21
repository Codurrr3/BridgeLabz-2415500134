/*
Write a program to split the text into words and return the words along with their lengths in a 2D array
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display
*/
import java.util.Scanner;
public class SplitWordsWithLength {
    public static int getStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {}
        return count;
    }
    public static String[] splitWordsManual(String text) {
        int len = getStringLength(text);
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }
        int[] spaceIndexes = new int[wordCount + 1];
        int idx = 0;
        spaceIndexes[idx++] = -1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaceIndexes[idx++] = i;
        }
        spaceIndexes[idx] = len;
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            int start = spaceIndexes[i] + 1;
            int end = spaceIndexes[i + 1];
            StringBuilder sb = new StringBuilder();
            for (int j = start; j < end; j++) sb.append(text.charAt(j));
            words[i] = sb.toString();
        }
        return words;
    }
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] words = splitWordsManual(text);
        String[][] table = wordsWithLength(words);
        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }
        sc.close();
    }
}
