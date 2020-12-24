package com.company.problem22;

// Design a class DistanceConverter
//
// methods
// - convertMilesToMeters
// - convertMetersToMiles
// - convertInchToCentimeter
// - convertCentimeterToInch

public class Main {
    public static void main(String[] args) {

        DistanceConverter distanceConverter = new DistanceConverter();

        //Miles to Meters
        Mile mile = new Mile(10);
        Meter meter = distanceConverter.convertMilesToMeters(mile);
        System.out.println(mile.getTemperature() + " Mile = " + meter.getTemperature() + " Meter");

        //Meters to Miles
        Meter meter1 = new Meter(100);
        Mile mile1 = distanceConverter.convertMetersToMiles(meter1);
        System.out.println(meter1.getTemperature() + " Meter = " + mile1.getTemperature() + " Mile");

        //Inch to Centimeter
        Inch inch = new Inch(20);
        Centimeter centimeter = distanceConverter.convertInchToCentimeter(inch);
        System.out.println(inch.getTemperature() + " Inch = " + centimeter.getTemperature() + " Centimeter");

        //Centimeter to inch
        Centimeter centimeter1 = new Centimeter(200);
        Inch inch1 = distanceConverter.convertCentimeterToInch(centimeter1);
        System.out.println(centimeter1.getTemperature() + " Centimeter = " + inch1.getTemperature() + " Inch");
    }
}