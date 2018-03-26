package planet;

public enum Planets {

    MARS("Mars", 78300000), MOON("Moon", 384400), NEPTUNE("Neptune", 4347400000L), URANUS("Uranus", 2721400000L),
    SATURN("Saturn", 1277400000), JUPITER("Jupiter", 628400000), VENUS("Venus", 41400000), MERCURY("Mercury", 91600000);

    private String planetName;
    private long distance;

    Planets(String planetName, long distance) {
        this.planetName = planetName;
        this.distance = distance;
    }

    public String getPlanetName() {
        return this.planetName;
    }

    public long getDistance() {
        return this.distance;
    }
}
