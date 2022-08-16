package nz.examlewastaken.enginesim.components.car.sensors;

import nz.examlewastaken.enginesim.components.car.base.Sensor;
import nz.examlewastaken.enginesim.components.car.ecus.Bus;

public class LambdaTwoSensor extends Sensor {

    @Override
    public Bus getData(Bus data) {
        return data.setLambdaTwo(this.measure());
    }

    @Override
    protected double measure() {
        return 0.500;
    }
}
