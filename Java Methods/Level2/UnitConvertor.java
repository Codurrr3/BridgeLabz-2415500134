/*
Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertKmToMiles(double km) => 
Method To convert kilometers to miles and return the value. Use the following code  double km2miles = 0.621371;
Method to convert miles to kilometers and return the value. Use the following code  double miles2km = 1.60934;
Method to convert meters to feet and return the value. Use the following code to convert  double meters2feet = 3.28084;
Method to convert feet to meters and return the value. Use the following code to convert  double feet2meters = 0.3048;
Method to convert yards to feet and return the value. Use following code to convert  double yards2feet = 3;
Method to convert feet to yards and return the value. Use following code to convert  double feet2yards = 0.333333;
Method to convert meters to inches and return the value. Use following code to convert  double meters2inches = 39.3701;
Method to convert inches to meters and return the value. Use following code to convert  double inches2meters = 0.0254;
Method to convert inches to centimeters and return the value. Use the following code  double inches2cm = 2.54;
Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462; 
Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541; 
Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172; 
*/
public class UnitConvertor {
    public static double convertKmToMiles(double km) { return km * 0.621371; }
    public static double convertMilesToKm(double miles) { return miles * 1.60934; }
    public static double convertMetersToFeet(double meters) { return meters * 3.28084; }
    public static double convertFeetToMeters(double feet) { return feet * 0.3048; }
    public static double convertYardsToFeet(double yards) { return yards * 3; }
    public static double convertFeetToYards(double feet) { return feet * 0.333333; }
    public static double convertMetersToInches(double meters) { return meters * 39.3701; }
    public static double convertInchesToMeters(double inches) { return inches * 0.0254; }
    public static double convertInchesToCm(double inches) { return inches * 2.54; }
    public static double convertFarhenheitToCelsius(double farhenheit) { return (farhenheit - 32) * 5 / 9; }
    public static double convertCelsiusToFarhenheit(double celsius) { return (celsius * 9 / 5) + 32; }
    public static double convertPoundsToKilograms(double pounds) { return pounds * 0.453592; }
    public static double convertKilogramsToPounds(double kg) { return kg * 2.20462; }
    public static double convertGallonsToLiters(double gallons) { return gallons * 3.78541; }
    public static double convertLitersToGallons(double liters) { return liters * 0.264172; }
}
