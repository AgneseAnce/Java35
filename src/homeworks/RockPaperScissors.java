package homeworks;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player One, enter your move: ");
        String player1 = scanner.nextLine().trim().toLowerCase();
        System.out.println("Player Two, enter your move: ");
        String player2 = scanner.nextLine().trim().toLowerCase();

    }

    /* Method rockPaperScissors takes an input from both players (RSP) and returns "P1/P2 wins" or "Tie"
     Use scanner as input. Input shall be of string type, non-case sensitive. Method only returns a String w/o sout
     Optional: use a separate method for String validation
     Optional, perhaps in a separate file: BBTh - rock paper scissors lizard spock
     where each option can beat and be beaten by two others
     */

    public static String rockPaperScissors(String player1, String player2){
        if(player1 == player2) {
            System.out.println("It's a TIE!");
        }

        String text = "Bike";

        System.out.println(text.equals("rock") || text.equals("paper") || text.equals("scissors"));
        System.out.println(text.matches("rock|paper|scissors"));
        return text;

    }


}
