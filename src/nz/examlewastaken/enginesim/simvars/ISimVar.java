package nz.examlewastaken.enginesim.simvars;

/**
 * SimVar is the principle that EngineSim works upon. <br>
 * A SimVar consists of a {@link SimVar#name} and {@link SimVar#value}. <br>
 * <br>
 * SimVars can store any data necessary to be accessed by any part of the simulator. Examples would be temperature, sensor data, etc. <br>
 * As the value is stored as {@link Object} it can be casted to any type, necessary in the given situation.
 */
public interface ISimVar {
    /**
     * Get the name of the {@link SimVar}.
     * @return The name as string.
     */
    String getName();

    /**
     * Get the value of the {@link SimVar}.
     * @return The value.
     */
    ISimVarValue getValue();

    /**
     * Set the value as string.
     * @param value The new value.
     */
    void setValue(String value);

    /**
     * Set the value as double.
     * @param value The new value.
     */
    void setValue(double value);

    /**
     * Set the value as boolean.
     * @param value The new value.
     */
    void setValue(boolean value);

    /**
     * Set the value as {@link ISimVarValue}.
     * @param value The new value.
     */
    void setValue(ISimVarValue value);
}
