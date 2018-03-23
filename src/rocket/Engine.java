package rocket;

import actionWhithFuel.FuelCapacity;

public class Engine implements FuelCapacity {

    public int engineFuelCapacity() {
        return fuelCapacity() + fuelCapacity() + fuelCapacity();
    }
}
