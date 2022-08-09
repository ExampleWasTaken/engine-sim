package nz.examlewastaken.enginesim.simvars;

/**
 * A default SimVar as described in {@link ISimVar}.
 */
public class SimVar implements ISimVar {

    /**
     * The name of the SimVar.
     */
    private final String name;
    /**
     * The value of the SimVar.
     */
    private Object value;

    /**
     * @param name The name of the SimVar. This cannot be changed later.
     * @param value The initial value of the SimVar as string.
     */
    public SimVar(String name, String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * @param name The name of the SimVar. This cannot be changed later.
     * @param value The initial value of the SimVar as double.
     */
    public SimVar(String name, double value) {
        this.name = name;
        this.value = value;
    }

    /**
     * @param name The name of the SimVar. This cannot be changed later.
     * @param value The initial value of the SimVar as boolean.
     */
    public SimVar(String name, boolean value) {
        this.name = name;
        this.value = value;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Object getValue() {
        return this.value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public void setValue(boolean value) {
        this.value = value;
    }
}
