package nz.examlewastaken.enginesim.components.car.sensors;

import nz.examlewastaken.enginesim.components.car.base.Sensor;
import nz.examlewastaken.enginesim.components.car.ecus.Bus;

public class CrankPositionSensor extends Sensor {

    @Override
    public Bus getData(Bus data) {
        return data.setCrankPosition(this.measure());
    }

    @Override
    protected double measure() {
        return 87;
    }
}
