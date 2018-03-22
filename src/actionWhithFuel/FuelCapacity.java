package actionWhithFuel;

import java.util.Random;

public interface FuelCapacity {
    default int fuelCapacity() {
        Random random = new Random();
        return random.nextInt(100000 - 10000);
    }
}
