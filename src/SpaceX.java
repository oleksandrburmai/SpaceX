import Interface.IsSuccessfulRocketFly;

public class SpaceX implements IsSuccessfulRocketFly {
    public String planetName() {
        System.out.println("Input name of the planet which you want to fly");
        return new InputData().inputName();
    }

    @Override
    public String isSuccessfulFly() {
        return null;
    }
}
