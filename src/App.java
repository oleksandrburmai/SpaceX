import utils.InputDataUtil;

public class App {

    public void runProgram() {
        SpaceX spaceX = new SpaceX();

        System.out.println(spaceX.fly(InputDataUtil.inputPlanet()));

        while (true) {
            System.out.println("If you want construct new rocket enter 1:\n" +
                    "If you want exit from this program enter 0:");
            int menuOption = InputDataUtil.inputNum();
            if (menuOption == 1) {
                System.out.println(spaceX.fly(InputDataUtil.inputPlanet()));
            } else if (menuOption == 0) {
                break;
            } else {
                System.out.println("Your enter wrong number option. Please try again.");
            }
        }
    }
}
