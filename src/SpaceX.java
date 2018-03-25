import rocket.*;


public class SpaceX implements FlyDelegate {

    private InputData input = new InputData();

    private Rocket constructRocket() {

        Cabins cabin = input.inputCabinName();

        MainEngineProperties mainEnginePropertiesOne = input.inputMainEnginePropertiesSetName();
        FuelTanks fuelTankOne = input.checkFuelTank(mainEnginePropertiesOne);
        Engine engineOne = new Engine(mainEnginePropertiesOne, fuelTankOne);

        MainEngineProperties mainEnginePropertiesTwo = input.inputMainEnginePropertiesSetName();
        FuelTanks fuelTankTwo = input.checkFuelTank(mainEnginePropertiesTwo);
        Engine engineTwo = new Engine(mainEnginePropertiesTwo, fuelTankTwo);

        MainEngineProperties mainEnginePropertiesThree = input.inputMainEnginePropertiesSetName();
        FuelTanks fuelTankThree = input.checkFuelTank(mainEnginePropertiesThree);
        Engine engineThree = new Engine(mainEnginePropertiesThree, fuelTankThree);

        return new Rocket(cabin, engineOne, engineTwo, engineThree);
    }

    @Override
    public String fly(Planets planet) {

        Rocket rocket = constructRocket();

        if (rocket.totalFuelCapacity() > planet.getDistance() * rocket.fuelConsumption() / 1000) {
            double time = rocket.rocketAccelerationTill2SpaceSpeed() +
                    (planet.getDistance() - Math.pow(rocket.rocketAccelerationTill2SpaceSpeed(), 2) / 2) / 40020;
            return "Your fly to planet " + planet.getPlanetName() + " is successful\n" +
                    "And you will spend " + (Math.round(time / 60)) + " minutes";
        } else {
            return "Your fly to planet " + planet.getPlanetName() + " is not successful";
        }
    }
}
