package basics;

import java.util.Scanner;
public class IFStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a grade");
        int grade = scanner.nextInt();

        //IF
        //Print out "Good job" if grade is ober 6

        if (grade > 6) {
            System.out.println("Good job!");
        }

        // Print out "You can do better" if grade is less or equal to 4

        if (grade <= 4) {
            System.out.println("You can do better!");
        }

        // IF ELSE
        // Print "You have passed the test" if the grade is equal or greater than 4
        // But if not, print "You have failed the test"

        if (grade >= 4) {
            System.out.println("You have passed the test!");
        } else {
            System.out.println("You have failed the test!");
        }

        // Same logic, different approach
        if (grade < 4) {
            System.out.println("You have failed the test!");
        } else {
            System.out.println("You have passed the test!");
        }

    /*Print comments about grades:
    1-3 --> Very bad
    4-5 --> Okey
    6 --> Nice
    7-10 --> Very Good
    If not in the range from 1 to 10 --> Invalid input
     */
        if(grade>0 && grade <=3){
            System.out.println("Very bad");
        } else if (grade == 4 || grade == 5){
            System.out.println("Okey");
        } else if(grade == 6){
            System.out.println("Nice");
            //(grade >=7 && grade <=10)
        } else if(grade >6 && grade <11){
            System.out.println("Very good");
        } else {
            System.out.println("Invalid input");
        }
        int someVariable = 5;
        System.out.println(--someVariable);		// a value of 4 will be printed




    }
}



