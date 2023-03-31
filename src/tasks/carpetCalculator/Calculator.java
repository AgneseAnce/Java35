package tasks.carpetCalculator;

public class Calculator {

    // Defining Floor ( length, width) and Carpet (cost) class objects
    private Floor floor;
    private Carpet carpet;

    // Defining a custom calculator
    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    // Method for calculating total cost, not Getter method
    // Use methods that are held by class objects (must be non-void)
    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }


}
