import java.util.Random;

public class Engine implements FuelCapacity {


    public int enginePower(){
        System.out.println("Input engine Power");
        return new InputData().inputNum();
    }

    public void degreeOne() {
        int capacityOne = fuelCapacity();
    }

    public void degreeTwo() {
        int capacityTwo = fuelCapacity();
    }

    public void degreeThree() {
        int capacityThree = fuelCapacity();
    }

    @Override
    public int fuelCapacity() {
        Random random = new Random();
        return random.nextInt(10000 - 500);
    }
}
