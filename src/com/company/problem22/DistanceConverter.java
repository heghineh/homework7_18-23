package com.company.problem22;

public class DistanceConverter {

    public Meter convertMilesToMeters(Mile mile) {
        Meter meter = new Meter(mile.getTemperature() * 1609.34);
        return meter;
    }

    public Mile convertMetersToMiles(Meter meter) {
        Mile mile = new Mile(meter.getTemperature() * 0.000621371);
        return mile;
    }

    public Centimeter convertInchToCentimeter(Inch inch) {
        Centimeter centimeter = new Centimeter(inch.getTemperature() * 2.54);
        return centimeter;
    }

    public Inch convertCentimeterToInch(Centimeter centimeter) {
        Inch inch = new Inch(centimeter.getTemperature() * 0.393701);
        return inch;
    }
}