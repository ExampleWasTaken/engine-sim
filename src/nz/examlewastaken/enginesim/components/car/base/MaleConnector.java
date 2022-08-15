package nz.examlewastaken.enginesim.components.car.base;

/**
 * Represents a physical male connector. <br>
 * The male connector is used to transmit data. See {@link FemaleConnector} for receiving data.
 */
public interface MaleConnector extends Connector {
    void transmit(double data);
}
