package rocket;

public enum MainEngineProperties {

    V8("V8", 300, 300, 600, 20000), V7("V7", 150, 150, 300, 10000), V6("V6", 70, 70, 140, 5000),
    V5("V5", 40, 40, 80, 2500), V4("V4", 20, 20, 40, 1250);

    private String mainEnginePropertiesSetName;
    private double space;
    private int weight;
    private int enginePower;

    MainEngineProperties(String mainEnginePropertiesSetName, int height, int width, int weight, int enginePower) {
        this.mainEnginePropertiesSetName = mainEnginePropertiesSetName;
        this.space = Math.PI * height * Math.pow(width / 2, 2);
        this.weight = weight;
        this.enginePower = enginePower;
    }

    public String getMainEnginePropertiesSetName() {
        return this.mainEnginePropertiesSetName;
    }

    public double getSpace() {
        return this.space;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getEnginePower() {
        return this.enginePower;
    }
}
