package oop;

public class Animals {

    // Fields
    private String type;
    private int avgLifespan;
    private double weight;

    // Constructor
    public Animals(String type, int avgLifespan, double weight){
        this.type = type;
        this.avgLifespan = avgLifespan;
        this.weight = weight;
    }
    public Animals(String type, int avgLifespan) {
        this.type = type;
        this.avgLifespan = avgLifespan;
    }

    // Method

        public void printAnimalsInfo(){
        System.out.println("Type: " + type);
        System.out.println("Average lifespan: " + avgLifespan);
        System.out.println("Weight: " + weight);
    }

    public Animals(){

    }
}
