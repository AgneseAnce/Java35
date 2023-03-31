package tasks.carpetCalculator;

import java.util.Scanner;

public class CallingCarpetCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the floor length");
        double length = scanner.nextDouble();

        System.out.println("Please enter the floor width");
        double width = scanner.nextDouble();

        // Create Floor class object
        Floor floor = new Floor(length, width);

        System.out.println("Floor m^2: " + floor.getArea());

        System.out.println("Please enter the cost per m^2");
        double carpetCost = scanner.nextDouble();

        // Create Carpet class object
        Carpet carpet = new Carpet(carpetCost);

        System.out.println("Carpet price per m^2: " + carpet.getCost());

        // Create Calculator class object
        // Pass Floor and Carpet class objects as input

        Calculator calculator =  new Calculator(floor, carpet);

        System.out.println("Carpet price in total: " + calculator.getTotalCost() + " EUR");
    }
}
