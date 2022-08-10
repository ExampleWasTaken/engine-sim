package nz.examlewastaken.enginesim.components;

import nz.examlewastaken.enginesim.base.Temperable;

/**
 * Represents air with all needed properties.
 */
public class Air implements Temperable {

    private double temp;

    /**
     * @param temp Air temperature
     */
    public Air(double temp) {
        this.temp = temp;
    }

    /**
     * @return The temperature value of this instance.
     */
    @Override
    public double getTemperature() {
        return this.temp;
    }

    /**
     * @param temp The new temperature that should be applied to this instance.
     */
    @Override
    public void setTemperature(double temp) {
        this.temp = temp;
    }
}
