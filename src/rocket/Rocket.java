package rocket;

import actionWhithFuel.FuelConsumptionDelegate;

public class Rocket implements FuelConsumptionDelegate {

    private Cabins cabin;
    private Engine engineOne;
    private Engine engineTwo;
    private Engine engineThree;


    public Rocket(Cabins cabin, Engine engineOne, Engine engineTwo, Engine engineThree) {
        this.cabin = cabin;
        this.engineOne = engineOne;
        this.engineTwo = engineTwo;
        this.engineThree = engineThree;
    }

    private int rocketWeight() {
        return cabin.getWeight() + engineOne.getWeight() + engineTwo.getWeight() + engineThree.getWeight();
    }


    @Override
    public double fuelConsumption() {
        return (engineOne.getPower() + engineTwo.getPower() + engineThree.getPower()) / rocketWeight();
    }

    public double totalFuelCapacity() {
        return engineOne.getFuelTankSpace() + engineTwo.getFuelTankSpace() + engineThree.getFuelTankSpace();
    }

    public double rocketAccelerationTill2SpaceSpeed() {
        return (engineOne.accelerationTill2SpaceSpeed(rocketWeight()) +
                engineTwo.accelerationTill2SpaceSpeed(rocketWeight()) +
                engineThree.accelerationTill2SpaceSpeed(rocketWeight())) / 3;
    }
}
