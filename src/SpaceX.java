import rocket.Engine;
import rocket.Rocket;
import rocket.RocketFlyDelegate;

public class SpaceX implements RocketFlyDelegate {

    @Override
    public String fly(int enginePower, int rocketWeight, String planetName) {

        Rocket rocket = new Rocket();

        if (PlanetDelegateUtil.findPlanetToFly(planetName) != null) {
            double needFuel = (rocket.fuelConsumption(rocket.new Cabin().calculateRocketSpeed(rocketWeight, enginePower),
                    rocketWeight) * PlanetDelegateUtil.findPlanetToFly(planetName).getDistance());
            if (needFuel < new Engine().engineFuelCapacity()) {
                return "Your fly to " + planetName + " is successful";
            } else {
                return "Your fly to " + planetName + " is not successful";
            }
        } else {
            return "You input wrong planet name";
        }
    }
}
