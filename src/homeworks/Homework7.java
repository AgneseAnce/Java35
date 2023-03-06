package homeworks;

import java.util.Scanner;
public class Homework7 {
    public static void main(String[] args) {
    /* Create a JAVA program that allows you to enter a size of an array (type int).
    Then ask the  user to enter each element one by one.
    --> Ask the user to enter a positive number that will be the arrays size
    --> Create an empty array that will contain int data type values in size of entered value
    --> Using for loop ask user to enter array elements one by one
    --> Print out all array elements */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of elements");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        int ordinalNo = 1;
        int sum = 0;

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter the element No. " + ordinalNo++);
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Source Array: ");
            for (int i = 0; i< arrayLength; i++) {
            System.out.print(numbers[i]+ " ");
            sum += numbers[i];
        }
        System.out.println();
        System.out.println("Sum of all elements: " + sum);


        /* Solution 2 System.out.println("Element number" + (i+1));

        Solution 3:

        int sum = 0;
        System.out.println("Enter array size:");
        int arraySize = scanner.nextInt();

        //Declare empty array in given size
        int storageArray[] = new int[arraySize];

        System.out.println("Enter array elements:");

        for(int i = 0; i < storageArray.length,; i++){
        System.out.println("Enter element number : + (i+1));
        storageArray[i] = scanner.nextInt();
        sum += storageArray[i];
        }

        System.out.println(Arrays.toString(storageArray));
        System.out.println("Sum " + sum);

         */
    }
}
