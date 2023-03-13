package homeworks;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Homework11 {
    public static void main(String[] args) {
        /* Accepted personal code number input: exactly 6 any numbers followed by - and 5 numbers
        * Use while loop. Do WHILE loop is acceptable also if again is not initialized. */

        Scanner scanner = new Scanner(System.in);
        char again = 'y';

        while (again == 'y') {
            System.out.println("Enter your personal number");
              String codeInput = scanner.nextLine().trim();         // trim() to ignore spaces
            if (Pattern.matches("[0-9]{6}-[0-9]{5}", codeInput)) {
                System.out.println("Your inputted personal number is valid");
            } else {
                System.out.println("Your inputted personal number is not valid");
            }
            System.out.println("Do you want to check the personal number again? If so, press y.");
            again = scanner.next().charAt(0);
            scanner.nextLine();                 // Fixing a bug
        }

    }
}
