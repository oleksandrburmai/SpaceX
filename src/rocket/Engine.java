package rocket;

public class Engine implements EngineProvider {

    private int weight;
    private int power;
    private double fuelTankSpace;

    public Engine(MainEngineProperties engineProperties, FuelTanks fuelTanks) {
        this.weight = engineProperties.getWeight() + fuelTanks.getWeight();
        this.power = engineProperties.getEnginePower();
        this.fuelTankSpace = fuelTanks.getCapacity();
    }

    /*public int getPower() {
        return this.power;
    }

    public int getWeight() {
        return this.weight;
    }

    public double getFuelTankSpace() {
        return this.fuelTankSpace;
    }*/

    @Override
    public double accelerationTill1SpaceSpeed(int rocketWeight) {
        return 28440.0 / (this.power / rocketWeight);
    }

    @Override
    public double accelerationTill2SpaceSpeed(int rocketWeight) {
        return 40020.0 / ((this.power + accelerationTill1SpaceSpeed(rocketWeight) * 0.5) / rocketWeight);
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
