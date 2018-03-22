public class Main {

    public static void main(String[] args) {

        int enginePower = Integer.parseInt(args[0]);
        int rocketWeight = Integer.parseInt(args[1]);
        String planetName = args[2];

        System.out.println(new SpaceX().isSuccessfulFly(enginePower, rocketWeight, planetName));
    }
}
