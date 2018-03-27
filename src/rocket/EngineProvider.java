package rocket;

public interface EngineProvider {
    double getAccelerationForFirstSpaceSpeed(int rocketWeight);

    double getAccelerationForSecondSpaceSpeed(int rocketWeight);

    int getPower();

    int getWeight();

    double getFuelTankSpace();
}
