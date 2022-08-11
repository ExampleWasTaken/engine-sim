package nz.examlewastaken.enginesim.environment;

import nz.examlewastaken.enginesim.base.Temperable;
import nz.examlewastaken.enginesim.base.Updatable;
import nz.examlewastaken.enginesim.components.Air;
import nz.examlewastaken.enginesim.simvars.SimVarStore;

public class Environment implements Updatable, Temperable {

    private final Air air;

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
        this.setTemperature((Double) SimVarStore.getSimVar("ENVIRONMENT_TEMP").getValue());
    }
}
