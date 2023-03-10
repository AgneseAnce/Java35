package homeworks;
import java.util.Arrays;
import java.util.Scanner;
public class Homework10 {
    public static void main(String[] args) {
        // Reverse an array of integers

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,14,15,16,17};
        System.out.println("Original array: " + Arrays.toString(myArray));

        System.out.print("Reversed array: [");
        for (int i = myArray.length-1; i < myArray.length && i >= 0; i--) {
            System.out.print(myArray[i]);
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.print("]");
            }
        }
    }
}