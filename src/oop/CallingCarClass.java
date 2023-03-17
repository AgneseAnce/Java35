package oop;

import java.util.Scanner;

public class CallingCarClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the brand of the car");
        String carBrand = scanner.nextLine();
        System.out.println("Please enter the color of the car");
        String carColor = scanner.nextLine();
        System.out.println("Please enter the max speed of the car");
        int carMaxSpeed = scanner.nextInt();

        // Create a new car class object
        Car car1 = new Car();

        // Set field values with data gotten from the user
//        car1.brand = carBrand;
//        car1.color = carColor;
//        car1.maxSpeed = carMaxSpeed;

        car1.setBrand(carBrand);
        car1.setColor(carColor);
        car1.setMaxSpeed(carMaxSpeed);

        car1.printCarInfo();
        System.out.println(car1.getMaxSpeed());

        if (car1.getMaxSpeed() >= 300){
            System.out.println("Sport's car");
        } else {
            System.out.println("Regular car");
        }

    }
}
