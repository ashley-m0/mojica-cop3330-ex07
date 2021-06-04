package oop.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest 
{
    @Test
    public void include_correct_calculations(){
        App myApp = new App();
        String lengthString = "15";
        String widthString = "20";
        double feetConversion = 1.0;
        double metersConversion = 0.09290304;

        double length = myApp.convertStringToDouble(lengthString);
        double width = myApp.convertStringToDouble(widthString);

        double areaInFeet = myApp.getArea(length, width, feetConversion);
        String areaInFeetString = String.format("%.0f", areaInFeet);
        double areaInMeters = myApp.getArea(length, width, metersConversion);
        String areaInMetersString = String.format("%.3f", areaInMeters);

        String actualMessage = myApp.generateMessage(lengthString, widthString, areaInFeetString, areaInMetersString);
        String expectedMessage = "You entered dimensions of 15 feet by 20 feet.\n" +
                "The area is\n" +
                "300 square feet\n" +
                "27.871 square meters";

        assertEquals(expectedMessage, actualMessage);
    }
}
