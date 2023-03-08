package homeworks;
import java.util.Scanner;
public class Homework8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the required size of the array: ");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        double sum = 0;
        System.out.println("Enter the grades of the array one by one");

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Please enter grade No. " + (i+1));
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i< arrayLength; i++) {
            sum += numbers[i];
        }
        System.out.println("Average grade: " + sum/arrayLength);
        System.out.println();

        if(arrayLength==1){
            System.out.println("Altogether " + arrayLength + " value was passed");
        } else {
            System.out.println("Altogether " + arrayLength + " values were passed");
        }
    }
}
