package homeworks;
import java.util.Scanner;
public class Homework1 {
    public static void main(String[] args) {
                /* Using scanner ask the user toi enter their name and the year of birth
        Input:
            John, 2000
        Print out:
            "Your name is John and you are 22 years old"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Please enter your name");
        String name = scanner.nextLine();

        System.out.println("Please enter your year of birth");
        int year = scanner.nextInt();

        int res = 2023-year;

        System.out.println("Hi, " + name + ", you are " + res + " years old");
    }
}
