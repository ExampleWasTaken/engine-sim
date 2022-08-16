package nz.examlewastaken.enginesim.components.car.base;

import nz.examlewastaken.enginesim.components.car.ecus.Bus;

public interface IBus {

    /**
     * Set the air mass field of the bus
     * @param airMass The new value.
     * @return The bus instance for convenience.
     */
    Bus setAirMass(double airMass);

    /**
     * Set the coolant temperature field of the bus.
     * @param coolantTemperature The new value.
     * @return The bus instance for convenience.
     */
    Bus setCoolantTemperature(double coolantTemperature);

    /**
     * Set the crank position field of the bus.
     * @param crankPosition The new value.
     * @return The bus instance for convenience.
     */
    Bus setCrankPosition(double crankPosition);

    /**
     * Set the engine RPM field of the bus.
     * @param engineRPM The new value.
     * @return The bus instance for convenience.
     */
    Bus setEngineRPM(double engineRPM);

    /**
     * Set the fuel pressure field of the bus.
     * @param fuelPressure The new value.
     * @return The bus instance for convenience.
     */
    Bus setFuelPressure(double fuelPressure);

    /**
     * Set the lambda 1 field of the bus.
     * @param lambdaOne The new value.
     * @return The bus instance for convenience.
     */
    Bus setLambdaOne(double lambdaOne);

    /**
     * Set the lambda 2 field of the bus.
     * @param lambdaTwo The new value.
     * @return The bus instance for convenience.
     */
    Bus setLambdaTwo(double lambdaTwo);

    /**
     * Set the throttle position field of the bus.
     * @param throttlePosition The new value.
     * @return The bus instance for convenience.
     */
    Bus setThrottlePosition(double throttlePosition);

    /**
     * Get the air mass stored in the bus.
     * @return The air mass.
     */
    double getAirMass();

    /**
     * Get the coolant temperature stored in the bus.
     * @return The coolant temperature.
     */
    double getCoolantTemperature();

    /**
     * Get the crank position stored in the bus.
     * @return The crank position.
     */
    double getCrankPosition();

    /**
     * Get the engine RPM stored in the bus.
     * @return The engine RPM.
     */
    double getEngineRPM();

    /**
     * Get the fuel pressure stored in the bus.
     * @return The fuel pressure.
     */
    double getFuelPressure();

    /**
     * Get the lambda 1 value stored in the bus.
     * @return The lambda 1 value.
     */
    double getLambdaOne();
    /**
     * Get the lambda 2 value stored in the bus.
     * @return The lambda 2 value.
     */
    double getLambdaTwo();

    /**
     * Get the throttle position stored in the bus.
     * @return The throttle position.
     */
    double getThrottlePosition();
}
