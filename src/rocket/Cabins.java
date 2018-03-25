package rocket;

public enum Cabins {

    ALFA("Alfa", 100, 20, 1000), BETA("Beta", 20, 10, 100), GAMA("Gama", 10, 10, 80),
    DELTA("Delta", 40, 25, 150), ZETA("Zeta", 50, 10, 200);

    private String cabinName;
    private int weight;
    private int capacity;

    Cabins(String cabinName, int height, int width, int weight) {
        this.cabinName = cabinName;
        this.weight = weight;
        this.capacity = (int) (Math.PI * height * Math.pow((width / 2), 2) / 1000);
    }

    public int getWeight() {
        return this.weight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getCabinName() {
        return this.cabinName;
    }
}
