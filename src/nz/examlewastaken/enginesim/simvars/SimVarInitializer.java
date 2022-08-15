package nz.examlewastaken.enginesim.simvars;

public class SimVarInitializer {
    private SimVarInitializer() {};

    public static void init() {
        SimVarStore.setSimVar("ENVIRONMENT_TEMP", 20);
    }
}
