package nz.examlewastaken.enginesim.components.car.base;

import nz.examlewastaken.enginesim.base.Updatable;

/**
 * Represents any {@code 'Electronic Control Unit'} such as the {@code 'Engine Control Unit'} or the {@code Transmission Control Unit}.
 */
public interface ECU extends EngineComponent, DataProvider, Updatable {
    void connectConnector(FemaleConnector connector);
    void input();
    void output();
}
