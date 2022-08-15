package nz.examlewastaken.enginesim.components.car.base;

import nz.examlewastaken.enginesim.base.Updatable;

/**
 * Represents a physical sensor.
 */
public interface Sensor extends EngineComponent, DataProvider, Updatable {
    void measure();
}
