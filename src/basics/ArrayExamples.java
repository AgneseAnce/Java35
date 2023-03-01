package basics;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        // Declaring an array to store 3 elements of type String
        String[] names = new String[3];

        // Set element values using each element's index
        names[0] = "Ben";
        names[1] = "Tom";
        names[2] = "Bob";

        // Access value No. 1 from an array
        System.out.println(names[0]);

        // Print out all array values - by using each index
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        // Length
        System.out.println(names.length);

        // Second option: declare and initialize array at the same time
        String[] dreamCars = new String[]{"Porsche", "Koenigsegg", "McLaren", "VW Beatle", "Lego"};
        System.out.println(dreamCars.length);

        // Iterate through all elements in an array with a FOR loop

        for (int i = 0; i < dreamCars.length; i++) {
            System.out.println(i+1 + ". "+ dreamCars[i]);
        }

        // Same idea but using FOR-EACH loop
        for(String car : dreamCars){
            System.out.println(car);
        }

        // To quickly print out all values of an array, use a Java utility Arrays
        System.out.println(Arrays.toString(dreamCars));

        /* We have  an array of some amount of int values
        We need to give a comment for every element in the array
        If the value is odd or even */

        int listOfNumbers[] = {5, 20, 15, 68, 47, 96, 103, 3};

        for (int number : listOfNumbers) {
            if (number % 2 == 0) {
                System.out.println(number + " is an even number");
            } else {
                System.out.println(number + " is an odd number");
            }
        }

    }
}
