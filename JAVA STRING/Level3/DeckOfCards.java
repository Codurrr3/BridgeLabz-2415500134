/*
Write a program to create a deck of cards, initialize the deck, shuffle the deck, and distribute the deck of n cards to x number of players. Finally, print the cards the players have.
Hint => 
Create a deck of cards with suits "Hearts", "Diamonds", "Clubs", "Spades" and ranks from "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", and "Ace"
Calculate the number of cards in the deck and initialize the deck
int numOfCards = suits.length * ranks.length;
Write a Method to Initialize the deck of cards with suits and ranks and return the deck. The deck is an array of strings where each string represents a card in the deck represented as "rank of suit" e.g., "2 of Hearts"
Write a Method to Shuffle the deck of cards and return the shuffled deck. To shuffle the card iterate over the deck and swap each card with a random card from the remaining deck to shuffle the deck. Please find the steps below
Step1: Use for Loop Iterate over the deck and swap each card with a random card from the remaining deck
Step 2: Inside the Loop Generate a random card number between i and n using the following code 
int randomCardNumber = i + (int) (Math.random() * (n - i));
Step 3: Swap the current card with the random card
Write a Method to distribute the deck of n cards to x number of players and return the players. For this Check the n cards can be distributed to x players. If possible then Create a 2D array to store the players and their cards
Write a Method to Print the players and their cards
*/
import java.util.Scanner;
public class DeckOfCards {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int idx = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[idx++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }
    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n % x != 0) return null;
        int cardsPerPlayer = n / x;
        String[][] players = new String[x][cardsPerPlayer];
        int idx = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[idx++];
            }
        }
        return players;
    }
    public static void printPlayers(String[][] players) {
        if (players == null) {
            System.out.println("Cannot distribute cards evenly among players.");
            return;
        }
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i+1) + ": ");
            for (int j = 0; j < players[i].length; j++) {
                System.out.print(players[i][j] + (j < players[i].length-1 ? ", " : ""));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();
        System.out.print("Enter number of players: ");
        int x = sc.nextInt();
        if (n > deck.length) {
            System.out.println("Not enough cards in the deck.");
            sc.close();
            return;
        }
        String[][] players = distributeCards(deck, n, x);
        printPlayers(players);
        sc.close();
    }
}
