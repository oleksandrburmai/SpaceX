

public class Rocket implements CalculateSpeed {

    public int rocketWeight(){
        System.out.println("Input rocket weight");
        return new InputData().inputNum();
    }

    @Override
    public double calculateRocketSpeed() {

        return 0;
    }

    class Cabin {
        public void launchRocket() {

        }
    }
}
