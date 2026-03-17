using System;

namespace OperationsApp
{
    class PerformTemperatureConversion
    {
        public void performCtF() // Celcius to Fahrenheit
        {
            while (true)
            {
                Console.Write("Enter the temperature in Celcius (°C): ");
                string convertingCelcius = Console.ReadLine();

                if (double.TryParse(convertingCelcius, out double celcius))
                {
                    double result = OperationsLibrary.TemperatureConverter.CtF(celcius);
                    Console.WriteLine("Your temperature, now in Fahrenheit: " + result + "°F");
                    break;
                }
                else
                {
                    Console.WriteLine("Input invalid. Please write a number for your input. (Can be in decimal)");
                    continue;
                }
            }
        }

        public void performFtC() // Fahrenheit to Celcius
        {
            while (true)
            {
                Console.Write("Enter the temperature in Fahrenheit (°F): ");
                string convertingFahrenheit = Console.ReadLine();

                if (double.TryParse(convertingFahrenheit, out double fahrenheit))
                {
                    double result = OperationsLibrary.TemperatureConverter.FtC(fahrenheit);
                    Console.WriteLine("Your temperature, now in Celcius: " + result + "°C");
                    break;
                }
                else
                {
                    Console.WriteLine("Input invalid. Please write a number for your input. (Can be in decimal)");
                    continue;
                }
            }
        }
    }
}
