package tasks.carpetCalculator;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }
        // Getter method
        public double getCost(){
     return cost;
        }

}
