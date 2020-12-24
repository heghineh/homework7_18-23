package com.company.problem22;

public class Meter {
    //region Properties
    private double temperature;
    //endregion

    //region Constructors
    Meter() {
    }

    public Meter(double temperature) {
        this.temperature = temperature;
    }
    //endregion

    //region Getters and Setters
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    //endregion
}