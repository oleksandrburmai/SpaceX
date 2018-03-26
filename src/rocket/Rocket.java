package rocket;

import actionWhithFuel.FuelConsumptionDelegate;

public class Rocket implements FuelConsumptionDelegate {

    private CabinProvider cabin;
    private EngineProvider[] engines;

    public Rocket(Cabins cabin, EngineProvider[] engines) {
        this.cabin = cabin;
        this.engines = engines;
    }

    private int sumRocketWeight() {
        int weight = 0;
        for (EngineProvider anEngine : this.engines) {
            weight += anEngine.getWeight();
        }
        return cabin.getWeight() + weight;
    }

    @Override
    public double calculateFuelConsumption() {
        double totalPower = 0;
        for (EngineProvider anEngine : this.engines) {
            totalPower += anEngine.getPower();
        }
        return totalPower / sumRocketWeight();
    }

    public double totalFuelCapacity() {
        double totalFuel = 0;
        for (EngineProvider anEngine : this.engines) {
            totalFuel += anEngine.getFuelTankSpace();
        }
        return totalFuel;
    }

    public double rocketAccelerationTill2SpaceSpeed() {
        double timeTill2SpaceSpeed = 0;
        for (EngineProvider anEngine : this.engines) {
            timeTill2SpaceSpeed += anEngine.accelerationTill2SpaceSpeed(sumRocketWeight());
        }
        return timeTill2SpaceSpeed / this.engines.length;
    }
}
