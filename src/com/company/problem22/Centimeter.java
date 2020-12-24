package com.company.problem22;

public class Centimeter {
    //region Properties
    private double temperature;
    //endregion

    //region Constructors
    Centimeter() {
    }

    public Centimeter(double temperature) {
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