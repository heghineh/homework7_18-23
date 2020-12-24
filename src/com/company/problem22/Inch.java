package com.company.problem22;

public class Inch {
    //region Properties
    private double temperature;
    //endregion

    //region Constructors
    Inch() {
    }

    public Inch(double temperature) {
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