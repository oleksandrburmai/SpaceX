import java.util.Scanner;

public class InputData {

    private Scanner scanner = new Scanner(System.in);

    public String inputName() {
        while (true) {
            String s = scanner.nextLine();
            for (int i = 0; i < allPlanetNameMassive().length; i++) {
                if (allPlanetNameMassive()[i].equalsIgnoreCase(s)) {
                    return s;
                }
            }
            System.out.println("Wrong planet name");
        }
    }

    public int inputNum() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("You input wrong number. Try again");
            }
        }
    }

    private String[] allPlanetNameMassive() {
        Enum.Planets[] planets = Enum.Planets.values();
        String[] allPlanetNameMassive = new String[planets.length];
        for (int i = 0; i < planets.length; i++) {
            allPlanetNameMassive[i] = planets[i].getPlanetName();
        }
        return allPlanetNameMassive;
    }
}
