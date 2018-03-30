package rocket.part.cabin;

public class Cabin implements CabinProvider {

    private int weight;
    private double capacity;
    private String cabinName;
    private int height;
    private int width;

    public Cabin(Cabins cabin) {
        this.cabinName = cabin.getCabinName();
        this.weight = cabin.getWeight();
        this.capacity = cabin.getCapacity();
        this.height = cabin.getHeight();
        this.width = cabin.getWidth();
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public double getCapacity() {
        return this.capacity;
    }

    @Override
    public String getCabinName() {
        return this.cabinName;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public int getWidth() {
        return this.width;
    }
}
