package nz.examlewastaken.enginesim.components.car.base;

import nz.examlewastaken.enginesim.components.car.ecus.Bus;

/**
 * Represents a physical wire.
 */
public interface IWire {
    /**
     * Receive data from a connected {@link EngineComponent}.
     * @param data The bus which transports the data.
     * @return The bus passed as argument.
     */
    Bus receive(Bus data);

    /**
     * Not used at the moment.
     */
    void transmit(Bus data);
}
