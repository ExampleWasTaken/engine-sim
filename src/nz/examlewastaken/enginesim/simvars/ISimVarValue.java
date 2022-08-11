package nz.examlewastaken.enginesim.simvars;

/**
 * A value of a {@link ISimVar}.
 */
public interface ISimVarValue {
    Object asObject();
    String asString();
    double asDouble();
    boolean asBool();
    Types getType();

    enum Types {
        STRING,
        DOUBLE,
        BOOLEAN
    }
}
