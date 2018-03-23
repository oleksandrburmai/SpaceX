import rocket.Engine;
import rocket.Rocket;
import rocket.RocketFly;

public class SpaceX implements RocketFly {

    @Override
    public String fly(int enginePower, int rocketWeight, String planetName) {

        Rocket rocket = new Rocket();
        Planets planet = null;

        for (Planets planets : Planets.values()) {
            if (planetName.toUpperCase().equals(planets.getPlanetName().toUpperCase())) {
                planet = planets;
            }
        }

        if (planet != null) {
            double needFuel = (rocket.fuelConsumption(rocket.new Cabin().calculateRocketSpeed(rocketWeight, enginePower),
                    rocketWeight) * planet.getDistance());
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
