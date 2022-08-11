package nz.examlewastaken.enginesim.simvars;

public class SimVarValue implements ISimVarValue {

    private Object value;

    private Types type;

    public SimVarValue(String value) {
        this.value = value;
        this.type = Types.STRING;
    }

    public SimVarValue(double value) {
        this.value = value;
        this.type = Types.DOUBLE;
    }

    public SimVarValue(boolean value) {
        this.value = value;
        this.type = Types.BOOLEAN;
    }

    @Override
    public Object asObject() {
        return this.value;
    }

    @Override
    public String asString() {
        return (String) this.value;
    }

    @Override
    public double asDouble() {
        return (double) this.value;
    }

    @Override
    public boolean asBool() {
        return (boolean) this.value;
    }

    @Override
    public Types getType() {
        return this.type;
    }
}
