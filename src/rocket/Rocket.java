package rocket;

import actionWhithFuel.FuelConsumption;

public class Rocket implements FuelConsumption {

    @Override
    public double fuelConsumption(double rocketSpeed, int rocketWeight) {
        return rocketWeight / rocketSpeed;
    }

    public class Cabin implements Speed {

        @Override
        public double calculateRocketSpeed(int rocketWeight, int enginePower) {
            return (enginePower / rocketWeight) * 1000;
        }
    }
}
