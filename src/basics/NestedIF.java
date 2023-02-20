package basics;
import java.util.Scanner;
public class NestedIF {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your score between 1 and 100");
        float score = scanner.nextFloat();

        if(score <= 40.0f) {
            System.out.println("Score is 40% or less");
        } else if(score <= 80.0f) {
            System.out.println("Score is 80% or less");
            if(score <=60.0f) {
                System.out.println("Score is 60% or less");
            } else {
                System.out.println("Score is above 60%");
            }
        } else {
            System.out.println("Score is 100% or less");
        }


    }
}

