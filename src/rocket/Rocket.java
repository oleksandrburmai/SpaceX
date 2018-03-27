package rocket;

import fuel.FuelConsumptionDelegate;
import rocket.parts.cabin.CabinProvider;
import rocket.parts.engine.EngineProvider;

public class Rocket implements FuelConsumptionDelegate {

    private CabinProvider cabin;
    private EngineProvider[] engines;

    public Rocket(CabinProvider cabin, EngineProvider[] engines) {
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

    public double sumTotalFuelCapacity() {
        double totalFuel = 0;
        for (EngineProvider anEngine : this.engines) {
            totalFuel += anEngine.getFuelTankSpace();
        }
        return totalFuel;
    }

    public double getRocketAccelerationForSecondSpaceSpeed() {
        double timeTill2SpaceSpeed = 0;
        for (EngineProvider anEngine : this.engines) {
            timeTill2SpaceSpeed += anEngine.getAccelerationForSecondSpaceSpeed();
        }
        return timeTill2SpaceSpeed / this.engines.length;
    }
}
