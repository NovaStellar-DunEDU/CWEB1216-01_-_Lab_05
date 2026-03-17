package operationsApplication;

import operationsApplication.PerformTemperatureConversion;

public class TemperatureApp 
{
	
	public static void main(String[] args) 
	{
		
		System.out.println("--------- TEMPERATURE CONVERSION APP ---------\n");
		
		System.out.println("CELCIUS TO FAHRENHEIT");
		PerformTemperatureConversion operation1 = new PerformTemperatureConversion();
		operation1.performCtF();
		
		System.out.println("\n\n----------------------------------------------");
		
		System.out.println("\nFAHRENHEIT TO CELCIUS");
		operation1.performFtC();
	}
	
}
