namespace OperationsLibrary
{
    public class TemperatureConverter
    {

        private static int baseAdd = 32;

        public static double CtF(double celcius)
        {
            double result = (celcius * 1.8) + (baseAdd);
            return result;
        }

        public static double FtC(double fahrenheit)
        {
            double result = (fahrenheit - baseAdd) * 0.555;
            return result;
        }

    }
}
