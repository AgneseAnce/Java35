package homeworks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
        // Method takes in two arguments - original price and discount %.
        // Float input. Returns float price with two decimal places.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the full price");
        float price = scanner.nextFloat();
        System.out.println("Please enter the discount in %");
        float percentage = scanner.nextFloat();
        discount(price, percentage);
        // System.out.printf("Final price is %.2f EUR", discount(price, percentage));
    }

    // Discount method
    public static float discount(float price, float percentage) {
        // Rounding to two decimal places
        DecimalFormat df = new DecimalFormat("0.00");

        float finalPrice = (100 - percentage) * price / 100;
        // float finalPrice = price - (percentage/100 * price);
        System.out.println("Special price: " + df.format(finalPrice) + " EUR");
        System.out.printf("Final price is %.2f EUR %%", finalPrice);
        return finalPrice;
    }
}