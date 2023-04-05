package homeworks.vehicle;

public class Car extends Vehicle{
    private boolean airconditioner;

    public Car(float fuel, float fuelUsage, int passengers, boolean airconditioner) {
        super(fuel, fuelUsage, passengers);
        this.airconditioner = airconditioner;
    }
    public float maxDistance(float fuel, float fuelUsage, int passengers, boolean airconditioner) {
        if (airconditioner){
            fuelUsage = fuelUsage + (fuelUsage * 0.1f);
        } else {
            fuelUsage = fuelUsage;
        }
        return super.maxDistance(fuel, fuelUsage, passengers);
    }
}
