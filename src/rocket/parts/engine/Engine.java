package rocket.parts.engine;

import rocket.parts.fuel_tank.FuelTanks;

public class Engine implements EngineProvider {

    private int weight;
    private int power;
    private double fuelTankSpace;

    public Engine(MainEngineProperties engineProperties, FuelTanks fuelTanks) {
        this.weight = engineProperties.getWeight() + fuelTanks.getWeight();
        this.power = engineProperties.getEnginePower();
        this.fuelTankSpace = fuelTanks.getCapacity();
    }

    @Override
    public double getAccelerationForFirstSpaceSpeed(int rocketWeight) {
        return 28440.0 / (this.power / rocketWeight);
    }

    @Override
    public double getAccelerationForSecondSpaceSpeed(int rocketWeight) {
        return 40020.0 / ((this.power + getAccelerationForFirstSpaceSpeed(rocketWeight) * 0.5) / rocketWeight);
    }

    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public double getFuelTankSpace() {
        return this.fuelTankSpace;
    }
}