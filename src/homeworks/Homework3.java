package homeworks;
import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {
        /*      Write an application, that will read one number from user (of type int)
        and check, if given number is "near" 100. A number is "near" 100 when
        difference between it and 100 is no bigger than 10.

        Your application should read one number (int) and print false or true on the screen,
        according to instructions above.*/

    Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();

        System.out.println("Is number near 100?");

        if(number <90) {
            System.out.println(false);
        } else if(number >110) {
            System.out.println(false);
        } else {
                System.out.println(true);
        }
    /*
      Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        int hundred = 100;

        if(number <= hundred +10 && number >= hundred -10) {
         System.out.println(true);
         } else {
         System.out.println(false);
         }

      Option 3:

      Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Is the number near 100?");

        boolean value 1 = number >= 90;
        boolean value2 = number <=110;
        boolean value3 = number == 100;     --to exclude 100

        System.out.println( (value1 && value2) && !value3 );

     Option 4:

     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter a number");

        int input = scanner.nextInt();
        System.out.println(Math.abs(100 - input) <=10);


     */
    }
}
