package rocket.parts.engine;

import rocket.parts.fuel_tank.FuelTanks;

public class Engine implements EngineProvider {

    private int weight;
    private int power;
    private double fuelTankSpace;
    private int height;
    private int width;
    private double fuelConsumption;
    private double accelerationForFirstSpaceSpeed;
    private double accelerationForSecondSpaceSpeed;

    public Engine(MainEngineProperties engineProperties, FuelTanks fuelTanks) {
        this.weight = engineProperties.getWeight() + fuelTanks.getWeight();
        this.power = engineProperties.getEnginePower();
        this.fuelTankSpace = fuelTanks.getCapacity();
        this.height = engineProperties.getHeight();
        this.width = engineProperties.getWidth();
        this.fuelConsumption = engineProperties.getEnginePower() / engineProperties.getWeight();
    }

    @Override
    public void calculateAccelerationForFirstSpaceSpeed() {
        this.accelerationForFirstSpaceSpeed = 28440.0 / (this.power / this.weight);
    }

    @Override
    public void calculateAccelerationForSecondSpaceSpeed() {
        this.accelerationForSecondSpaceSpeed = 40020.0 /
                ((this.power + this.accelerationForFirstSpaceSpeed * 0.5) / this.weight);
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

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public double getAccelerationForFirstSpaceSpeed() {
        return this.accelerationForFirstSpaceSpeed;
    }

    @Override
    public double getAccelerationForSecondSpaceSpeed() {
        return this.accelerationForSecondSpaceSpeed;
    }

    @Override
    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

}
