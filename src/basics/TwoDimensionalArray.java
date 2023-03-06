package basics;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        // Declaring a 2D array with 2 rows and 5 columns
       String [][] dreamCars = new String[2][5];
       String[][] dreamCars2 = new String[][]{{"Ferrari", "Porsche", "Lambo"}, {"Skoda", "Batcar", "Corvette"}};

       dreamCars[0][0] = "Ferrari";
       dreamCars[0][1] = "Porsche";
       dreamCars[0][2] = "Lamborghini";
       dreamCars[0][3] = "VW";
       dreamCars[0][4] = "Toyota";

        dreamCars[1][0] = "Skoda";
        dreamCars[1][1] = "Batcar";
        dreamCars[1][2] = "Corvette";
        dreamCars[1][3] = "Ford";
        dreamCars[1][4] = "Jaguar";

        // How many rows are there in the array?
        System.out.println(dreamCars.length);

        // How many columns are there in one row?
        System.out.println(dreamCars[0].length);

        // Print out all values
        // i - row
        // j - column

        for (int i = 0; i <dreamCars.length; i++){
            for (int j = 0; j < dreamCars[i].length; j++){
                System.out.print(dreamCars[i][j] + " ");
            }
            System.out.println();
        }

        // Same thing using nested FOR-EACH loops
        for(String [] rows: dreamCars){
            for (String car: rows){
                System.out.print(car + " ");
            }
            System.out.println();
        }






    }
}
