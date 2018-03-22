package Enum;

public enum Planets {

    MARS("Mars", 55757930), MOON("Moon", 384400);

    private String planetName;
    private int distance;

    Planets(String planetName, int distance) {
        this.planetName = planetName;
        this.distance = distance;
    }

    public String getPlanetName() {
        return this.planetName;
    }

    public int getDistance() {
        return this.distance;
    }
}
