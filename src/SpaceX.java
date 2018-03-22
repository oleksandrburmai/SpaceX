import rocket.Rocket;
import rocket.RocketFly;

public class SpaceX implements RocketFly {

    @Override
    public String isSuccessfulFly(int enginePower, int rocketWeight, String planetName) {

        Rocket rocket = new Rocket();
        double needFuel;

        if (planetName.toUpperCase().equals("MARS")) {
            needFuel = (rocket.fuelConsumption(rocket.calculateRocketSpeed(rocketWeight, enginePower),
                    rocketWeight) * Planets.MARS.getDistance());
        } else if (planetName.toUpperCase().equals("MOON")) {
            needFuel = (rocket.fuelConsumption(rocket.calculateRocketSpeed(rocketWeight, enginePower),
                    rocketWeight) * Planets.MOON.getDistance());
        } else {
            return "You input wrong planet name";
        }

        if (needFuel < new Rocket().new Cabin().totalFuelCapacity()) {
            return "Your fly to " + planetName + " is successful";
        } else {
            return "Your fly to " + planetName + " is not successful";
        }
    }
}
