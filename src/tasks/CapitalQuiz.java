package tasks;
import java.util.Scanner;

public class CapitalQuiz {
    public static void main(String[] args) {
        /* Create a Java program for testing knowledge.
         1. Create a two-dimensional String type ([4] by [4]) array
         named quizArray and provide each row with a question and three answers. */

        Scanner scanner = new Scanner(System.in);
        String [][] quizArray = new String [4][4];
        // One-dimensional array holding correct answers.
        // Inserted at the top according to good programming practice of defining variables at the beginning
        int[] answer = {3,1,2,2};
        int score = 0;

        quizArray[0][0] = "Capital city of Australia?";
        quizArray[0][1] = "Sydney";
        quizArray[0][2] = "Melbourne";
        quizArray[0][3] = "Canberra";

        quizArray[1][0] = "Capital city of USA?";
        quizArray[1][1] = "Washington";
        quizArray[1][2] = "New York";
        quizArray[1][3] = "Dallas";

        quizArray[2][0] = "Capital city of Brazil?";
        quizArray[2][1] = "Rio de Janeiro";
        quizArray[2][2] = "Brasilia";
        quizArray[2][3] = "San paulo";

        quizArray[3][0] = "Capital city of  Canada?";
        quizArray[3][1] = "Montreal";
        quizArray[3][2] = "Ottawa";
        quizArray[3][3] = "Calgary";

        // Using nested FOR loops print out all the Questions followed by all 3 possible answers.
        // i = row; j = column

        /*for (int i = 0; i <quizArray.length; i++){
            for (int j = 0; j < quizArray[i].length; j++) {
                if (j != 0) {
                    System.out.println("\t" + j + ") " + quizArray[i][j]);
                } else if (j == 0) {
                    System.out.println(quizArray[i][j]);
                }
            }
        }*/

        for(int i = 0; i <quizArray.length; i++){

            // Print out question. Second row is hard-coded [0] because it stands for the question
            System.out.println(quizArray[i][0]);

            for(int j = 1; j < quizArray.length; j++){
                // Print out answers
                System.out.println("\t" + j + ") " + quizArray[i][j]);
            }
            // Take answer input from the user
            System.out.println("Answer (1-3): ");
            int answerInput = scanner.nextInt();

            // Check if the input is the correct answer (whether the input [i] row is equal to answer)
           if(answerInput == answer[i]){
                System.out.println("Correct!");
                score++;

            } else {
               System.out.println("False.");
           }
            System.out.println("-------------------------");
        }
        System.out.println("Your score is " + score);

    }
}
