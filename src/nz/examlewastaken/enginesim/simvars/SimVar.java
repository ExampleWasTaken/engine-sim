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
    private ISimVarValue value;

    public SimVar(String name, String value) {
        this.name = name;
        this.value = new SimVarValue(value);
    }

    public SimVar(String name, double value) {
        this.name = name;
        this.value = new SimVarValue(value);
    }

    public SimVar(String name, boolean value) {
        this.name = name;
        this.value = new SimVarValue(value);
    }

    /**
     * @param name The name of the SimVar. This cannot be changed later.
     * @param value The initial value of the SimVar as {@link ISimVarValue}.
     */
    public SimVar(String name, ISimVarValue value) {
        this.name = name;
        this.value = value;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ISimVarValue getValue() {
        return this.value;
    }

    @Override
    public void setValue(String value) {
        setValue(new SimVarValue(value));
    }

    @Override
    public void setValue(double value) {
        setValue(new SimVarValue(value));
    }

    @Override
    public void setValue(boolean value) {
        setValue(new SimVarValue(value));
    }

    @Override
    public void setValue(ISimVarValue value) {
        this.value = value;
    }
}
