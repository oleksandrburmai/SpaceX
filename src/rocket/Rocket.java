package rocket;

import actionWhithFuel.FuelConsumption;

public class Rocket implements CalculateSpeed, FuelConsumption {

    @Override
    public double calculateRocketSpeed(int rocketWeight, int enginePower) {
        return (enginePower / rocketWeight) * 1000;
    }

    @Override
    public double fuelConsumption(double rocketSpeed, int rocketWeight) {
        return rocketWeight / rocketSpeed;
    }

    public class Cabin {

        public double totalFuelCapacity() {
            Engine engine = new Engine();
            return engine.degreeOneFuelCapacity() + engine.degreeThreeFuelCapacity() + engine.degreeTwoFuelCapacity();
        }
    }
}
