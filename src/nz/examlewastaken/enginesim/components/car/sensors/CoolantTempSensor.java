package nz.examlewastaken.enginesim.components.car.sensors;

import nz.examlewastaken.enginesim.components.car.base.Sensor;
import nz.examlewastaken.enginesim.components.car.ecus.Bus;

public class CoolantTempSensor extends Sensor {

    @Override
    public Bus getData(Bus data) {
        return data.setCoolantTemperature(this.measure());
    }

    @Override
    protected double measure() {
        return 90;
    }
}
