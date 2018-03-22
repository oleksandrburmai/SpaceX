import Interface.FuelCapacity;

import java.util.Random;

public class Engine implements FuelCapacity {


    public int enginePower(){
        System.out.println("Input engine Power");
        return new InputData().inputNum();
    }

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
        return random.nextInt(10000 - 500);
    }
}
