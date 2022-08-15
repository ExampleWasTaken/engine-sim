package nz.examlewastaken.enginesim.components.car.base;

/**
 * Represents a physical wire.
 */
public interface Wire {
    void receive(double data);
    double transmit();
}
