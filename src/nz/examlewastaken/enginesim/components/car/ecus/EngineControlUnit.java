package nz.examlewastaken.enginesim.components.car.ecus;

import nz.examlewastaken.enginesim.components.car.base.ECU;
import nz.examlewastaken.enginesim.components.car.base.FemaleConnector;
import nz.examlewastaken.enginesim.components.car.connectors.FemaleAirMassFlowConnector;

/**
 * The engine control unit of the car. <br>
 * It controls everything related to engine:
 * <li>Monitors the sensors</li>
 * <li>Controls ignition</li>
 * <li>etc.</li>
 */
public class EngineControlUnit implements ECU {

    private double airMass;
    private double coolantTemp;
    private double crankPos;
    private double engineRPM;
    private double fuelPressure;
    private double lambdaOne;
    private double lambdaTwo;
    private double throttlePos;

    private Bus bus;

    private final FemaleConnector airMassConn;
    /*private final FemaleConnector coolantTempConn;
    private final FemaleConnector crankPosConn;
    private final FemaleConnector engineRPMConn;
    private final FemaleConnector fuelPressConn;
    private final FemaleConnector lambdaOneConn;
    private final FemaleConnector lambdaTwoConn;
    private final FemaleConnector throttlePosConn;*/

    private EngineControlUnit() {
        this.bus = new Bus();

        this.airMassConn = new FemaleAirMassFlowConnector(this);
        /*this.coolantTempConn = new FemaleConnector();
        this.crankPosConn = new FemaleConnector();
        this.engineRPMConn = new FemaleConnector();
        this.fuelPressConn = new FemaleConnector();
        this.lambdaOneConn = new FemaleConnector();
        this.lambdaTwoConn = new FemaleConnector();
        this.throttlePosConn = new FemaleConnector();*/
    }

    @Override
    public void update(int deltaTime) {
        this.input(this.bus);
    }

    @Override
    public void input(Bus data) {

    }

    @Override
    public void output() {

    }

    @Override
    public Bus getData(Bus data) {
        return null;
    }
}
