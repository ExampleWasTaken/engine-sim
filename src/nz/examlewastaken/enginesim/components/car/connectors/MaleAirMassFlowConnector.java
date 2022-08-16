package nz.examlewastaken.enginesim.components.car.connectors;

import nz.examlewastaken.enginesim.components.car.base.DataProvider;
import nz.examlewastaken.enginesim.components.car.base.IWire;
import nz.examlewastaken.enginesim.components.car.base.MaleConnector;
import nz.examlewastaken.enginesim.components.car.ecus.Bus;
import nz.examlewastaken.enginesim.components.car.sensors.AirMassFlowSensor;
import nz.examlewastaken.enginesim.components.car.wires.Wire;

public class MaleAirMassFlowConnector implements MaleConnector {

    private final IWire wire;
    private final DataProvider dataProvider;

    public MaleAirMassFlowConnector(IWire wire) {
        this.wire = wire;
        this.dataProvider = new AirMassFlowSensor();
    }

    @Override
    public void transmit(Bus data) {

    }

    @Override
    public Bus receive(Bus data) {
        dataProvider.getData(data);
        return data;
    }
}
