package operationsUnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TemperatureUnitTesting 
{

	@Test
	public void CtFTest() // Testing Celcius to Fahrenheit
	{
		
		double expectedOutput = 50.00; // Temp in Fahrenheit
		double celcius = 10.00;
		
		double actualResult = operationsLibrary.TemperatureConverter.CelciusToFahrenheit(celcius);
		
		assertEquals(expectedOutput, actualResult);
		
	}
	
	@Test
	public void FtCTest() // Testing Fahrenheit to Celcius
	{
		double expectedOutput = 10.00; // Temp in Celcius
		double fahrenheit = 50.00;
		
		double actualResult = operationsLibrary.TemperatureConverter.FahrenheitToCelcius(fahrenheit);
		
		assertEquals(expectedOutput, actualResult);
		
	}
	
}
