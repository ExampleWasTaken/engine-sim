package nz.examlewastaken.enginesim.components.car.ecus;

import nz.examlewastaken.enginesim.components.car.base.IBus;

public class Bus implements IBus {

    private double airMass;
    private double coolantTemp;
    private double crankPos;
    private double engineRPM;
    private double fuelPress;
    private double lambdaOne;
    private double lambdaTwo;
    private double throttlePos;

    @Override
    public Bus setAirMass(double airMass) {
        this.airMass = airMass;
        return this;
    }

    @Override
    public Bus setCoolantTemperature(double coolantTemperature) {
        this.coolantTemp = coolantTemperature;
        return this;
    }

    @Override
    public Bus setCrankPosition(double crankPosition) {
        this.crankPos = crankPosition;
        return this;
    }

    @Override
    public Bus setEngineRPM(double engineRPM) {
        this.engineRPM = engineRPM;
        return this;
    }

    @Override
    public Bus setFuelPressure(double fuelPressure) {
        this.fuelPress = fuelPressure;
        return this;
    }

    @Override
    public Bus setLambdaOne(double lambdaOne) {
        this.lambdaOne = lambdaOne;
        return this;
    }

    @Override
    public Bus setLambdaTwo(double lambdaTwo) {
        this.lambdaTwo = lambdaTwo;
        return this;
    }

    @Override
    public Bus setThrottlePosition(double throttlePosition) {
        this.throttlePos = throttlePosition;
        return this;
    }

    @Override
    public double getAirMass() {
        return this.airMass;
    }

    @Override
    public double getCoolantTemperature() {
        return this.coolantTemp;
    }

    @Override
    public double getCrankPosition() {
        return this.crankPos;
    }

    @Override
    public double getEngineRPM() {
        return this.engineRPM;
    }

    @Override
    public double getFuelPressure() {
        return this.fuelPress;
    }

    @Override
    public double getLambdaOne() {
        return this.lambdaOne;
    }

    @Override
    public double getLambdaTwo() {
        return this.lambdaTwo;
    }

    @Override
    public double getThrottlePosition() {
        return this.throttlePos;
    }
}
