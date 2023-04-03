package homeworks.vehicle.Homeworks.vehicle;

import java.text.DecimalFormat;
import java.util.Scanner;
public class CallingCar {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("0.00");
            boolean airconditioner = false;

            System.out.println("Enter fuel amount in your vehicle");
            float fuel = scanner.nextFloat();
            System.out.println("Enter your vehicle's fuel usage per 100 km");
            float fuelUsage = scanner.nextFloat();
            System.out.println("Enter how many passengers will be in your vehicle");
            int passengers = scanner.nextInt();
            System.out.println("Will you use airconditioner? y/n");
            char inputAC = scanner.next().toLowerCase().charAt(0);
            if(inputAC == 'y'){
                airconditioner = true;
            }
            Car car1 = new Car(fuel, fuelUsage, passengers, airconditioner);
            System.out.println("Your vehicle can drive maximum of " + df.format(car1.maxDistance(fuel, fuelUsage, passengers, airconditioner)) + " kilometers");
        }
    }



