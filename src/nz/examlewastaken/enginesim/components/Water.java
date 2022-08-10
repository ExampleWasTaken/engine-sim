package nz.examlewastaken.enginesim.components;

import nz.examlewastaken.enginesim.base.Temperable;

public class Water implements Temperable {

    private double temp;

    public Water(double temp) {
        this.temp = temp;
    }

    @Override
    public double getTemperature() {
        return this.temp;
    }

    @Override
    public void setTemperature(double temp) {
        this.temp = temp;
    }
}
