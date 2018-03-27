package utils;

import planet.Planets;
import rocket.parts.cabin.Cabin;
import rocket.parts.cabin.Cabins;
import rocket.parts.fuel_tank.FuelTanks;
import rocket.parts.engine.MainEngineProperties;

public class InputDataUtil {

    private InputDataUtil() throws IllegalStateException {
        throw new IllegalStateException("Can't create instance of InputDataUtil");
    }

    public static Planets inputPlanet() {
        System.out.println("Enter name of the planet which you want to fly:\nMoon, Mercury, Venus, Mars, " +
                "Jupiter, Saturn, Uranus, Neptune");
        while (true) {
            String planetName = ScannerUtil.getString();
            for (Planets planets : Planets.values()) {
                if (planetName.equalsIgnoreCase(planets.getPlanetName())) {
                    return planets;
                }
            }
            System.out.println("You enter wrong name of the planet. Please try again:");
        }
    }

    public static Cabin inputCabin() {
        System.out.println("Enter name of cabin which you want to choice: Name (height, width, weight)\n" +
                "Alfa (100, 20, 1000)\n" + "Beta (20, 10, 100)\nGama (10, 10, 80)\n" +
                "Delta (40, 25, 150)\nZeta (50, 10, 200)");
        while (true) {
            String cabinName = ScannerUtil.getString();
            for (Cabins cabins : Cabins.values()) {
                if (cabinName.equalsIgnoreCase(cabins.getCabinName())) {
                    return new Cabin(cabins);
                }
            }
            System.out.println("You enter wrong name of the cabin. Please try again:");
        }
    }

    private static FuelTanks inputFuelTank() {
        System.out.println("Enter name of fuel tank which you want to choice to this engine: Name (height, width, weight)" +
                "\nVery large (200, 200, 4000)\n" + "Large (100, 100, 2000)\nMedium (50, 50, 1000)" +
                "\nSmall (25, 25, 500)\nVery small (10, 10, 200)");
        while (true) {
            String fuelTankName = ScannerUtil.getString();
            for (FuelTanks fuelTanks : FuelTanks.values()) {
                if (fuelTankName.equalsIgnoreCase(fuelTanks.getFuelTankName())) {
                    return fuelTanks;
                }
            }
            System.out.println("You enter wrong name of the fuel tank. Please try again:");
        }
    }

    public static MainEngineProperties inputMainEnginePropertiesSet() {
        System.out.println("Enter name of engine which you want to choice: Name (height, width, weight," +
                " enginePower)\n" + "V8 (300, 300, 600, 20000)\n" + "V7 (150, 150, 300, 10000)" +
                "\nV6 (70,70,140,5000)\nV5 (40,40,80,2500)\nV4 (20,20,40,1250)");
        while (true) {
            String engineName = ScannerUtil.getString();
            for (MainEngineProperties engine : MainEngineProperties.values()) {
                if (engineName.equalsIgnoreCase(engine.getMainEnginePropertiesSetName())) {
                    return engine;
                }
            }
            System.out.println("You enter wrong name of the engine. Please try again:");
        }
    }

    public static FuelTanks checkFuelTank(MainEngineProperties mainEngineProperties) {
        while (true) {
            FuelTanks fuelTank = inputFuelTank();
            if (mainEngineProperties.getSpace() > fuelTank.getCapacity()) {
                return fuelTank;
            } else {
                System.out.println("You choice to large fuel tank. Please choice another fuel tank.\n");
            }
        }
    }

    public static int inputNumberOfEngines() {
        System.out.println("Enter number of engines. You can not enter less then 3 engine and not more then 5");
        int numberOfEngines = ScannerUtil.getInt();
        while (true) {
            if (numberOfEngines >= 3 && numberOfEngines <= 5) {
                return numberOfEngines;
            } else {
                System.out.println("Enter not less then 3 engine and not more then 5");
                numberOfEngines = ScannerUtil.getInt();
            }
        }
    }
}