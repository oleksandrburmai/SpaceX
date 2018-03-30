package rocket.part.engine;

public interface EngineProvider {

    void calculateAccelerationForFirstSpaceSpeed();

    void calculateAccelerationForSecondSpaceSpeed();

    int getPower();

    int getWeight();

    double getFuelTankSpace();

    int getHeight();

    int getWidth();

    double getAccelerationForFirstSpaceSpeed();

    double getAccelerationForSecondSpaceSpeed();

    double getFuelConsumption();
}
