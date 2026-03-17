package operationsLibrary;

public class TemperatureConverter 
{
	private static int baseAdd = 32;
	
	public static double CelciusToFahrenheit(double celcius) {
		
		// Formula for Celcius to Fahrenheit conversion
		// F = (C * 1.8) + 32
		// or
		// F = (C * (9/5)) + 32
		
		double result = (celcius * 1.8) + (baseAdd);
		return result;
	}
	
	public static double FahrenheitToCelcius(double fahrenheit) {

		// Formula for Fahrenheit to Celcius conversion
		// C = (F - 32) * (0.555556)
		// or
		// C = (F - 32) * (5/9)
		
		double result = (fahrenheit - baseAdd) * (0.555) + 0.01;
		return result;
	}

}
