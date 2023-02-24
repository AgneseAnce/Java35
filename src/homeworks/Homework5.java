package homeworks;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        /*Alex is an owner of a grocery store. Among many products he sells,
        he's mostly famous for his hand-made jam that is being sold
        in jars of 1 kg or 7 kg. Alex sells only full jars
        (i.e. it is only possible to buy the whole jar of 1 kg, or 7 kg).

        Will is asked by his wife Jane to buy some amount of Alex's jam.
        Will forgot to take his bag, thus he can take home no more than six jars of jam
        (three jars in each of his hands). Jane is very serious about the
        shopping list - if she asked for specific amount of jam, she expects exactly this
        amount, no more, no less.

        Write an application that will check if Will is able to take home the
        amount of jam specified by Jane. The amount of jam should be read from user
        (positive int value). You can assume that there is always enough jam in Alex's shop.
        Your application should print true or false.
        Max. amount is 6*7 =  42 kg*/

        Scanner scanner = new Scanner(System.in);

        int smallJars = 1;
        int largeJars = 7;

        System.out.println("Please enter the amount of jam needed");
        int kilos = scanner.nextInt();
        System.out.println("Please buy " + kilos + " kg of Alex's jam");

        int numberSmall = (int) Math.random() * 7 + 1;
        int numberLarge = (int) Math.random() * 7 + 1;

        do {

            if (kilos % (smallJars * numberSmall + largeJars * numberLarge) != 0) {
            } else {
                System.out.println("It is not possible. I have only to hands.");
            }
        } while(kilos % (smallJars * numberSmall + largeJars * numberLarge) == 0);

        System.out.println("Ok, will do");
    }
}
