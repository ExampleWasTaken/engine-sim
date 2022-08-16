package nz.examlewastaken.enginesim.components.car.connectors;

import nz.examlewastaken.enginesim.components.car.base.ECU;
import nz.examlewastaken.enginesim.components.car.base.FemaleConnector;
import nz.examlewastaken.enginesim.components.car.base.IWire;
import nz.examlewastaken.enginesim.components.car.ecus.Bus;
import nz.examlewastaken.enginesim.components.car.wires.Wire;

public class FemaleAirMassFlowConnector implements FemaleConnector {

    private final ECU ecu;
    private final IWire wire;

    public FemaleAirMassFlowConnector(ECU ecu) {
        this.ecu = ecu;
        this.wire = new Wire(this);
    }

    @Override
    public void transmit(Bus data) {

    }

    @Override
    public Bus receive(Bus data) {
        return this.wire.receive(data);
    }
}
