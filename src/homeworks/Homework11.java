package homeworks;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Homework11 {
    public static void main(String[] args) {
        /* Accepted personal code number input: exactly 6 any numbers followed by - and 5 numbers */

        Scanner scanner = new Scanner(System.in);
        char again = 'y';

        do {
            System.out.println("Enter your personal number");
              String codeInput = scanner.nextLine();

            if (Pattern.matches("[0-9]{6}-[0-9]{5}", codeInput)) {
                System.out.println("Your inputted personal number is valid");
            } else {
                System.out.println("Your inputted personal number is not valid");
            }
            System.out.println("Do you want to check the personal number again? If so, press y.");
            again = scanner.next().charAt(0);
            scanner.nextLine();
        } while(again=='y');
//        {
//            System.out.println("This is a while LOOOOOOP");
//
//            System.out.println("Do you want to check the personal code again?");
//            again = scanner.next().charAt(0);
//            // Fixing a JAVA bug
//            scanner.nextLine();
//        }
    }
}
