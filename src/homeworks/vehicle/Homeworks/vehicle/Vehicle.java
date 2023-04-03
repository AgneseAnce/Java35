package homeworks.vehicle.Homeworks.vehicle;

public class Vehicle {

         private float fuel;
        private float fuelUsage;
        private int passengers;

        public Vehicle(float fuel, float fuelUsage, int passengers){
            this.fuel = fuel;
            this.fuelUsage = fuelUsage;
            this.passengers = passengers;
        }
        public float maxDistance(float fuel, float fuelUsage, int passengers) {
            float maxDistance;
            if (passengers > 0) {
                fuelUsage = fuelUsage + (fuelUsage * passengers * 0.05f);
            }
            maxDistance = (fuel / fuelUsage) *100;
            return maxDistance;
        }
    }

