package nz.examlewastaken.enginesim.components.car.base;

import nz.examlewastaken.enginesim.base.Updatable;

/**
 * Represents a physical sensor.
 */
public abstract class Sensor implements EngineComponent, DataProvider {
    /**
     * Measure the property the sensor is supposed to measure.
     * @return The measured value.
     */
    protected abstract double measure();
}
