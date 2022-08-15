package nz.examlewastaken.enginesim.components.car.base;

/**
 * Represents a physical connector that connects a {@link Wire} with a {@link DataProvider}.
 */
public interface Connector extends EngineComponent {
    void connectDataSource(DataProvider source);
    void connectWire(Wire wire);
}
