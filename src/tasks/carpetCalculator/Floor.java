package tasks.carpetCalculator;

public class Floor {
    // Use private cause this class won't be used for sub-classes
    private double length;
    private double width;

    // Custom constructor with validation
    public Floor (double length, double width){
        if(length < 0){
            this.length = 0;
        } else {
            this.length = length;
        }

        if(width < 0){
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // Custom method for calculating area, not Getter method
    public double getArea(){
        return length * width;
    }
}
