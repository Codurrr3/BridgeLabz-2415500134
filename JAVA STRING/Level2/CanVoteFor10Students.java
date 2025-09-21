/*
Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Create a method to define the random 2-digit age of several students provided as method parameters and return a 1D array of ages of n students
Create a method that takes an array of age as a parameter and returns a 2D String array of age and a boolean true or false to indicate can and cannot vote. Inside the method firstly validate the age for a negative number, if a negative cannot vote. For valid age check for age is 18 or above to set true to indicate can vote.
Create a method to display the 2D array in a tabular format.
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/
import java.util.Scanner;
public class CanVoteFor10Students {
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + (int)(Math.random() * 90); // random 2-digit age
        }
        return ages;
    }
    public static String[][] canVoteTable(int[] ages) {
        String[][] table = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            table[i][0] = String.valueOf(ages[i]);
            table[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return table;
    }
    public static void displayTable(String[][] table) {
        System.out.println("Age\tCan Vote");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }
    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] table = canVoteTable(ages);
        displayTable(table);
    }
}
