package homeworks;
import java.util.Arrays;
import java.util.Scanner;
public class Homework10 {
    public static void main(String[] args) {
        // Reverse an array of integers

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,14,15,16,17, 18, 19, 20};
        System.out.println("Original array: " + Arrays.toString(myArray));

//        System.out.print("Reversed array: [");
//        for (int i = myArray.length-1; i < myArray.length && i >= 0; i--) {
//            System.out.print(myArray[i]);
//            if (i > 0) {
//                System.out.print(", ");
//            } else {
//                System.out.print("]");
//            }
        // Method for swaping places of array items. Divided by 2 to swap elements just once (by 180 degr)
        for(int i = 0; i < myArray.length/2; i++){
                 int temp = myArray[i];
                 myArray[i] = myArray[myArray.length-i-1];
                 myArray[myArray.length-i-1] = temp;
             }
            System.out.println("Reversed array: " + Arrays.toString(myArray));

        // Solution 3. Temp2 - temporary variable for storing array elements before swapping their places
        for(int j = 0; j < myArray.length / 2; j++){
            int temp2 = myArray[j];
            myArray[j] = myArray[myArray.length-1-j];
            myArray[myArray.length-1-j] = temp2;
        }


        System.out.println("Reversed array 2: " + Arrays.toString(myArray));
        // Solution 4

        int right = myArray.length-1;

        for (int left = 0; left < right; left++, right--){
            int reverse1 = myArray[left];
            myArray[left] = myArray[right];
            myArray[right] = reverse1;
        }
        System.out.println("Reversed array 4: " + Arrays.toString(myArray));

            }
    }
