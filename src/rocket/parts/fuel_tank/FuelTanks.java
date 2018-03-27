package rocket.parts.fuel_tank;

public enum FuelTanks {

    VERYLARGE("Very large", 200, 200, 4000), LARGE("Large", 100, 100, 2000),
    MEDIUM("Medium", 50, 50, 1000), SMALL("Small", 25, 25, 500), VERYSMALL("Very small", 10, 10, 200);

    private String fuelTankName;
    private int weight;
    private double capacity;

    FuelTanks(String fuelTankName, int height, int width, int weight) {
        this.fuelTankName = fuelTankName;
        this.weight = weight;
        this.capacity = Math.PI * height * Math.pow((width / 2), 2);
    }

    public double getCapacity() {
        return this.capacity;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getFuelTankName() {
        return this.fuelTankName;
    }
}
