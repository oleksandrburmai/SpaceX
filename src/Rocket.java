import Interface.CalculateSpeed;

public class Rocket implements CalculateSpeed {

    private int rocketWeight() {
        System.out.println("Input rocket weight");
        return new InputData().inputNum();
    }


    @Override
    public double calculateRocketSpeed() {
        return new Engine().enginePower() / rocketWeight();
    }

    class Cabin {
        public void launchRocket() {


        }

        public int totalFuelCapacity() {
            Engine engine = new Engine();
            return engine.degreeOneFuelCapacity() + engine.degreeThreeFuelCapacity() + engine.degreeTwoFuelCapacity();
        }
    }
}
