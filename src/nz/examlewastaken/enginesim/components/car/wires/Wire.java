package nz.examlewastaken.enginesim.components.car.wires;

import nz.examlewastaken.enginesim.components.car.base.FemaleConnector;
import nz.examlewastaken.enginesim.components.car.base.IWire;
import nz.examlewastaken.enginesim.components.car.base.MaleConnector;
import nz.examlewastaken.enginesim.components.car.connectors.MaleAirMassFlowConnector;
import nz.examlewastaken.enginesim.components.car.ecus.Bus;

public class Wire implements IWire {

    private MaleConnector maleConnector;
    private FemaleConnector femaleConnector;

    public Wire(FemaleConnector femaleConnector) {
        this.femaleConnector = femaleConnector;
        this.maleConnector = new MaleAirMassFlowConnector(this);
    }

    @Override
    public void transmit(Bus data) {

    }

    @Override
    public Bus receive(Bus data) {
        return this.maleConnector.receive(data);
    }
}
