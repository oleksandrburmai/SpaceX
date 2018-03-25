import rocket.Cabins;
import rocket.Rocket;

public class Main {

    public static void main(String[] args) {
        programReuse();
        //Rocket rocket=new Rocket(Cabins.ALFA,)
    }

    private static void programReuse() {

        InputData inputData = new InputData();
        SpaceX spaceX = new SpaceX();

        System.out.println(spaceX.fly(inputData.inputPlanetName()));

        while (true) {
            System.out.println("If you want construct new rocket enter 1:\n" +
                    "If you want exit from this program enter 0:");
            int menuOption = inputData.inputNum();
            if (menuOption == 1) {
                System.out.println(spaceX.fly(inputData.inputPlanetName()));
            } else if (menuOption == 0) {
                break;
            } else {
                System.out.println("Your enter wrong number option. Please try again.");
            }
        }
    }
}
