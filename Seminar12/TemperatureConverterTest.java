package Seminar12;

@FunctionalInterface
interface TemperatureConversion {
    double convert(double value);
}

public class TemperatureConverterTest {

    public static void main(String[] args) {
        // Display the table header
        System.out.printf("%-15s%-15s%-5s%-15s%-15s%n", "Celsius", "Fahrenheit", "|", "Fahrenheit","Celsius");

        TemperatureConversion celsiusToFahrenheit = celsius -> (9.0 / 5) * celsius + 32;
        TemperatureConversion fahrenheitToCelsius = fahrenheit -> (5.0 / 9) * (fahrenheit - 32);

        for (double celsius = 40, fahrenheit = 120; celsius >= 31; celsius--,fahrenheit-=10) {
            double convertedCelsius = celsiusToFahrenheit.convert(celsius);
            double convertedFahrenheit = fahrenheitToCelsius.convert(fahrenheit);
            System.out.printf("%-15.2f%-15.2f%-5s%-15.2f%-15.2f%n", celsius, convertedCelsius,"|", fahrenheit, convertedFahrenheit);
        }
    }
}
