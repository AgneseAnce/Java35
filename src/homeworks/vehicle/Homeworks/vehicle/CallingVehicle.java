package homeworks.vehicle.Homeworks.vehicle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CallingVehicle {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fuel amount in your vehicle");
        float fuel = scanner.nextFloat();
        System.out.println("Enter your vehicle's fuel usage per 100 km");
        float fuelUsage = scanner.nextFloat();
        System.out.println("Enter how many passengers will be in your vehicle");
        int passengers = scanner.nextInt();
        Vehicle vehicle1 = new Vehicle(fuel, fuelUsage, passengers);
        System.out.println("Your vehicle can drive maximum of " +  df.format(vehicle1.maxDistance(fuel, fuelUsage, passengers)) + " kilometers");
    }
}