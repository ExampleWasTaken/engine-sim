package nz.examlewastaken.enginesim.components.car.base;

import nz.examlewastaken.enginesim.components.car.ecus.Bus;

/**
 * Represents an {@link EngineComponent} that provides data to another component such as {@link Sensor} or {@link ECU}.
 */
public interface DataProvider {
    /**
     * Get the data of a {@link DataProvider}.
     * @param data The bus which transports the data.
     * @return The bus that was passed as argument.
     */
    Bus getData(Bus data);
}
