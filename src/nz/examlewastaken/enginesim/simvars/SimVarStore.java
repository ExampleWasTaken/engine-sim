package nz.examlewastaken.enginesim.simvars;

import java.util.ArrayList;

/**
 * Stores all SimVars.
 */
public class SimVarStore {

    private static final ArrayList<ISimVar> simVars = new ArrayList<>();

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
     * @throws Exception Thrown when value has a type other than {@link String}, {@link Double}, or {@link Boolean}. Primitives are valid.
     */
    public static void setSimVar(String name, String value) {
        setSimVar(new SimVar(name, value));
    }

    /**
     * Set a SimVar. This method uses {@link #setSimVar(ISimVar)} under the hood.
     * @param name The name of the SimVar.
     * @param value The value of the SimVar as double.
     * @throws Exception Thrown when value has a type other than {@link String}, {@link Double}, or {@link Boolean}. Primitives are valid.
     */
    public static void setSimVar(String name, double value) {
        setSimVar(new SimVar(name, value));
    }

    /**
     * Set a SimVar. This method uses {@link #setSimVar(ISimVar)} under the hood.
     * @param name The name of the SimVar.
     * @param value The value of the SimVar as boolean.
     * @throws Exception Thrown when value has a type other than {@link String}, {@link Double}, or {@link Boolean}. Primitives are valid.
     */
    public static void setSimVar(String name, boolean value) {
        setSimVar(new SimVar(name, value));
    }

    /**
     * Set a SimVar.
     * @param simVar A {@link ISimVar} instance.
     * @throws Exception Thrown when value has a type other than {@link String}, {@link Double}, or {@link Boolean}. Primitive are valid.
     */
    public static void setSimVar(ISimVar simVar) {
        for (ISimVar current : simVars) {
            if (current.equals(simVar)) {
                int indexOfCurrent = simVars.indexOf(current);
                if (simVar.getValue() instanceof String) {
                    simVars.get(indexOfCurrent).setValue((String) simVar.getValue());
                } else if (simVar.getValue() instanceof Double) {
                    simVars.get(indexOfCurrent).setValue((double) simVar.getValue());
                } else if (simVar.getValue() instanceof Boolean) {
                    simVars.get(indexOfCurrent).setValue((boolean) simVar.getValue());
                }
                return;
            }
        }
        simVars.add(simVar);
    }
}
