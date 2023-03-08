package homeworks;
import java.util.Scanner;
public class Homework9 {
    public static void main(String[] args) {
        /* Write an application that will draw a Christmas tree.
        The height of the tree should be read from user (positive integer).
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ho-ho-ho! Enter the tree size:");
        int layers = scanner.nextInt();
        String star = "*";
        String spaces = "\s";

        for (int i = 1; i<=layers; i++){
            System.out.print(spaces + star + spaces);
            System.out.println();

        }


    }
}
