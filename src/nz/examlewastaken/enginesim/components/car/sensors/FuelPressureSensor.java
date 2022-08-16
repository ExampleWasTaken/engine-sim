package nz.examlewastaken.enginesim.components.car.sensors;

import nz.examlewastaken.enginesim.components.car.base.Sensor;
import nz.examlewastaken.enginesim.components.car.ecus.Bus;

public class FuelPressureSensor extends Sensor {

    @Override
    public Bus getData(Bus data) {
        return data.setFuelPressure(this.measure());
    }

    @Override
    protected double measure() {
        return 400;
    }
}
