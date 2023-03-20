package homeworks;

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
        System.out.printf("Final price is %.2f EUR", );
    }

    // Discount method
    public float discount(float price, float percentage) {
        float finalPrice = (100 - percentage) * price / 100;
        return finalPrice;
    }


}
