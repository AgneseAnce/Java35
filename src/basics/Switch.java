package basics;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you grade");

        int grade = scanner.nextInt();

        switch(grade) {
            case 1:
                System.out.println("Very poor");
                break;
            case 2:
                System.out.println("Poor");
                break;
            case 3:
                System.out.println("Bad");
                break;
            case 4:
                System.out.println("Not good at all");
                break;
                default:
                    System.out.println("Value not found");
                    break;


        }
        }
    }

