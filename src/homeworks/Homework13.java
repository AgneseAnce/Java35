package homeworks;

import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original array: " + Arrays.toString(my_array));
        System.out.println("Maximum value for the above array = "+ max(my_array));
        System.out.println("Minimum value for the above array = "+ min(my_array));
    }

    public static int max(int[] my_array) {
        int max = my_array[0];
        for (int i : my_array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public static int min(int[] my_array) {
        int min = my_array[0];
        for (int i : my_array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}

