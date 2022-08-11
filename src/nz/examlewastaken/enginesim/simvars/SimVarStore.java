package nz.examlewastaken.enginesim.simvars;

import java.util.ArrayList;

/**
 * Stores all SimVars.
 */
public class SimVarStore {

    private static final ArrayList<ISimVar> simVars = new ArrayList<>();

    private SimVarStore() {}

    /**
     * Get a SimVar by its name.
     * @param name The name of the SimVar.
     * @return {@code null} if the SimVar does not exist.
     */
    public static ISimVar getSimVar(String name) {
        for (ISimVar current : simVars) {
            if (current.getName().equals(name)) {
                return current;
            }
        }
        return null;
    }

    /**
     * Set a SimVar. This method uses {@link #setSimVar(ISimVar)} under the hood.
     * @param name The name of the SimVar.
     * @param value The value of the SimVar as string.
     */
    public static void setSimVar(String name, String value) {
        setSimVar(new SimVar(name, value));
    }

    /**
     * Set a SimVar. This method uses {@link #setSimVar(ISimVar)} under the hood.
     * @param name The name of the SimVar.
     * @param value The value of the SimVar as double.
     */
    public static void setSimVar(String name, double value) {
        setSimVar(new SimVar(name, value));
    }

    /**
     * Set a SimVar. This method uses {@link #setSimVar(ISimVar)} under the hood.
     * @param name The name of the SimVar.
     * @param value The value of the SimVar as boolean.
     */
    public static void setSimVar(String name, boolean value) {
        setSimVar(new SimVar(name, value));
    }

    /**
     * Set a SimVar.
     * @param simVar A {@link ISimVar} instance.
     */
    public static void setSimVar(ISimVar simVar) {
        for (ISimVar current : simVars) {
            if (current.equals(simVar)) {
                int indexOfCurrent = simVars.indexOf(current);

                switch (simVar.getValue().getType()) {
                    case STRING -> simVars.get(indexOfCurrent).setValue(simVar.getValue().asString());
                    case DOUBLE -> simVars.get(indexOfCurrent).setValue(simVar.getValue().asDouble());
                    case BOOLEAN -> simVars.get(indexOfCurrent).setValue(simVar.getValue().asBool());
                }
                return;
            }
        }
        simVars.add(simVar);
    }
}
