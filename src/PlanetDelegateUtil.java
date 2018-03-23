interface PlanetDelegateUtil {

    static Planets findPlanetToFly(String planetName) {
        for (Planets planets : Planets.values()) {
            if (planetName.toUpperCase().equals(planets.getPlanetName().toUpperCase())) {
                return planets;
            }
        }
        return null;
    }
}
