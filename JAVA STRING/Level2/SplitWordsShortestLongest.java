/*
Write a program to split the text into words and find the shortest and longest strings in a given text
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
The main function calls the user-defined methods and displays the result. 
*/
import java.util.Scanner;
public class SplitWordsShortestLongest {
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
    public static int[] findShortestLongest(String[][] table) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minIdx = -1, maxIdx = -1;
        for (int i = 0; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < min) { min = len; minIdx = i; }
            if (len > max) { max = len; maxIdx = i; }
        }
        return new int[]{minIdx, maxIdx};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] words = splitWordsManual(text);
        String[][] table = wordsWithLength(words);
        int[] idxs = findShortestLongest(table);
        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }
        System.out.println("Shortest word: " + table[idxs[0]][0]);
        System.out.println("Longest word: " + table[idxs[1]][0]);
        sc.close();
    }
}
