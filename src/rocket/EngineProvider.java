package rocket;

public interface EngineProvider {
    double accelerationTill1SpaceSpeed(int rocketWeight);

    double accelerationTill2SpaceSpeed(int rocketWeight);

    int getPower();

    int getWeight();

    double getFuelTankSpace();
}
