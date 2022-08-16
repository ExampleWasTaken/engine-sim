package nz.examlewastaken.enginesim.components.car.sensors;

import nz.examlewastaken.enginesim.components.car.base.Sensor;
import nz.examlewastaken.enginesim.components.car.ecus.Bus;

public class AirMassFlowSensor extends Sensor {

    @Override
    public Bus getData(Bus data) {
        return data.setAirMass(this.measure());
    }

    @Override
    protected double measure() {
        // logic to measure - returns magic value for now
        return 4;
    }
}
