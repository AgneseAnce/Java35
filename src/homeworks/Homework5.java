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
        System.out.println("- How much jam do you need?");
        int target = scanner.nextInt();
        System.out.println("- Please bring " + target + " kilos of Alex's jam.");
        int numSmall = 0;
        int numBig = 0;         //int smallJars = 1;
        int bigJars = 7;
        int jarCount = numBig + numSmall;

        if(target >42 || jarCount>7){
            System.out.println("- Sorry, I cannot bring so many jars. I have only two hands.");
        }
        if (target<=6 || target%bigJars == 0){
            System.out.println("- OK, will do!");
        } else if(target%bigJars !=0) {
            numBig = target/bigJars;
            numSmall = target%bigJars + numBig;
            if((numSmall)<7){
                System.out.println("- OK, will do!");
            } else {
                System.out.println("- Sorry, I cannot bring so many jars. I have only two hands.");

            }
        }
        //numOfJars = (target/7)+(target%7);

        /* int target = scanner.nextInt();

        int amountOf7KgJars = target/7;
        System.out.println("amountOf7KgJars = " + amountOf7KgJars);

        int amountOf1KgJars = target % 7;
        System.out.println("amountOf1KgJars = " + amountOf1KgJars)

        System.out.println(amountOf7KgJars + amountOf1kgJars <=6);
         */
    }
}


