package oop.inheritance;

class Vehicle{
    protected String brand;
    public void honk(){
        System.out.println("Too-too");
        System.out.println("Brand: " + brand);
    }
}

// Child class - polymorfism
class Bike extends Vehicle{
    public void honk(){
        System.out.println("Bip-bip");
        System.out.println("Brand: " + brand);
    }
}
public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.brand = "Koenigsegg";
        vehicle.honk();

        Bike bike = new Bike();
        bike.brand = "Cube";
        bike.honk();
    }
}
