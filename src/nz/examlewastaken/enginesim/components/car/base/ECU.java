package nz.examlewastaken.enginesim.components.car.base;

import nz.examlewastaken.enginesim.base.Updatable;
import nz.examlewastaken.enginesim.components.car.ecus.Bus;

/**
 * Represents any {@code 'Electronic Control Unit'} such as the {@code 'Engine Control Unit'} or the {@code Transmission Control Unit}.
 */
public interface ECU extends EngineComponent, DataProvider, Updatable {
    /**
     * The input of the ECU. This is where all the data comes in and is initially managed.
     * @param data The bus containing the data.
     */
    void input(Bus data);

    /**
     * Not used at the moment.
     */
    void output();
}
