package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
      // Declaring a new Map object
        Map<String, Integer> salaryMap = new HashMap<>();

        // Adding values to the Map
        salaryMap.put("Bob", 900);
        salaryMap.put("John", 920);

        // Printing-out Map
        System.out.println(salaryMap);

        // Getting value from key
        System.out.println("John's salary: " + salaryMap.get("John"));

        // Getting all key values
        System.out.println(salaryMap.keySet());

        // Size
        System.out.println(salaryMap.size());

        // Checking if Map contains a specfic value
        System.out.println(salaryMap.containsValue(920));

        // Removing a key/value pair
        salaryMap.remove("Bob");
        System.out.println(salaryMap);


        // Example

        Map<String, String> capitalCity = new HashMap<>();
        capitalCity.put("Estonia", "Tallinn");
        capitalCity.put("Luxembourg", "Luxembourg");
        capitalCity.put("Finland", "Helsinki");

        System.out.println(capitalCity.get("Finland"));


        // Iterating through all Map elements
        for(Map.Entry<String, String> entry: capitalCity.entrySet()){
            System.out.println(entry.getKey() + " has a capital city of " + entry.getValue());
        }



    }
}
