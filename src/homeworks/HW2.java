package homeworks;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        /* Using scanner read the speed in mp/h
         Calculate and output the speed in km/h
        Example with an input 122.7 mp/h
        Output --> 122.7 mp/h in km/h would be equal to 197.4665
        */
    Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the speed in miles per hour");
        double miles = scanner.nextDouble();
        double res = miles *1.609f;

        float res2 = (float)res;

        System.out.println(miles + " miles per hour equals to " + res2 + " km per hour");
    }
}
