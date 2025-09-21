/*
Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. Here the game is played between a user and a computer. Based on the rules, either a player or a computer will win. Show the stats of player and computer win in a tabular format across multiple games. Also, show the winning percentage between the player and the computer.
Hint => 
The rule is: rock-scissors: rock will win (rock crushes scissors); rock-paper: paper wins (paper covers rock); scissors-paper: scissors win (scissors cuts paper)
Create a Method to find the Computer Choice using the Math.random
Create a Method to find the winner between the user and the computer
Create a Method to find the average and percentage of wins for the user and the computer and return a String 2D array
Create a Method to display the results of every game and also display the average and percentage wins 
In the main take user input for the number of games and call methods to display results
*/
import java.util.Scanner;
public class RockPaperScissorsStats {
    public static String getComputerChoice() {
        int n = (int)(Math.random() * 3);
        if (n == 0) return "rock";
        else if (n == 1) return "paper";
        else return "scissors";
    }
    public static int getWinner(String user, String comp) {
        if (user.equals(comp)) return 0; // tie
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) return 1; // user wins
        return -1; // computer wins
    }
    public static String[][] getStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (userWins * 100.0 / games));
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", (compWins * 100.0 / games));
        return stats;
    }
    public static void displayResults(int[] results, String[][] stats, int games) {
        System.out.println("Game\tResult");
        for (int i = 0; i < games; i++) {
            String res = results[i] == 1 ? "User" : results[i] == -1 ? "Computer" : "Tie";
            System.out.println((i+1) + "\t" + res);
        }
        System.out.println("\nPlayer\tWins\tWin %");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        int userWins = 0, compWins = 0;
        int[] results = new int[games];
        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            int winner = getWinner(user, comp);
            results[i] = winner;
            if (winner == 1) userWins++;
            else if (winner == -1) compWins++;
        }
        String[][] stats = getStats(userWins, compWins, games);
        displayResults(results, stats, games);
        sc.close();
    }
}
