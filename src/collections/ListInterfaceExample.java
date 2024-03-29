package collections;

import java.util.ArrayList;

public class ListInterfaceExample {
    public static void main(String[] args) {
        // Declaring ArrayList object
        ArrayList<String> car = new ArrayList<String>();

        // Add elements
        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Jeep");
        car.add("Opel");

        // Print out all elements
        System.out.println(car);

        // Get elements by index
        System.out.println(car.get(0));

        // Add element at specific index
        car.add(2, "Toyota");
        System.out.println(car);

        // Changing element's value
        car.set(3, "Ford");
        System.out.println(car);

        // Removing an element
        car.remove(5);
        System.out.println(car);
        car.remove("Mercedes");

        // Length of the list
        System.out.println(car.size());

        // Deleting all elements
        car.clear();
        System.out.println(car);


    }
}
