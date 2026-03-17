package operationsApplication;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.InputStreamReader;

public class PerformTemperatureConversion 
{	
	
	Scanner sc1 = new Scanner(System.in);
	
	// if this was in the loop, it will need a closer and the 
	// program will terminate early
	// if there was a closer,
	// it will give an exception of "NoSuchElement"
		
	public void performCtF() // Celcius to Fahrenheit
	{
		while(true) 
		{
			
			try 
			{	
				System.out.print("Enter the temperature in Celcius (°C): ");
				double celcius = sc1.nextDouble();
				
				double result = operationsLibrary.TemperatureConverter.CelciusToFahrenheit(celcius);
				System.out.print("Your temperature, now in Fahrenheit: " + result + "°F");
				
				break;
			}
			
			catch(InputMismatchException e) 
			{
				System.out.print("Input invalid. Please write a number for your input. (Can be in decimal)");
				continue;
			}
		}
	}
	
	public void performFtC() // Fahrenheit to Celcius
	{
		while(true) 
		{
			Scanner sc2 = new Scanner(System.in);
			
			try 
			{	
				System.out.print("Enter the temperature in Fahrenheit (°F): ");
				
				if(sc2.hasNextDouble()) 
				{
					double fahrenheit = sc2.nextDouble();
					
					double result = operationsLibrary.TemperatureConverter.FahrenheitToCelcius(fahrenheit);
					System.out.print("Your temperature, now in Celcius: " + result + "°C");
				}
				
				sc2.close();
				break;
			}
			catch(InputMismatchException e) 
			{
				System.out.print("Input invalid. Please write a number for your input. (Can be in decimal)");
				continue;
			}
		}
	}
	
}
