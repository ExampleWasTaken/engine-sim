package nz.examlewastaken.enginesim.environment;

import nz.examlewastaken.enginesim.base.Temperable;
import nz.examlewastaken.enginesim.base.Updatable;
import nz.examlewastaken.enginesim.components.environment.Air;
import nz.examlewastaken.enginesim.simvars.SimVarStore;

public class Environment implements Updatable, Temperable {

    private final Air air;

    private long lastUpdate;

    public Environment(double airTemp) {
        this.air = new Air(airTemp);
    }

    public double getTemperature() {
        return this.air.getTemperature();
    }

    public void setTemperature(double temp) {
        this.air.setTemperature(temp);
    }

    @Override
    public void update(int deltaTime) {
        if (!shouldUpdate(lastUpdate, 30)) {
            return;
        }

        //noinspection ConstantConditions
        this.setTemperature(SimVarStore.getSimVar("ENVIRONMENT_TEMP").getValue().asDouble());

        lastUpdate = System.nanoTime();
    }
}
