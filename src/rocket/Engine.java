package rocket;

import actionWhithFuel.FuelCapacity;

import java.util.Random;

public class Engine implements FuelCapacity {

    public int degreeOneFuelCapacity() {
        return fuelCapacity();
    }

    public int degreeTwoFuelCapacity() {
        return fuelCapacity();
    }

    public int degreeThreeFuelCapacity() {
        return fuelCapacity();
    }

    @Override
    public int fuelCapacity() {
        Random random = new Random();
        return random.nextInt(100000 - 10000);
    }
}