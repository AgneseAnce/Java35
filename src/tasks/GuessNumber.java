package tasks;

import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter max random number");
        int max = scanner.nextInt();
        int tries = 0;

        //Generate random number between 0 and max number. +1 is needed to include max in the range (=> rather than >)
        int rand = (int) (Math.random() * (max+1));

        //System.out.println("Generate random number = " + rand + ". ");

        System.out.println("Random number between 0 and " + max + " was generated.");

        //Variable guess is declared before the DO WHILE loop to make it global rather than local

        int guess;
        do{
            System.out.println("Guess the randomly generated number");
            guess = scanner.nextInt();
            if(guess<rand){
                System.out.println("Choose a bigger number");
            } else if(guess>rand) {
                System.out.println("Choose a smaller number");
            }
            tries++;
        } while (guess!=rand);

        System.out.println("Congratulations, you won! It took " + tries + " tries.");

    }
}
