package rocket;

public class FuelTank {

    private int height;
    private int weight;
    private int width;
    private int capacity;

    public FuelTank(int height, int weight, int width) {

        this.height = height;
        this.weight = weight;
        this.width = width;
        this.capacity = height * weight * width;
    }

    public int getCapacity() {

        return this.capacity;
    }
}
