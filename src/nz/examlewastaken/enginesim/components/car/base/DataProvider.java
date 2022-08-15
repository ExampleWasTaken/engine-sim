package nz.examlewastaken.enginesim.components.car.base;

/**
 * Represents an {@link EngineComponent} that provides data to another component such as {@link Sensor} or {@link ECU}.
 */
public interface DataProvider {
    double getData();
}
