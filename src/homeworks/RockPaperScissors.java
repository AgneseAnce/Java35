package homeworks;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player One, choose ROCK, PAPER, or SCISSORS!");
        String player1 = scanner.nextLine().trim().toLowerCase();
        System.out.println("Player Two, ROCK, PAPER, or SCISSORS!");
        String player2 = scanner.nextLine().trim().toLowerCase();
        System.out.println(result(player1, player2));
    }

    public static boolean validateInput1(String player1) {
        return player1.matches("rock|paper|scissors");
    }

    public static boolean validateInput2(String player2) {
        return player2.matches("rock|paper|scissors");
    }

    public static String result(String player1, String player2) {
        Scanner scanner = new Scanner(System.in);

        String result = "";

        if (!validateInput1(player1)) {
            result = "Player One, this is not a valid input.";

        } else if (!validateInput2(player2)) {
            result = "Player Two, this is not a valid input.";

        } else {
            System.out.println("Player One chose " + player1 + ". Player Two chose " + player2 + ".");
            if (player1.equals("rock") && player2.equals("scissors")
                    || player1.equals("scissors") && player2.equals("paper")
                    || player1.equals("paper") && player2.equals("rock")) {
                result = "Player One wins with " + player1 + ".";
            } else if (player1.equals("rock") && player2.equals("paper")
                    || player1.equals("scissors") && player2.equals("rock")
                    || player1.equals("paper") && player2.equals("scissors")) {
                result = "Player Two wins with " + player2 + ".";
            } else if(player1.equals(player2)) {
                result = "It's a tie.";
            }
        }

        return result;
    }
}