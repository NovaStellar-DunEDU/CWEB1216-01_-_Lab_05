using System;

using static OperationsApp.PerformTemperatureConversion;

namespace OperationsApp
{
    class TemperatureApp
    {
        static void Main(string[] args)
        {
            Console.WriteLine("--------- TEMPERATURE CONVERSION APP ---------\n");

            Console.WriteLine("CELCIUS TO FAHRENHEIT");
            PerformTemperatureConversion operation1 = new PerformTemperatureConversion();
            operation1.performCtF();

            Console.WriteLine("\n----------------------------------------------");

            Console.WriteLine("\nFAHRENHEIT TO CELCIUS");
            operation1.performFtC();

            Console.WriteLine("\n----------------------------------------------");
        }
    }
}
