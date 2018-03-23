package rocket;

import actionWhithFuel.FuelCapacity;

public class Engine implements FuelCapacity {

    public int engineFuelCapacity() {
        int degreeOneFuelCapacity = fuelCapacity();
        int degreeTwoFuelCapacity = fuelCapacity();
        int degreeThreeFuelCapacity = fuelCapacity();
        return degreeOneFuelCapacity + degreeTwoFuelCapacity + degreeThreeFuelCapacity;
    }
}
