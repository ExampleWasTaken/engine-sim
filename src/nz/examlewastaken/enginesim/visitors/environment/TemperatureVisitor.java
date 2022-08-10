package nz.examlewastaken.enginesim.visitors.environment;

import nz.examlewastaken.enginesim.base.Temperable;
import nz.examlewastaken.enginesim.environment.Environment;
import nz.examlewastaken.enginesim.simvars.SimVarStore;

public class TemperatureVisitor implements Visitor {

    private Temperable temp;

    public TemperatureVisitor(Temperable temp) {
        this.temp = temp;
    }

    @Override
    public void visit(Environment environment) {
        SimVarStore.setSimVar("ENVIRONMENT_TEMP", temp.getTemperature());
    }
}
