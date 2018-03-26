import planet.Planets;
import rocket.*;
import utils.InputDataUtil;


public class SpaceX implements FlyDelegate {


    private Rocket constructRocket() {
        return new Rocket(InputDataUtil.inputCabin(), constructEngine(), constructEngine(), constructEngine());
    }

    private Engine constructEngine() {
        MainEngineProperties mainEnginePropertiesOne = InputDataUtil.inputMainEnginePropertiesSet();
        FuelTanks fuelTankOne = InputDataUtil.checkFuelTank(mainEnginePropertiesOne);
        return new Engine(mainEnginePropertiesOne, fuelTankOne);
    }

    @Override
    public String fly(Planets planet) {

        Rocket rocket = constructRocket();

        if (rocket.totalFuelCapacity() > planet.getDistance() * rocket.fuelConsumption() / 1000) {
            double time = rocket.rocketAccelerationTill2SpaceSpeed() +
                    (planet.getDistance() - Math.pow(rocket.rocketAccelerationTill2SpaceSpeed(), 2) / 2.0) / 40020.0;
            return "Your fly to planet " + planet.getPlanetName() + " is successful\n" +
                    "And you will spend " + (Math.round(time / 60.0)) + " minutes";
        } else {
            return "Your fly to planet " + planet.getPlanetName() + " is not successful";
        }
    }
}
