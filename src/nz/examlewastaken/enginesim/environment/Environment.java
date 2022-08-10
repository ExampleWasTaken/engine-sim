package nz.examlewastaken.enginesim.environment;

import nz.examlewastaken.enginesim.base.Temperable;
import nz.examlewastaken.enginesim.base.Updatable;
import nz.examlewastaken.enginesim.components.Air;
import nz.examlewastaken.enginesim.visitors.environment.Host;
import nz.examlewastaken.enginesim.visitors.environment.Visitor;

public class Environment implements Host, Updatable, Temperable {

    private Air air;

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
    public void update() {

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
