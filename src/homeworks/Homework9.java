package homeworks;
import java.util.Scanner;
public class Homework9 {
    public static void main(String[] args) {
        /* Write an application that will draw a Christmas tree.
        The height of the tree should be read from user (positive integer). */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of the tree:");
        int height = scanner.nextInt();

        for(int rows=0; rows<height; rows++){
            for(int spaces=0; spaces<height-rows;spaces++){
                System.out.print(" ");
            }
            for(int stars = 0; stars <(2*rows+1); stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int trunk=0; trunk<height; trunk++){
            System.out.print(" ");
        }
        System.out.println("#");

//        for(int rows = 0; rows <height; rows++){
//            for (int spaces = 0; spaces < height-1-rows; spaces++){
//                System.out.print(" ");
//            }
//            for(int stars = 0; stars < rows *2+1; stars++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int spaces = 0; spaces <height-1; spaces++){
//            System.out.print(" ");
//        }
//        System.out.println("#");
    }
}
